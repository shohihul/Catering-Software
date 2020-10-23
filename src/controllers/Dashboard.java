/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author ggnryr
 */
public class Dashboard {
    views.Dashboard vDashboard;
    
    public Dashboard(){
        this.vDashboard = new views.Dashboard();
        this.vDashboard.setVisible(true);
    }
}
