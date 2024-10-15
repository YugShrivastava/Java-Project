/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author YUG
 */
public class SetNewID {
    public static String newID(String tableName){
        String newid = "";
        int id;
        try{
            Statement st = DatabaseConnector.getStatement();
            String query = "SELECT * FROM " + tableName + "";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                newid = rs.getString(1);
            }
            id = Integer.parseInt(newid);
            id++;
            newid = String.valueOf(id);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return newid;
    }
}