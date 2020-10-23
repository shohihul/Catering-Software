/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.UserModel;
import views.Login;

/**
 *
 * @author ggnryr
 */
public class User {
    Login vLogin;
    UserModel mUser;
 
    public User(Login vLogin, UserModel mUser){
        this.vLogin = vLogin;
        this.mUser = mUser;
        
        this.vLogin.setVisible(true);
        this.vLogin.login(new klikLogin());
    }

    private class klikLogin implements ActionListener {

        public klikLogin() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = vLogin.getUsername();
            String password = vLogin.getPassword();
            
            int id = mUser.login(username, password);
            if (id > 0) {
                new Dashboard();
                vLogin.dispose();
            } else {
                JOptionPane.showMessageDialog(vLogin, "Username atau Password Salah");
            }
        }
    }
    
    
}
