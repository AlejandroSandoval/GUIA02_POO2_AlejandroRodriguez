/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.recursos.Conexion;
import com.sv.udb.modelo.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleso
 */
public class UbicacionCtrl {
     public List<Ubicacion> consTodo(){
      List <Ubicacion> resp = new ArrayList<>();
     
      Connection cn = new Conexion().getConn();
      try{
           String Consulta="select codi_ubic_geog, nomb_ubic_geog from ubic_geog where esta = 1";
           PreparedStatement cmd = cn.prepareStatement(Consulta);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               System.out.println(rs.getString(2));
               resp.add(new Ubicacion(rs.getInt(1), rs.getString(2)));
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
}
