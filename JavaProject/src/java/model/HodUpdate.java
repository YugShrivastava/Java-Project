/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import dto.HODDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class HodUpdate {
    public boolean updated(HODDTO hod){
        String query = "UPDATE hod SET hodName=?, hodAddress=?, hodContact=?, hodCity=?, hodDepartment=? WHERE hodID=?";
        String updateHod = "UPDATE college SET username = ? WHERE id = ? and role = 'Hod'";

        try{
            PreparedStatement pst = DatabaseConnector.getConnection().prepareStatement(query);
            PreparedStatement college = DatabaseConnector.getConnection().prepareStatement(updateHod);
            
            System.out.println("Before: ");
            pst.setString(1, hod.getHodName());
            pst.setString(2, hod.getHodAddress());
            pst.setString(3, hod.getHodContact());
            pst.setString(4, hod.getHodCity());
            pst.setString(5, hod.getHodDepartment());
            pst.setString(6, hod.getHodID());
            
            college.setString(1, hod.getHodName());
            college.setString(2, hod.getHodID());
            
            System.out.println(query);
            
            int j = college.executeUpdate();
            int i = pst.executeUpdate();
            
            if(j > 0){
                if(i>0)
                {
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
