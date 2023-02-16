/**
 * Clase ConexionBD.java creada el 15/02/2023.
 */
package implementaciones;

import interfaces.IConexionBD;
import java.sql.*;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public class ConexionBD implements IConexionBD{
    private String usuario;
    private String password;
    private String cadenaConexion;
    
    public ConexionBD(String cadenaConexion, String usuario, String password){
        this.usuario=usuario;
        this.password=password;
        this.cadenaConexion=cadenaConexion;
    }
    
    @Override
    public Connection crearConexion() throws SQLException{
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        return conexion;
    }
    
}
