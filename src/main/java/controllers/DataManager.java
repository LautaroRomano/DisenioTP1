/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import models.ColorModel;
import models.UserModel;

/**
 *
 * @author Lau
 */
public class DataManager {

    private static DataManager instance = null;
    private List<ColorModel> colors;
    private List<UserModel> users;

    private DataManager() {
        colors = new ArrayList<>();
        users = Arrays.asList(new UserModel("1234", "usuario0", "usuario0", "admin", "admin", "admin"),
                new UserModel("5678", "usuario1", "apellido1", "usuario1@gmail.com", "normal", "1234"),
                new UserModel("9101", "usuario2", "apellido2", "usuario2@gmail.com", "normal", "abcd")
        );
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void addColor(ColorModel color) {
        colors.add(color);
    }

    public void removeColor(ColorModel color) {
        Iterator<ColorModel> iter = colors.iterator();
        while (iter.hasNext()) {
            ColorModel myColor = iter.next();
            if (myColor.getCodigo().equals(color.getCodigo()) && myColor.getDescripcion().equals(color.getDescripcion())) {
                iter.remove();
            }
        }
    }

    public List<ColorModel> getColors() {
        return colors;
    }

    public void addUser(UserModel user) {
        users.add(user);
    }

    public void removeUser(UserModel user) {
        colors.remove(user);
    }

    public List<UserModel> getUsers() {
        return users;
    }
}
