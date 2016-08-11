/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Ariel
 */
public class TipoPersona {
     private int CodiTipoPers;
     private String NombTipoPers;
     private String FechAlta;
     private String FechBaja;
     private int EstaTipoPers;

    public TipoPersona() {
    }

    public TipoPersona(int CodiTipoPers, String NombTipoPers, String FechAlta, String FechBaja, int EstaTipoPers) {
        this.CodiTipoPers = CodiTipoPers;
        this.NombTipoPers = NombTipoPers;
        this.FechAlta = FechAlta;
        this.FechBaja = FechBaja;
        this.EstaTipoPers = EstaTipoPers;
    }

    public int getCodiTipoPers() {
        return CodiTipoPers;
    }

    public void setCodiTipoPers(int CodiTipoPers) {
        this.CodiTipoPers = CodiTipoPers;
    }

    public String getNombTipoPers() {
        return NombTipoPers;
    }

    public void setNombTipoPers(String NombTipoPers) {
        this.NombTipoPers = NombTipoPers;
    }

    public String getFechAlta() {
        return FechAlta;
    }

    public void setFechAlta(String FechAlta) {
        this.FechAlta = FechAlta;
    }

    public String getFechBaja() {
        return FechBaja;
    }

    public void setFechBaja(String FechBaja) {
        this.FechBaja = FechBaja;
    }

    public int getEstaTipoPers() {
        return EstaTipoPers;
    }

    public void setEstaTipoPers(int EstaTipoPers) {
        this.EstaTipoPers = EstaTipoPers;
    }

    @Override
    public String toString() {
        return  NombTipoPers;
    }
     
}
