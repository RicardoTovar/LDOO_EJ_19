<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Formulario Recibido</title>
        <link rel = "shortcut icon" type="image/png" href = "https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png">
    </head>
    <body>
            <h1>Usuario Registrado</h1><br>
        <div class="server">
            <h2>Nombre: ${"nombre"} ${"apellido"} </h2><br>
            <h2>Email: ${"email"} </h2><br>
            <h2>Contraseña: ${"contraseña"} </h2><br>
            <h2>Cumpleaños: ${"fecha"} </h2><br>
        </div>
    </body >
</html>
