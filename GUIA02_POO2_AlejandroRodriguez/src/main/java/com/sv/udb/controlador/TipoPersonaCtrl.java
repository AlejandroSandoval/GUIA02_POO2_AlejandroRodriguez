/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoPersona;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class TipoPersonaCtrl {
    public List<TipoPersona> consTodo(){
      List <TipoPersona> resp = new ArrayList<>();
     
      Connection cn = new Conexion().getConn();
      try{
           String Consulta="select * from TIPO_PERS";
           PreparedStatement cmd = cn.prepareStatement(Consulta);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               System.out.println(rs.getString(2));
               resp.add(new TipoPersona(rs.getInt(1), 
                       rs.getString(2), 
                       rs.getString(3), 
                       rs.getString(4),
                       rs.getInt(5)));
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
