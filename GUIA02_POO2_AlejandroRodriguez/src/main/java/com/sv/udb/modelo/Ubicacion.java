/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author aleso
 */
public class Ubicacion {
    private int CodiUbic;
    private String NombUbic;

    public int getCodiUbic() {
        return CodiUbic;
    }

    public void setCodiUbic(int CodiUbic) {
        this.CodiUbic = CodiUbic;
    }

    public String getNombUbic() {
        return NombUbic;
    }

    public void setNombUbic(String NombUbic) {
        this.NombUbic = NombUbic;
    }

    public Ubicacion() {
    }

    public Ubicacion(int CodiUbic, String NombUbic) {
        this.CodiUbic = CodiUbic;
        this.NombUbic = NombUbic;
    }
    
    
}
