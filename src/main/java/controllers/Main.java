package controllers;

import models.User;
import views.Login;
import controllers.SystemMainController;

public class Main {

    public static void main(String args[]) {
        Login login = new Login();
        login.setVisible(true);

        // Esperar a que el usuario inicie sesión
        while (!login.isAuthenticated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Obtener los datos del usuario autenticado
        User user = login.getUserAuthenticated();
        System.out.println("Bienvenido, " + user.getNombres() + " " + user.getApellidos());
        
        SystemMainController sis = new SystemMainController();
        sis.viewSystemMain();
    }
}
