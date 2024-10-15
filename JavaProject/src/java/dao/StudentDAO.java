package dao;

import db.DatabaseConnector;
import dto.StudentDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class StudentDAO {
    public StudentDTO getStudentData(String studentID){
        String query = "SELECT * FROM student WHERE studentid = "+ studentID +"";
        StudentDTO student = new StudentDTO();
        try{
            ResultSet rs = DatabaseConnector.getStatement().executeQuery(query);
            
            if(rs.next())
            {
                student.setStudentName(rs.getString(2));
                student.setStudentAddress(rs.getString(3));
                student.setStudentContact(rs.getString(4));
                student.setStudentCity(rs.getString(5));
                student.setStudentDepartment(rs.getString(6));
                return student;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}

