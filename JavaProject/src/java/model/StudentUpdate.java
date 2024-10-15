/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import dto.StudentDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class StudentUpdate {
    public boolean updated(StudentDTO student){
        String query = "UPDATE student SET studentName=?, studentAddress=?, studentContact=?, studentCity=?, studentDepartment=? WHERE studentID=?";
        String updateStudent = "UPDATE college SET username = ? WHERE id = ? and role = 'Student'";
        
        try{
            PreparedStatement pst = DatabaseConnector.getConnection().prepareStatement(query);
            PreparedStatement college = DatabaseConnector.getConnection().prepareStatement(updateStudent);

            System.out.println("Before: ");
            pst.setString(1, student.getStudentName());
            pst.setString(2, student.getStudentAddress());
            pst.setString(3, student.getStudentContact());
            pst.setString(4, student.getStudentCity());
            pst.setString(5, student.getStudentDepartment());
            pst.setString(6, student.getStudentID());
            
            college.setString(1, student.getStudentName());
            college.setString(2, student.getStudentID());
            
            System.out.println(query);
            
            int i = pst.executeUpdate();
            int j = college.executeUpdate();
            
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
