/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import katering.Koneksi;

/**
 *
 * @author ggnryr
 */
public class UserModel {
    Connection con;
    
    public UserModel() throws SQLException{
        con = new Koneksi().getKoneksi();
    }
    
    public int login(String username, String password){
        String sql = "SELECT id FROM user WHERE username=? AND password=?";
        int cek=0;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                cek = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            ex.getMessage();
        }
        
        return cek;
    }
}
