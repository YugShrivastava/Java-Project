/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author YUG
 */
public class FacultyDeletion {
    public static boolean delete(String facultyID){
        boolean f = false;
        
        try{
            Statement st = DatabaseConnector.getStatement();
            String query = "DELETE FROM faculty WHERE facultyid = '"+facultyID+"'";
            String deleteCollege = "DELETE FROM college WHERE id = '"+facultyID+"' and role = 'Faculty'";
            
            int j = st.executeUpdate(deleteCollege);
            int i = st.executeUpdate(query);
            if(j > 0){
                if(i > 0){
                    f = true;
                }
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return f;
    }
}
