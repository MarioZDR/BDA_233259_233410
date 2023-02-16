/**
 * Clase ClientesDAO.java creada el 15/02/2023.
 */
package implementaciones;

import dominio.Cliente;
import excepciones.PersistenciaException;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import java.util.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public class ClientesDAO implements IClientesDAO {
 
    private final IConexionBD GENERADOR_CONEXION;
    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
  
    public ClientesDAO(IConexionBD generadorConexion) {
        this.GENERADOR_CONEXION = generadorConexion;
    }

//    @Override
//    public Cliente consultar(int idCliente) {
//        String codigoSQL =  "SELECT nombre, apellido_paterno, apellido_materno FROM clientes where id = ?;";
//        try
//            (Connection conexion = GENERADOR_CONEXION.crearConexion();
//            PreparedStatement comando = conexion.prepareStatement(codigoSQL)){;
//            comando.setInt(1, idCliente);
//            ResultSet resultado = comando.executeQuery();
//            Cliente cliente = null;
//            while(resultado.next()){
//             cliente = new Cliente();
//             int id = resultado.getInt("id");
//             String nombres = resultado.getString("nombre");
//             String apellido_paterno = resultado.getString("apellido_paterno");
//             String apellido_materno = resultado.getString("apellido_materno");
//             cliente = new Cliente(id,nombres,apellido_paterno,apellido_materno,1);
//            }
//            conexion.close();
//            return cliente;
//        } catch (SQLException ex) {
//            
//            return null;
//        }
//    }


 @Override
    public Cliente insertar(Cliente cliente) throws PersistenciaException {
        String codigoSQL = "INSERT INTO CLIENTES (nombres,apellido_paterno,apellido_materno,id_direccion,password,fecha_nacimiento) values (?,?,?,?,?,?);";

        try (
                Connection conexion = this.GENERADOR_CONEXION.crearConexion();
                PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setString(1, cliente.getNombre());
            comando.setString(2, cliente.getApellidoPaterno());
            comando.setString(3, cliente.getApellidoMaterno());
            comando.setInt(4, cliente.getDireccion().getId());
            comando.setString(5, cliente.getPassword());
            comando.setDate(6, cliente.getFechaNacimiento());
            comando.executeUpdate();
            ResultSet llaves = comando.getGeneratedKeys();
            if (llaves.next()) {
                Integer llavePrimaria = llaves.getInt(1);
                cliente.setId(llavePrimaria);
                return cliente;
            }
            throw new PersistenciaException("Cliente registrado, pero ID no generado");

        } catch (SQLException e) {
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible registrar al cliente");
        }
    }

 

    @Override
    public Cliente actualizar(Cliente cliente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultar(int idCliente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
