package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("   \t<title>Registro</title>\n");
      out.write("\t<link rel = \"shortcut icon\" type=\"image/png\" href = \"https://www.liceoboston.edu.co/wp-content/uploads/2018/06/jsdf.png\">\n");
      out.write("    \t<link rel = \"stylesheet\" type=\"text/css\" href = \"main.css\">\n");
      out.write("   \t<script src = \"main.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de Usuario</h1>\n");
      out.write("\n");
      out.write("\t<form onsubmit=\"return validar();\" class=\"login\"  action=\"RegistrarUsuario\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            Tipo De Usuario:\n");
      out.write("            <select name=\"tipousuario\" >   \n");
      out.write("                <option value=\"\"></option>\n");
      out.write("                <option value=\"Administrador\">Administrador</option>\n");
      out.write("                <option value=\"Normal\">Normal</option>\n");
      out.write("                <option value=\"Invitado\">Invitado</option>\n");
      out.write("            </select><br>\n");
      out.write("            \n");
      out.write("            Nombre(s):\n");
      out.write("            <input id=\"nombres\" type=\"text\" name=\"nombre\" placeholder=\" Ej. Ricardo Emmanuel\"><br>\n");
      out.write("\n");
      out.write("            Apellido(s):\n");
      out.write("            <input id=\"apellidos\" type=\"text\" name=\"apellido\" placeholder=\" Ej. Tovar Domínguez\"><br>\n");
      out.write("            \n");
      out.write("            Nombre De Usuario:\n");
      out.write("            <input id=\"username\" type=\"text\" name=\"username\" placeholder=\" Ej. Ricardo123\"><br>\n");
      out.write("            \n");
      out.write("            Número De Empleado:\n");
      out.write("            <input onclick=\"alert('Si eres Administrador Es Necesario Tu Número De Empleado')\"  id=\"numempleado\" type=\"text\" name=\"numempleado\" placeholder=\" Ej. 0123456\"><br>\n");
      out.write("\t\t\t\n");
      out.write("            E-mail:\n");
      out.write("            <input id=\"email\" type=\"email\" name=\"email\" placeholder=\" Ej. ricardotovar@gmail.com\" ><br>\n");
      out.write("\n");
      out.write("            Contraseña:\n");
      out.write("            <input id=\"contraseña\" type=\"password\" name=\"contrasena\" placeholder=\" Ej. Git#1357Pfthub\"><br>\n");
      out.write("\t\t\t\n");
      out.write("            Fecha De Nacimiento:\n");
      out.write("            <input id=\"fecha\" type=\"date\" name=\"fecha\"><br>\n");
      out.write("            \n");
      out.write("            Dirección:\n");
      out.write("            <input  onclick=\"alert('Si eres Usuario Normal Es Necesaria Tu Dirección')\" id=\"direccion\" type=\"text\" name=\"direccion\" placeholder=\" Ej. San Jerónimo #214\"><br>\n");
      out.write("            \n");
      out.write("            Fecha De Registro:\n");
      out.write("            <input onclick=\"alert('Si eres Invitado Es Necesario Tu Fecha De Registro')\" id=\"fechaRegistro\" type=\"date\" name=\"fechaRegistro\"><br>\n");
      out.write("\n");
      out.write("            <input id=\"submit\" type=\"submit\" value=\"Registrarme\">\n");
      out.write("            \n");
      out.write("\t</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
