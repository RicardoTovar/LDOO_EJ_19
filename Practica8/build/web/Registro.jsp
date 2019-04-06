
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
   	<title>Registro</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    	<link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script> 
    </head>
    <body>
          <h1>Registro de Usuario</h1>

	<form class="login" onsubmit="return validar();" action="Registrar" method="POST">
            
            Nombre(s):
            <input id="nombres" type="text" name="nombre" placeholder=" Ej. Ricardo Emmanuel"><br>

            Apellido(s):
            <input id="apellidos" type="text" name="apellido" placeholder=" Ej. Tovar Domínguez"><br>
            
            Nombre De Usuario:
            <input id="username" type="text" name="username" placeholder=" Ej. Ricardo123"><br>
			
            E-mail:
            <input id="email" type="email" name="email" placeholder=" Ej. ricardotovar@gmail.com" ><br>

            Contraseña:
            <input id="contraseña" type="password" name="contrasena" placeholder=" Ej. Git#1357Pfthub"><br>
			
            Fecha De Nacimiento:
            <input id="fecha" type="date" name="fecha"><br>

            <input id="submit" type="submit" value="Registrar">
	</form>
    </body>
</html>
