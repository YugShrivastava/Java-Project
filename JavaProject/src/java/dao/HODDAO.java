package dao;

import db.DatabaseConnector;
import dto.HODDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class HODDAO {
    public HODDTO getHodData(String hodID){
        String query = "SELECT * FROM hod WHERE hodid = "+ hodID +"";
        HODDTO hod = new HODDTO();
        try{
            ResultSet rs = DatabaseConnector.getStatement().executeQuery(query);
            
            if(rs.next())
            {
                hod.setHodName(rs.getString(2));
                hod.setHodAddress(rs.getString(3));
                hod.setHodContact(rs.getString(4));
                hod.setHodCity(rs.getString(5));
                hod.setHodDepartment(rs.getString(6));
                return hod;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
