/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DatabaseConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author YUG
 */
public class LoginAuthenticator {
    public boolean isLogin(UserDTO dto){
        String username = dto.getUsername();
        String query = "Select password, role From college Where username = '"+username+"'";
        try{
            ResultSet rs = DatabaseConnector.getStatement().executeQuery(query);
            System.out.println(query);
            if(rs.next() && rs.getString(1).equals(dto.getPassword())){
                dto.setRole(rs.getString(2));
                return true;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}
