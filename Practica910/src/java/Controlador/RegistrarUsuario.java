
package Controlador;

import Factory.Singleton;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistrarUsuario", urlPatterns = {"/RegistrarUsuario"})
public class RegistrarUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            Singleton factory = Singleton.getSingleton();
            String tipo = request.getParameter("tipousuario");
            String nom = request.getParameter("nombre");
            String ape = request.getParameter("apellido");
            String user = request.getParameter("username");
            String numE = request.getParameter("numEmpleado");
            String email = request.getParameter("email");
            String pass = request.getParameter("contrasena");
            String bday = request.getParameter("fecha");
            String dir = request.getParameter("direccion");
            String fechare = request.getParameter("fechaRegistro");
            
            switch (tipo) {
            case "Administrador":
                factory.agregarUsuario(tipo,user, pass, nom, ape, email, bday, numE, null, null);
                break;
            case "Normal":
                factory.agregarUsuario(tipo,user, pass, nom, ape, email, bday, null, null, dir);
                break;
            default:
                factory.agregarUsuario(tipo,user, pass, nom, ape, email, bday, null, fechare, null);
                break;
            }
            response.sendRedirect("index.jsp");
        
    }    
}
