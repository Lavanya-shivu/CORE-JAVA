package com.xworkz.duster.repository;

import com.xworkz.duster.dto.DusterDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class DusterRepoImpl implements DusterRepo{
    @Override
    public boolean persist(DusterDto dusterDto) {
        System.out.println("Running persist in DusterRepoImpl");
        if (dusterDto != null) {
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "Lavanya@15";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, username, password);

                String sql = "insert into duster values (0,'"+ dusterDto.getMaterial()+"','"+ dusterDto.getColor()+"',"+ dusterDto.getCost()+",'"+ dusterDto.getDateOfManufac()+"',"+ dusterDto.getQuantity()+",'"+ dusterDto.getIsUseful()+"');";
                Statement statement = connection.createStatement();

                statement.executeUpdate(sql);
            }
            catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
            return true;
        }
        return false;
    }
    @Override
    public Optional<DusterDto> findById (int id){
        System.out.println("Running findBy in DusterRepoImpl");
        return DusterRepo.super.findById(id);
    }
}
