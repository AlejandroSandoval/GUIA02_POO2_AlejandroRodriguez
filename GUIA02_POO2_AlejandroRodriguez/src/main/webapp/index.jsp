<%-- 
    Document   : index
    Created on : 08-10-2016, 05:01:54 PM
    Author     : Laboratorio
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.sv.udb.controlador.PersonaCtrl"%>
<%@page import="com.sv.udb.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <jsp:include page="header.jsp" />
        <div class="container">
            <div class="row">
                <div class="col s10 m7 l7">
                    <h3 class="light italic">Personas</h3>
                </div>
                <div class="col s2 m5 l5">
                    <br><a style="float:right;" class="btn-floating btn-large waves-effect waves-light red tooltipped modal-trigger" data-position="left" data-delay="50" data-tooltip="Nueva Persona" href="#modal1"><i class="material-icons">add</i></a></center>
                </div>
            </div>
            <div class="row col s12"><blockquote>${mensAler}</blockquote></div>
            <div class="row">
                <form method="POST" name="Frm" action="PersonaServ">
                <jsp:useBean id="beanPersonaCtrl" class="com.sv.udb.controlador.PersonaCtrl" scope="page"/>
                    <table border="1" class="bordered highlight centered">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>DUI</th>
                                <th>--</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${beanPersonaCtrl.consTodo()}" var="fila">
                                <tr>
                                    <td><c:out value="${fila.nombPers}"></c:out></td>
                                    <td><c:out value="${fila.apelPers}"></c:out></td>
                                    <td><c:out value="${fila.duiPers}"></c:out></td>
                                    <td><input type="radio" name="codiPersRadi" id="${fila.codiPers}" value="${fila.codiPers}"/><label for="${fila.codiPers}"></label></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <br/>
                    <div class="row">
                        <div class="col s12">
                            <div class="col s12 m4 l4" id="buton"><button class="btn waves-effect waves-light teal darken-3 col s12" type="submit" name="cursBton" value="Ficha">Ver Ficha</button></div>
                            <div class="col s12 m4 l4" id="buton"><button class="btn waves-effect waves-light teal darken-3 col s12" type="submit" name="cursBton" value="Historial">Historial</button></div>
                            <div class="col s12 m4 l4" id="buton"><button class="btn waves-effect waves-light teal darken-3 col s12" type="submit" name="cursBton" value="Consultar">Consultar</button></div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <!-- Modal Structure -->
        <div id="modal1" class="modal">
        <form method="POST" name="Frm" id="frmpers" action="PersonaServ">
        <div class="modal-content">
            <div class="row">
                <div class="col s10"><h4 class="light italic bold">Nueva Persona</h4></div>
                <div class="col s2"><a onclick="$('#modal1').closeModal();" class="waves-effect waves-teal btn-flat"><i class="material-icons" style="float:right;">close</i></a></div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="row col s12">
                        <input type="hidden" name="CodiPers" value="${CodiPers}"/>
                        <div class="input-field col s12 m12 l6">
                            <input placeholder="Nombres" id="NombPers" name="NombPers" type="text" class="validate">
                        </div>
                        <div class="input-field col s12 m12 l6">
                            <input placeholder="Apellidos" id="ApelPers" name="ApelPers" type="text" class="validate">
                        </div>
                        <div class="input-field col s12 m12 l6">
                            <select name="cmbTipo" id="cmbTipo">
                            <jsp:useBean id="beanTipoCtrl" class="com.sv.udb.controlador.TipoPersonaCtrl" scope="page"/>
                            <c:forEach items="${beanTipoCtrl.consTodo()}" var="fila">
                                <c:choose>
                                    <c:when test="${fila.codiTipoPers eq cmbTipo}">
                                        <option name="codi_tipo" value="${fila.codiTipoPers}" selected="">${fila.nombTipoPers}</option>
                                    </c:when>
                                    <c:otherwise>
                                <option name="codi_tipo" value="${fila.codiTipoPers}">${fila.nombTipoPers}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                            </select>
                            <label>Tipo Persona:</label>
                        </div>
                        <div class="input-field col s12 m12 l6">
                            <select name="cmbgenero" id="cmbgenero">
                               <option value="M">Masculino</option>
                               <option value="F">Femenino</option>
                             </select>
                             <label>Genero:</label>
                        </div>
                        <div class="input-field col s12 m12 l6">
                             <input type="date"class="form-control" name="fechNaci" id="date2">
                             <label for="date2" class="active">Fecha Nac.</label>
                        </div>
                        <div class="input-field col s12 m12 l6">
                            <input placeholder="DUI" id="DuiPers" name="DuiPers" type="text" class="validate">
                        </div>
                        <div class="input-field col s12 m12 l6">
                            <input placeholder="NIT" id="NitPers" name="NitPers" type="text" class="validate">
                        </div>
                        <div class="input-field col s12 m12 l6">
                             <select name="cmbsangre" id="cmbsangre">
                                <option value="A+">A+</option>
                                <option value="A-">A-</option>
                                <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                                <option value="O+">O+</option>
                                <option value="O-">O-</option>
                                <option value="RH+">RH+</option>
                              </select>
                              <label>Tipo Sangre:</label>
                        </div>
                        <div class="input-field col s12">
                            <select name="cmbUbica" id="cmbUbica">
                            <jsp:useBean id="beanUbicacionCtrl" class="com.sv.udb.controlador.UbicacionCtrl" scope="page"/>
                            <c:forEach items="${beanUbicacionCtrl.consTodo()}" var="fila">
                                <c:choose>
                                    <c:when test="${fila.codiUbic eq cmbUbica}">
                                        <option name="codi_ubic" value="${fila.codiUbic}" selected="">${fila.nombUbic}</option>
                                    </c:when>
                                    <c:otherwise>
                                <option name="codi_ubic" value="${fila.codiUbic}">${fila.nombUbic}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                            </select>
                            <label>Ubicacion:</label>
                        </div>
                    </div>
                    <center><button class="btn" type="submit" name="cursBton" value="Guardar">Agregar</button></center>       
                </div>
            </div>
        </div>
        </form>
        </div>
        <jsp:include page="footer.jsp" />