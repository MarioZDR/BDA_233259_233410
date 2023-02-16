/**
 * Clase IConexionBD.java creada el 15/02/2023.
 */
package interfaces;

import java.sql.*;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public interface IConexionBD {
    Connection crearConexion() throws SQLException;
   
}
