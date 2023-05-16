/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.SystemMainView;

/**
 *
 * @author Lau
 */
public class SystemMainController {
    public void viewSystemMain(){
        SystemMainView view = new SystemMainView();
        view.setVisible(true);
    }
}
