
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %> 
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
   	<title>Bienvenida</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    	<link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script> 
    </head>
    <body>
        <h1>Bienvenido al Sistema <%= session.getAttribute("usuario") %></h1><br>
	<form action="ExpirarCookies" method="POST">
            <input id="submit" type="submit" value="Expirar Cookie">
	</form>
    </body>
</html>
