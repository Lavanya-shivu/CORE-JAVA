package com.xworkz.metro.repository;

import com.xworkz.metro.dto.MetroDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MetroRepositoryImpl implements MetroRepository {
    @Override
    public String persist(MetroDto metroDto) {
        System.out.println("Persist running in MetroDto");
        if (metroDto != null) {
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "Lavanya@15";

            //Step 1 Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

//Step 2 Create the Connection
                Connection connection = DriverManager.getConnection(url, username, password);

                //Step 3 Prepare the Statement
                String sql = "insert into metro_application values(0,'"
                        + metroDto.getName() + "','"
                        + metroDto.getDateAndTime() + "','"
                        + metroDto.getFrom() + "','"
                        + metroDto.getTo() + "',"
                        + metroDto.getNoOfTickets() + ",'"
                        + metroDto.getStudent() + "')";

                Statement statement = connection.createStatement();

//Step 4 execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return "Success";
    }
}