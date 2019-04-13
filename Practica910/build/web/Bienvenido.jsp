
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Factory.Singleton"%>
<!DOCTYPE html>
<html>
         <%
        Singleton factory = Singleton.getSingleton();
        String user = (String)session.getAttribute("Usuario");
        %>
    <head>
      <meta charset="UTF-8">
   	<title>Bienvenido</title>
	<link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    	<link rel = "stylesheet" type="text/css" href = "main.css">
    </head>
    <body>
        <h1>Bienvenido al Sistema <%=user%>!!!</h1><br>
        <h2 class="server"><%=factory.getUsuario(user).mostrarInformación()%></h2><br>
        <br><a id="regresar" href="index.jsp">Salir</a>
    </body>
</html>
