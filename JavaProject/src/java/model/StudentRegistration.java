/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import dto.StudentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class StudentRegistration {
    public boolean isRegister(StudentDTO student){
        try
        {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?,?)");
            PreparedStatement insertCollege = con.prepareStatement("INSERT INTO college VALUES(?, ?, ?, ?, ?)");
            
            pst.setString(1, student.getStudentID());
            pst.setString(2, student.getStudentName());
            pst.setString(3, student.getStudentAddress());
            pst.setString(4, student.getStudentCity());
            pst.setString(5, student.getStudentContact());
            pst.setString(6, student.getStudentDepartment());
            pst.setString(7, student.getStudentPassword());
            
            insertCollege.setString(1, SetNewID.newID("college"));
            insertCollege.setString(2, student.getStudentID());
            insertCollege.setString(3, student.getStudentName());
            insertCollege.setString(4, student.getStudentPassword());
            insertCollege.setString(5, "Student");
            
            int j = insertCollege.executeUpdate();
            if(j > 0){
                int i = pst.executeUpdate();
                if(i>0)
                {
                    return true;
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
