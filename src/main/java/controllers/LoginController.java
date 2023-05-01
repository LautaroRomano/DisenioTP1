package controllers;

import javax.swing.JOptionPane;
import models.User;
import views.SystemMain;

public class LoginController {
    
    // creamos un array de usuarios
    User[] users = {
        new User("1234","usuario0","usuario0","admin","admin","admin"),
        new User("5678","usuario1","apellido1","usuario1@gmail.com","normal","1234"),
        new User("9101","usuario2","apellido2","usuario2@gmail.com","normal","abcd")
    };
    
    public Boolean validate(String correo, String pass) {
        for (User user : users) {
            if (correo.equals(user.getCorreoElectronico()) && pass.equals(user.getContrasenia())) {
                SystemMain sis = new SystemMain();
                sis.setVisible(true);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Correo o Contraseña incorrecta _ Ingrese nuevamente");
        return false;
    }
    
}
