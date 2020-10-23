/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katering;

import controllers.User;
import java.sql.SQLException;
import models.UserModel;
import views.Login;

/**
 *
 * @author ihul
 */
public class Katering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        new User(new Login(),new UserModel());
    }
    
}
