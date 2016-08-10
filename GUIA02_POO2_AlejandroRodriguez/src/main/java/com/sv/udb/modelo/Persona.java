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
public class Persona {
    private int CodiPers;
    private String NombPers;
    private String ApelPers;
    private String FotoPers;
    private int CodiTipoPers;
    private String GenePers;
    private String FechNaciPers;
    private String DuiPers;
    private String NitPers;
    private String TipoSangPers;
    private int CodiUbicPers;
    private String FechAlta;
    private String FechBaja;
    private int EstaPers;

    public Persona() {
    }

    public Persona(int CodiPers, String NombPers, String ApelPers, String FotoPers, int CodiTipoPers, String GenePers, String FechNaciPers, String DuiPers, String NitPers, String TipoSangPers, int CodiUbicPers, String FechAlta, String FechBaja, int EstaPers) {
        this.CodiPers = CodiPers;
        this.NombPers = NombPers;
        this.ApelPers = ApelPers;
        this.FotoPers = FotoPers;
        this.CodiTipoPers = CodiTipoPers;
        this.GenePers = GenePers;
        this.FechNaciPers = FechNaciPers;
        this.DuiPers = DuiPers;
        this.NitPers = NitPers;
        this.TipoSangPers = TipoSangPers;
        this.CodiUbicPers = CodiUbicPers;
        this.FechAlta = FechAlta;
        this.FechBaja = FechBaja;
        this.EstaPers = EstaPers;
    }
  
    public int getCodiPers() {
        return CodiPers;
    }

    public void setCodiPers(int CodiPers) {
        this.CodiPers = CodiPers;
    }

    public String getNombPers() {
        return NombPers;
    }

    public void setNombPers(String NombPers) {
        this.NombPers = NombPers;
    }

    public String getApelPers() {
        return ApelPers;
    }

    public void setApelPers(String ApelPers) {
        this.ApelPers = ApelPers;
    }

    public String getFotoPers() {
        return FotoPers;
    }

    public void setFotoPers(String FotoPers) {
        this.FotoPers = FotoPers;
    }

    public int getCodiTipoPers() {
        return CodiTipoPers;
    }

    public void setCodiTipoPers(int CodiTipoPers) {
        this.CodiTipoPers = CodiTipoPers;
    }

    public String getGenePers() {
        return GenePers;
    }

    public void setGenePers(String GenePers) {
        this.GenePers = GenePers;
    }

    public String getFechNaciPers() {
        return FechNaciPers;
    }

    public void setFechNaciPers(String FechNaciPers) {
        this.FechNaciPers = FechNaciPers;
    }

    public String getDuiPers() {
        return DuiPers;
    }

    public void setDuiPers(String DuiPers) {
        this.DuiPers = DuiPers;
    }

    public String getNitPers() {
        return NitPers;
    }

    public void setNitPers(String NitPers) {
        this.NitPers = NitPers;
    }

    public String getTipoSangPers() {
        return TipoSangPers;
    }

    public void setTipoSangPers(String TipoSangPers) {
        this.TipoSangPers = TipoSangPers;
    }

    public int getCodiUbicPers() {
        return CodiUbicPers;
    }

    public void setCodiUbicPers(int CodiUbicPers) {
        this.CodiUbicPers = CodiUbicPers;
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

    public int getEstaPers() {
        return EstaPers;
    }

    public void setEstaPers(int EstaPers) {
        this.EstaPers = EstaPers;
    }
    

    @Override
    public String toString() {
        return NombPers + " " + ApelPers;
    }
    
}
