
package Factory;
import Modelo.Usuario;
import Modelo.UsuarioAdmin;
import Modelo.UsuarioNormal;
import Modelo.UsuarioInvitado;
import java.util.HashMap;

public class Singleton {
    
    private static Singleton sing;
    
    private HashMap<String, Usuario> hashmap = new HashMap();;
   
    private Singleton(){
    }
    
    public static Singleton getSingleton(){
        if (sing==null){
            sing = new Singleton();
        } 
        return sing;
    }
      
    public Usuario getUsuario(String usuario){
        return hashmap.get(usuario);
    }    
    
    public static Usuario elegirUsuario(String tipoUsuario, String username, String contrasena, String nombre, String apellido, String email, String fecha, String numEmpleado, String fechaRegistro, String direccion){
        if (tipoUsuario.equals("Administrador")) {
            return new UsuarioAdmin(username, contrasena, nombre,apellido,email, fecha, numEmpleado);
        }else if (tipoUsuario.equals("Normal")){    
            return new UsuarioNormal(username, contrasena, nombre,apellido,email, fecha, direccion);
        }else {
            return new UsuarioInvitado(username, contrasena, nombre,apellido,email, fecha, fechaRegistro);
        }
    }
    
    public void agregarUsuario(String tipoUsuario, String username, String contrasena, String nombre, String apellido, String email,String fecha, String numEmpleado, String fechaRegistro, String direccion){
        if (hashmap.get(username)==null){
            hashmap.put(username, elegirUsuario(tipoUsuario,username, contrasena, nombre, apellido, email, fecha, numEmpleado, fechaRegistro, direccion));
        }
    }

}
