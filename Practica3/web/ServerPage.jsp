
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Formulario Recibido</title>
        <link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
        <link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script> 
        
    </head>
    <body onload="return bienvenido();">
            <h1>Usuario Registrado</h1><br>
        <div class="server">
            <h2>Nombre: <%=request.getParameter("nombre")%> <%=request.getParameter("apellido")%></h2><br>
            <h2>Email: <%=request.getParameter("email")%> </h2><br>
            <h2>Contraseña: <%=request.getParameter("contraseña")%> </h2><br>
            <h2>Cumpleaños: <%=request.getParameter("fecha")%> </h2><br>
        </div>
    </body >
</html>
