/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author Lau
 */
public class ModelsModel {

    private String SKU;
    private String denominacion;
    private List<ColorModel> colors;

    public ModelsModel(String SKU, String denominacion, List<ColorModel> colors) {
        this.SKU = SKU;
        this.denominacion = denominacion;
        this.colors = colors;
    }
    
    public ModelsModel(String SKU, String denominacion) {
        this.SKU = SKU;
        this.denominacion = denominacion;
    }

    public ModelsModel() {

    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<ColorModel> getColors() {
        return colors;
    }

    public void setColors(List<ColorModel> colors) {
        this.colors = colors;
    }
    
    

}
