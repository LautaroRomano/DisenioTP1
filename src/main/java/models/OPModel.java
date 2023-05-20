/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Lau
 */
public class OPModel {
    private ModelsModel modelo;
    private ColorModel color;

    public OPModel(ModelsModel modelo, ColorModel color) {
        this.modelo = modelo;
        this.color = color;
    }

    public OPModel() {
    }

    public ModelsModel getModelo() {
        return modelo;
    }

    public void setModelo(ModelsModel modelo) {
        this.modelo = modelo;
    }

    public ColorModel getColor() {
        return color;
    }

    public void setColor(ColorModel color) {
        this.color = color;
    }
    
    
}
