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

public class LineModel {
    private int numero;
    private String estado;
    private String descripcion;
    private OPModel op;
    private UserModel supervisor;

    public LineModel(int numero, String estado, String descripcion, OPModel op, UserModel supervisor) {
        this.numero = numero;
        this.estado = estado;
        this.descripcion = descripcion;
        this.op = op;
        this.supervisor = supervisor;
    }

    public LineModel() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OPModel getOp() {
        return op;
    }

    public void setOp(OPModel op) {
        this.op = op;
    }

    public UserModel getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(UserModel supervisor) {
        this.supervisor = supervisor;
    }
    
    
    
}
