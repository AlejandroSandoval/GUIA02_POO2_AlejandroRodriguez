<%-- 
    Document   : index
    Created on : 08-10-2016, 05:01:54 PM
    Author     : Laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Guia 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type='text/css' rel='stylesheet' href='css/materialize.min.css'/>
	<link type='text/css' rel='stylesheet' href='css/icons.css'/>
        <link type='text/css' rel='stylesheet' href='css/style.css'/>
    </head>
    <body>
         <header>
            <nav>
                <div class="nav-wrapper light-blue darken-4">
                  <a href="#!" class="brand-logo">DATOS PERSONALES</a>
                </div>
            </nav>
        </header>
        <main>
            <div class="container">
                <div class="row">
                    <div class="col s12">
                        <blockquote><h3 class="light italic">Personas</h3></blockquote>
                    </div>
                </div>
            </div>
        </main>
        <footer class="page-footer white">
          <div class="footer-copyright light-blue darken-4">
            <div class="container">
            Develop by: Alejandro Rodriguez
            <a class="grey-text text-lighten-4 right" href="#!">POO II</a>
            </div>
          </div>
        </footer>
    <script src='js/jquery-2.2.3.min.js'></script>
    <script src='js/materialize.min.js'></script>
    <script>
	$(document).ready(function(){ $('.button-collapse').sideNav(); });
        $(document).ready(function(){ $('select').material_select(); });
    </script>
    </body>
</html>
