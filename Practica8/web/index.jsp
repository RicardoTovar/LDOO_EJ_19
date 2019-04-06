
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
   	<title>Login</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
        <link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script> 
    </head>
    <body>
        <h1>Log In</h1>

	<form class="login" onsubmit="return error();" action="Check" method="POST">
            Nombre De Usuario:
            <input id="username" type="text" name="username"><br>
            Contraseña:
            <input id="contrasena" type="password" name="contrasena"><br>
            <input id="submit" type="submit" value="Entrar">
            <br>No estás Registrado? <a id="registrarse" href="Registro.jsp">Registrarse</a>
	</form>
    </body>
</html>
