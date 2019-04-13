
package ConexionBaseDatosJava;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    public void agregarUsuario(Usuario usuario) {
        try {
            
            String url = "jdbc:derby://localhost:1527/LOGIN";
            String username = "root";
            String password = "123";
            Connection conexion = DriverManager.getConnection(url, username, password);
        
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO LOGIN.USUARIO(USER, PASS) VALUES('" + usuario.getUsername() + ",'" + usuario.getContrasena() + ")");
            
            st.close();
            conexion.close();
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
            
        }
    }
    
    public boolean verificarUsuario(Usuario usuario){
        boolean existe = false;
        try {
            String url = "jdbc:derby://localhost:1527/LOGIN";
            String username = "root";
            String password = "123";
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOGIN.USUARIO WHERE USER = '" + usuario.getUsername() + "' AND PASS ='" + usuario.getContrasena() + "'");
            
            if(rs.next()){
                existe = true;
            }else{
                existe = false ;
            }
            
            rs.close();
            st.close();
            conexion.close();
            
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return existe;
    }
}
