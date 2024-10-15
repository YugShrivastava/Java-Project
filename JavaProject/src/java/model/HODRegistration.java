package model;

import db.DatabaseConnector;
import dto.HODDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class HODRegistration {
    public boolean isRegister(HODDTO hod){
        try
        {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO hod VALUES (?,?,?,?,?,?,?)");
            PreparedStatement insertCollege = con.prepareStatement("INSERT INTO college VALUES(?, ?, ?, ?, ?)");
            
            pst.setString(1, hod.getHodID());
            pst.setString(2, hod.getHodName());
            pst.setString(3, hod.getHodAddress());
            pst.setString(4, hod.getHodCity());
            pst.setString(5, hod.getHodContact());
            pst.setString(6, hod.getHodDepartment());
            pst.setString(7, hod.getHodPassword());
            
            insertCollege.setString(1, SetNewID.newID("college"));
            insertCollege.setString(2, hod.getHodID());
            insertCollege.setString(3, hod.getHodName());
            insertCollege.setString(4, hod.getHodPassword());
            insertCollege.setString(5, "Hod");
            
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
