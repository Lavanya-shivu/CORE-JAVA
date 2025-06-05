package runner;

import java.sql.SQLException;

public class DatabaseExceptionRunner {
    public static void main(String[] args) throws SQLException{
        boolean isConnectionFailed = true;

        if(isConnectionFailed){
            throw new SQLException("Error Connection failed");
        }
        else {
            System.out.println("Database Connection Successful");
        }
    }
}
