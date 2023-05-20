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
import models.LineModel;
import models.ModelsModel;
import models.OPModel;
import models.UserModel;

/**
 *
 * @author Lau
 */
public class DataManager {

    private static DataManager instance = null;
    private List<ColorModel> colors;
    private List<UserModel> users;
    private List<ModelsModel> models;
    private List<LineModel> lines;
    private List<OPModel> ordenesProducion;

    private UserModel userLoguin;

    private DataManager() {
        colors = new ArrayList<>();
        InitColors();
        models = new ArrayList<>();
        InitModels();
        users = new ArrayList<>();
        InitUsers();
        lines = new ArrayList<>();
        InitLines();
    }

    private void InitColors() {
        colors.add(new ColorModel("#FFFFFF", "Blanco"));
        colors.add(new ColorModel("#262626", "Negro"));
        colors.add(new ColorModel("#1515FF", "Azul"));
    }

    private void InitModels() {
        List<ColorModel> colorsModels = new ArrayList<>();;

        colorsModels.add(new ColorModel("#FFFFFF", "Blanco"));
        colorsModels.add(new ColorModel("#262626", "Negro"));
        colorsModels.add(new ColorModel("#1515FF", "Azul"));

        models.add(new ModelsModel("8888", "NIKE", colorsModels));
        models.add(new ModelsModel("8889", "ADIDAS", colorsModels));
        models.add(new ModelsModel("9000", "PUMA", colorsModels));
    }

    private void InitUsers() {
        users.add(new UserModel("000001", "Simson", "Homero", "sc1@email.com", "SUPERVISOR_DE_CALIDAD", "admin"));
        users.add(new UserModel("000002", "Simson", "Lisa", "sl1@email.com", "SUPERVISOR_DE_LINEA", "admin"));
        users.add(new UserModel("000003", "Simson", "Bart", "sl2@email.com", "SUPERVISOR_DE_LINEA", "admin"));

    }

    private void InitLines() {
        lines.add(new LineModel(1, "Finalizada", "SD", null, null));
        lines.add(new LineModel(2, "Finalizada", "SD", null, null));
        lines.add(new LineModel(3, "Finalizada", "SD", null, null));
        lines.add(new LineModel(4, "Finalizada", "SD", null, null));
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

    public void addModel(ModelsModel model) {
        models.add(model);
    }

    public void removeModel(ModelsModel model) {
        Iterator<ModelsModel> iter = models.iterator();
        while (iter.hasNext()) {
            ModelsModel myModel = iter.next();
            if (myModel.getDenominacion().equals(model.getDenominacion()) && myModel.getSKU().equals(model.getSKU())) {
                iter.remove();
            }
        }
    }

    public List<ModelsModel> getModels() {
        return models;
    }

    public void addUserLogin(UserModel user) {
        this.userLoguin = user;
    }

    public UserModel getUserLogin() {
        return this.userLoguin;
    }

    public void addLine(LineModel line) {
        lines.add(line);
    }

    public void removeLine(LineModel line) {
        Iterator<LineModel> iter = lines.iterator();
        while (iter.hasNext()) {
            LineModel myModel = iter.next();
            if (myModel.getNumero() == line.getNumero()) {
                iter.remove();
            }
        }
    }

    public List<LineModel> getLines() {
        return lines;
    }

    public void changeStateLine(int numero, String state) {
        Iterator<LineModel> iter = lines.iterator();
        while (iter.hasNext()) {
            LineModel myModel = iter.next();
            if (myModel.getNumero() == numero) {
                myModel.setEstado(state); // Cambiar el estado de la línea
                if (state.equals("Finalizada") || state.equals("finalizada")) {
                    myModel.setOp(null);
                }
                break; // Terminar el bucle una vez que se encuentre la línea
            }
        }
    }

    public void updateLine(LineModel line, int numero) {
        Iterator<LineModel> iter = lines.iterator();
        while (iter.hasNext()) {
            LineModel myModel = iter.next();
            if (myModel.getNumero() == numero) {
                myModel.setDescripcion(line.getDescripcion());
                myModel.setEstado(line.getEstado());
                myModel.setOp(line.getOp());
                myModel.setSupervisor(line.getSupervisor());
            }
        }
    }
}
