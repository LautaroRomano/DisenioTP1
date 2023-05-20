package controllers;

import javax.swing.JOptionPane;
import models.UserModel;

public class LoginController {
    
    // creamos un array de usuarios
    DataManager dataManager = DataManager.getInstance();
    
    public UserModel validate(String correo, String pass) {
        for (UserModel user : dataManager.getUsers()) {
            if ((correo.equals(user.getCorreoElectronico()) || (correo+"@email.com").equals(user.getCorreoElectronico())) && pass.equals(user.getContrasenia())) {
                dataManager.addUserLogin(user);
                return user;
            }
        }
        JOptionPane.showMessageDialog(null, "Correo o Contraseña incorrecta _ Ingrese nuevamente");
        return null;
    }
    
}
