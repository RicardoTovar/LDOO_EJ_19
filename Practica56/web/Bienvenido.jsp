<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%      request.setCharacterEncoding("UTF-8");  
        HttpSession sesion = request.getSession();
        String username,contrasena,nombre,apellido,email,fecha;
        username = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        nombre = sesion.getAttribute("nombre").toString();
        apellido = sesion.getAttribute("apellido").toString();
        email = sesion.getAttribute("email").toString();
        fecha = sesion.getAttribute("fecha").toString();
        Usuario user = new Usuario(username,contrasena,nombre,apellido,email,fecha);
%> 

<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
   	<title>Bienvenida</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    	<link rel = "stylesheet" type="text/css" href = "main.css">
    </head>
    <body>
        <h1>Bienvenido al Sistema <%=user.getUsername()%> </h1><br>
        <div class="server">
        <h2> Tu contraseña es: <%=user.getContrasena()%> </h2><br>
        <h2>Nombre: <%=user.getNombre()%> <%=user.getApellido()%></h2><br>
        <h2>Email: <%=user.getEmail()%> </h2><br>
        <h2>Cumpleaños: <%=user.getFecha()%></h2><br>
        </div>
	<form action="ExpirarCookies.jsp">
            <input id="submit" type="submit" value="Expirar Cookie">
	</form>
    </body>
</html>
