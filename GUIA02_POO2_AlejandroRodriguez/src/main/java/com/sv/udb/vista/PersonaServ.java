/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.PersonaCtrl;
import com.sv.udb.modelo.Persona;
import com.sv.udb.modelo.Ubicacion;
import com.sv.udb.modelo.TipoPersona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aleso
 */
@MultipartConfig(maxFileSize = 16177215)
@WebServlet(name = "PersonaServ", urlPatterns = {"/PersonaServ"})
public class PersonaServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            boolean esValido = request.getMethod().equals("POST");
            if(esValido)
            {
                String mens = "";
                String CRUD = request.getParameter("cursBton");
                if(CRUD.equals("Guardar"))
                {
                    Persona persona = new Persona();
                    TipoPersona tipo = new TipoPersona();
                    tipo.setCodiTipoPers(Integer.parseInt(request.getParameter("cmbTipo")));
                    persona.setCodiTipoPers(tipo.getCodiTipoPers());
                    Ubicacion ubica = new Ubicacion();
                    ubica.setCodiUbic(Integer.parseInt(request.getParameter("cmbUbica")));
                    persona.setCodiUbicPers(ubica.getCodiUbic());
                    persona.setNombPers(request.getParameter("NombPers"));
                    persona.setApelPers(request.getParameter("ApelPers"));
                    persona.setGenePers(request.getParameter("cmbgenero"));
                    persona.setDuiPers(request.getParameter("DuiPers"));
                    persona.setNitPers(request.getParameter("NitPers"));
                    persona.setTipoSangPers(request.getParameter("cmbsangre"));
                    persona.setFechNaciPers(request.getParameter("fechNaci"));
                    persona.setFotoPers("null");
                    persona.setCodiPers(new PersonaCtrl().Maxcod());
                    mens = new PersonaCtrl().guar(persona) ? "Datos guardados exitosamente" : "Datos NO guardados";
                }
                else if(CRUD.equals("Modificar"))
                {
//                    Bodega bodega = new Bodega();
//                    bodega.setCodi_bode(Integer.parseInt(request.getParameter("codi_bode")));
//                    Piezas piez = new Piezas();
//                    piez.setCodiPiez(Integer.parseInt(request.getParameter("cmbPiez")));
//                    bodega.setCodiPiez(piez);
//                    Proveedor prov = new Proveedor();
//                    prov.setCodiProv(Integer.parseInt(request.getParameter("cmbProv")));
//                    bodega.setCodiProv(prov);
//                    bodega.setCant_bode(Integer.parseInt(request.getParameter("cant_bode")));
//                    bodega.setFech_comp(request.getParameter("fech_comp"));
//                    if(bodega != null)
//                    {
//                        mens = new BodegaCtrl().modi(bodega) ? "Datos modificados" : "Datos NO modificados";
//                    }
                }
                else if(CRUD.equals("Eliminar"))
                {
//                    Bodega bodega = new Bodega();
//                    bodega.setCodi_bode(Integer.parseInt(request.getParameter("codi_bode")));
//                    Piezas piez = new Piezas();
//                    piez.setCodiPiez(Integer.parseInt(request.getParameter("cmbPiez")));
//                    bodega.setCodiPiez(piez);
//                    Proveedor prov = new Proveedor();
//                    prov.setCodiProv(Integer.parseInt(request.getParameter("cmbProv")));
//                    bodega.setCodiProv(prov);
//                    bodega.setCant_bode(Integer.parseInt(request.getParameter("cant_bode")));
//                    bodega.setFech_comp(request.getParameter("fech_comp"));
//                    if(bodega != null)
//                    {
//                        mens = new BodegaCtrl().elim(bodega) ? "Datos eliminados" : "Datos NO eliminados";
//                    }
                }
                else if(CRUD.equals("Consultar"))
                {
                    int CodiPers = Integer.parseInt(request.getParameter("codiPersRadi") == null ? "0" : request.getParameter("codiPersRadi"));
//                    Persona objePiez = new PersonaCtrl().consTodo(CodiPers);
//                    if(objePiez != null)
//                    {
//                        request.setAttribute("codi_bode", codi_bode);
//                        request.setAttribute("cmbPiez", objePiez.getCodiPiez().getCodiPiez());
//                        request.setAttribute("cmbProv", objePiez.getCodiProv().getCodiProv());
//                        request.setAttribute("cant_bode", objePiez.getCant_bode());
//                        request.setAttribute("fech_comp", objePiez.getFech_comp());
//                    }
                }
                request.setAttribute("mensAler", mens);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            else
            {
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
