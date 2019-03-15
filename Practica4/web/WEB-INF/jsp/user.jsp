<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<title>Formulario</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    </head>

    <body>
        <h1>Registro de Usuario</h1>

	<form:form action="/Practica4/addUser" method="POST">
            
            <form:label path = "nombre">Nombre(s):</form:label>
            <form:input path = "nombre" placeholder=" Ej. Ricardo Emmanuel"/>
            
            <form:label path = "apellido">Apellido(s):</form:label>
            <form:input path = "apellido" placeholder=" Ej. Tovar Domínguez" />

            <form:label path = "email">E-mail:</form:label>
            <form:input path = "email" placeholder=" Ej. ricardotovar@gmail.com" />
                
            <form:label path = "contraseña">Contraseña:</form:label>
            <form:input path = "contraseña" placeholder=" Ej. Git#1357Pfthub" />

            <form:label path = "fecha">Fecha De Nacimiento:</form:label>
            <form:input path = "fecha" />
            
            <input id="enviar" type="submit" value="Registrar">
            
	</form:form>
    </body>
</html>
