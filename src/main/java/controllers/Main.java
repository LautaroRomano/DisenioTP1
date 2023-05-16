package controllers;

import models.UserModel;
import views.LoginView;
import controllers.SystemMainController;

public class Main {

    public static void main(String args[]) {
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}
