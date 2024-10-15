package dao;

import db.DatabaseConnector;
import dto.FacultyDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class FacultyDAO {
    public FacultyDTO getFacultyData(String facultyID){
        String query = "SELECT * FROM faculty WHERE facultyid = "+ facultyID +"";
        FacultyDTO faculty = new FacultyDTO();
        try{
            ResultSet rs = DatabaseConnector.getStatement().executeQuery(query);
            
            if(rs.next())
            {
                faculty.setFacultyName(rs.getString(2));
                faculty.setFacultyAddress(rs.getString(3));
                faculty.setFacultyContact(rs.getString(4));
                faculty.setFacultyCity(rs.getString(5));
                faculty.setFacultyDepartment(rs.getString(6));
                return faculty;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
