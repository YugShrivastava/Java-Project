/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author YUG
 */
public class StudentDeletion {
    public static boolean delete(String studentID){
        boolean f = false;
        
        try{
            Statement st = DatabaseConnector.getStatement();
            String query = "DELETE FROM student WHERE studentid = '"+studentID+"'";
            String deleteCollege = "DELETE FROM college WHERE id = '"+studentID+"' and role = 'Student'";
            
            int i = st.executeUpdate(query);
            int j = st.executeUpdate(deleteCollege);
            
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
