/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Persona;
import com.sv.udb.recursos.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleso
 */
public class PersonaCtrl {
    public List<Persona> consTodo(){
      List <Persona> resp = new ArrayList<>();
     
      Connection cn = new Conexion().getConn();
      try{
           String Consulta="select codi_pers, nomb_pers, apel_pers, foto_pers, codi_tipo_pers, gene_pers,"
                   + "fech_naci_pers, dui_pers, nit_pers, tipo_sang_pers, codi_ubic_geog,"
                   + " fech_alta, fech_baja, esta from pers";
           PreparedStatement cmd = cn.prepareStatement(Consulta);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               System.out.println(rs.getString(2));
               resp.add(new Persona(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6),
               rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getInt(14)));
           }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            if(cn!=null){
                try{
                if(!cn.isClosed()){
                    cn.close();
                }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        return resp;  
    }
    
    public int Maxcod()
    {
        int codi = 0;
        Connection cn = new Conexion().getConn();
        try {
            String consulta = "SELECT MAX(codi_pers) from pers";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                codi = rs.getInt(1) + 1;
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally{
            if(cn!=null){
                try{
                if(!cn.isClosed()){
                    cn.close();
                }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        return codi;
    }
    
    public boolean guar(Persona obje){
        boolean resp=false;
        Connection cn = new Conexion().getConn();
        try{
            String Consulta = "INSERT INTO PERS VALUES(?,?,?,?,?,?,?,?,?,?,?,NOW(),null,1)";
            FileInputStream fis = null;
            PreparedStatement cmd = cn.prepareStatement(Consulta);
            cmd.setInt(1, obje.getCodiPers());
            cmd.setString(2, obje.getNombPers());
            cmd.setString(3, obje.getApelPers());
            cmd.setString(4, obje.getFotoPers());
            cmd.setInt(5, obje.getCodiTipoPers());
            cmd.setString(6, obje.getGenePers());
            cmd.setString(7, obje.getFechNaciPers());
            cmd.setString(8, obje.getDuiPers());
            cmd.setString(9, obje.getNitPers());
            cmd.setString(10, obje.getTipoSangPers());
            cmd.setInt(11, obje.getCodiUbicPers());
            cmd.executeUpdate();
            resp=true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            if(cn!=null){
                try{
                if(!cn.isClosed()){
                    cn.close();
                }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        return resp;
    }
    
    public Persona cons(int CodiPers)
    {
        Persona resp = null;
        Connection cn = new Conexion().getConn();
        try
        {
//            String consulta = "SELECT B.codi_bode, P.codi_piez, P.nomb_piez, P.tipo_piez, P.marc_piez, PR.codi_prov, PR.nomb_prov, PR.dire_prov, PR.tele_prov, B.cant, B.fech_comp FROM bodega B INNER JOIN piezas P ON B.codi_piez = P.codi_piez INNER JOIN Proveedores PR ON B.codi_prov = PR.codi_prov WHERE codi_bode = ?";
//            PreparedStatement cmd = cn.prepareStatement(consulta);
//            cmd.setInt(1, CodiPers);
//            ResultSet rs = cmd.executeQuery();
//            if(rs.next())
//            {
//                resp = new Persona(rs.getInt(1), new Piezas(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)), new Proveedor(rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9)), rs.getInt(10), rs.getString(11));
//            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if(cn != null)
            {
                try
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        return resp;
    }
}
