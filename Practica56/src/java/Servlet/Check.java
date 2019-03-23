
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@WebServlet(name = "Check", urlPatterns = {"/Check"})
public class Check extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
        String username = request.getParameter("username");
        String password = request.getParameter("contraseña");
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        
        response.sendRedirect("Bienvenido.jsp");
        
        if( cookies != null ) {
                if(session.isNew()){
                    session.setAttribute("usuario", username);
                    response.sendRedirect("Registro.jsp");
                }else{
                                for (int i=0; i < cookies.length; i++) {
                                    if(username.equalsIgnoreCase(cookies[i].getValue())){
                                        response.sendRedirect("Bienvenido.jsp");
                                    }else{
                                    PrintWriter out = response.getWriter();
                                            try {
                                                out.println("<!DOCTYPE html>");
                                                out.println("<html>");
                                                out.println("<head>");
                                                out.println("<title>Error</title>");            
                                                out.println("</head>");
                                                out.println("<body>");
                                                out.println("<h1>Error al iniciar sesión</h1>");
                                                out.println("<a href='Login.jsp'>Volver</a>");
                                                out.println("</body>");
                                                out.println("</html>");
                                            } finally {
                                                out.close();
                                            }
                                    }
                                }
                }
                
        }else{
            Cookie user = new Cookie("Nombre_Usuario", username);
            Cookie pass = new Cookie("Contraseña", password);

            user.setMaxAge(60*60*24);
            pass.setMaxAge(60*60*24); 
            
            response.addCookie(user);
            response.addCookie(pass);
            
            if(session.isNew()){
            session.setAttribute("usuario", username);
            response.sendRedirect("Registro.jsp");
            }else{
                response.sendRedirect("Login.jsp");
                }
            
        }
    }
}