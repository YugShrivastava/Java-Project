/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import dto.FacultyDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class FacultyUpdate {
    public boolean updated(FacultyDTO faculty){
        String query = "UPDATE faculty SET facultyName=?, facultyAddress=?, facultyContact=?, facultyCity=?, facultyDepartment=? WHERE facultyID=?";
        String updateCollege = "UPDATE college SET username = ? WHERE id = ? and role = 'Faculty'";
        
        try{
            PreparedStatement pst = DatabaseConnector.getConnection().prepareStatement(query);
            PreparedStatement college = DatabaseConnector.getConnection().prepareStatement(updateCollege);

            System.out.println("Before: ");
            pst.setString(1, faculty.getFacultyName());
            pst.setString(2, faculty.getFacultyAddress());
            pst.setString(3, faculty.getFacultyContact());
            pst.setString(4, faculty.getFacultyCity());
            pst.setString(5, faculty.getFacultyDepartment());
            pst.setString(6, faculty.getFacultyID());
            
            college.setString(1, faculty.getFacultyName());
            college.setString(2, faculty.getFacultyID());
            
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
