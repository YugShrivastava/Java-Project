package model;

import db.DatabaseConnector;
import dto.FacultyDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class FacultyRegistration {
    public boolean isRegister(FacultyDTO faculty){
        try
        {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO faculty VALUES (?,?,?,?,?,?,?)");
            PreparedStatement insertCollege = con.prepareStatement("INSERT INTO college VALUES(?, ?, ?, ?, ?)");
            
            pst.setString(1, faculty.getFacultyID());
            pst.setString(2, faculty.getFacultyName());
            pst.setString(3, faculty.getFacultyAddress());
            pst.setString(4, faculty.getFacultyCity());
            pst.setString(5, faculty.getFacultyContact());
            pst.setString(6, faculty.getFacultyDepartment());
            pst.setString(7, faculty.getFacultyPassword());
            
            insertCollege.setString(1, SetNewID.newID("college"));
            insertCollege.setString(2, faculty.getFacultyID());
            insertCollege.setString(3, faculty.getFacultyName());
            insertCollege.setString(4, faculty.getFacultyPassword());
            insertCollege.setString(5, "Faculty");
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
