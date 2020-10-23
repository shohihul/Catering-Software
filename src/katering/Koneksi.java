/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ggnryr
 */
public class Koneksi {
    String username = "root";
    String password = "root";
    String dbms = "mysql";
    String serverName = "localhost";
    String portNumber = "8889";
    String dbName = "katering";
    
    public Connection getKoneksi() throws SQLException{
        Connection con = null;
        Properties prop = new Properties();
        prop.put("user", this.username);
        prop.put("password", this.password);
        
        
        con = (Connection) DriverManager.getConnection("jdbc:"+this.dbms+"://"+
                this.serverName+":"+this.portNumber+"/"+this.dbName, prop);
        
        System.out.println("DB connected");
        return con;
        
    }
}
