
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

	<form onsubmit="return validar();" class="login"  action="RegistrarUsuario" method="POST">
            
            Tipo De Usuario:
            <select id="tipousuario" name="tipousuario" >   
                <option value=""></option>
                <option value="Administrador">Administrador</option>
                <option value="Normal">Normal</option>
                <option value="Invitado">Invitado</option>
            </select><br>
            
            Nombre(s):
            <input id="nombres" type="text" name="nombre" placeholder=" Ej. Ricardo Emmanuel"><br>

            Apellido(s):
            <input id="apellidos" type="text" name="apellido" placeholder=" Ej. Tovar Domínguez"><br>
            
            Nombre De Usuario:
            <input id="username" type="text" name="username" placeholder=" Ej. Ricardo123"><br>
            
            Número De Empleado:
            <input onclick="alert('Si eres Administrador Es Necesario Tu Número De Empleado')"  id="numempleado" type="text" name="numEmpleado" placeholder=" Ej. 0123456"><br>
			
            E-mail:
            <input id="email" type="email" name="email" placeholder=" Ej. ricardotovar@gmail.com" ><br>

            Contraseña:
            <input id="contraseña" type="password" name="contrasena" placeholder=" Ej. Git#1357Pfthub"><br>
			
            Fecha De Nacimiento:
            <input id="fecha" type="date" name="fecha"><br>
            
            Dirección:
            <input  onclick="alert('Si eres Usuario Normal Es Necesaria Tu Dirección')" id="direccion" type="text" name="direccion" placeholder=" Ej. San Jerónimo #214"><br>
            
            Fecha De Registro:
            <input onclick="alert('Si eres Invitado Es Necesario Tu Fecha De Registro')" id="fechaRegistro" type="date" name="fechaRegistro"><br>

            <input id="submit" type="submit" value="Registrarme">
            
	</form>
    </body>
</html>
