package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnector {
    static Connection con = null;
    static Statement st = null;    
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProject", "root", "root");
            System.out.println("Connected");
            
            st = con.createStatement();
        }
        catch(SQLException e){
            System.out.println("SQLException in DatabaseConnector.java");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found Exception in DatabaseConnector.java");
        }
    }
    
    public static Statement getStatement(){
        return st;
    }
    public static Connection getConnection(){
        return con;
    }
}
