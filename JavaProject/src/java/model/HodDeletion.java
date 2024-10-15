/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class HodDeletion {
    public static boolean delete(String hodID){
        String query = "DELETE FROM hod WHERE hodid = '"+hodID+"'";
        String deleteCollege = "DELETE FROM college WHERE id = '"+hodID+"' and role = 'Hod'";
        try{
            int i = DatabaseConnector.getStatement().executeUpdate(query);
            int j = DatabaseConnector.getStatement().executeUpdate(deleteCollege);
            
            if(j > 0){
                if(i > 0){
                    return true;
                }
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}
