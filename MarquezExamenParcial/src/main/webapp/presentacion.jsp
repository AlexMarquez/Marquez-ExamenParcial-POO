<%-- 
    Document   : presentacion
    Created on : 4/07/2014, 08:52:19 PM
    Author     : T107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de calificaciones!</h1>
        
         ${resultados.getEvaluacion1().obtenerRegistro()}
    </body>
</html>
