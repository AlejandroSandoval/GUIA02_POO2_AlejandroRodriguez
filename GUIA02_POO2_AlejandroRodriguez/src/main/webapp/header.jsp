<%-- 
    Document   : header
    Created on : 08-10-2016, 10:14:09 PM
    Author     : aleso
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Guia 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type='text/css' rel='stylesheet' href='css/materialize.min.css'/>
	<link type='text/css' rel='stylesheet' href='css/icons.css'/>
        <link type='text/css' rel='stylesheet' href='css/style.css'/>
        <script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>
        <script type='text/javascript' src='js/jquery.validate.min.js'></script>
        <script type='text/javascript' src='js/messages_es.min.js'></script>
        <script>
            $().ready(function() {
                $("#frmpers").validate({
                    rules: {
                            NombPers: "required",
                            ApelPers: "required",
                            DuiPers: "required",
                            NitPers: "required"
                    },
                    errorElement: 'div'
                });
            });
        </script>
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
