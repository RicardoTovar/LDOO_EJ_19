
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    Connection conexion;

    public void Conexion() throws SQLException {
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:1234/LogIn", "root", "****");
    }
    
    public boolean agregarUsuario(Usuario usuario) {
        boolean agregado=false;
        try {
            Conexion();
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO Usuario('user','pass') VALUES ('"+usuario.getUsername()+"','"+usuario.getContrasena()+"')");
            conexion.close();
            agregado=true;
            
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return agregado;
    }
    
    public boolean verificarUsuario(Usuario usuario){
        ResultSet rs;
        boolean existe = false;
        try {
            Conexion();
            Statement st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM Usuario WHERE user='"+usuario.getUsername()+"' AND pass='"+usuario.getContrasena()+"'");
            existe = rs.next();
            conexion.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return existe;
    }
}
