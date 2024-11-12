package bank.management.system;

import java.sql.*;


public class Connect {
    Connection connection;
    static Statement statement;
    public Connect(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","root");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
