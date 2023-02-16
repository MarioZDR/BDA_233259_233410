/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import dominio.Direccion;
import excepciones.PersistenciaException;
import interfaces.IConexionBD;
import interfaces.IDireccionesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Mancinas
 */
public class DireccionesDAO implements IDireccionesDAO{
    private final IConexionBD GENERADOR_CONEXION;
    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    
    
    public DireccionesDAO(IConexionBD generadorConexion) {
     this.GENERADOR_CONEXION = generadorConexion;
    }

    @Override
    public Direccion insertar(Direccion direccion) throws PersistenciaException {
        String codigoSQL = "INSERT INTO DIRECCIONES (numero,calle,colonia) values (?,?,?);";

        try (
                Connection conexion = this.GENERADOR_CONEXION.crearConexion();
                PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setString(1, direccion.getNumeroCasa());
            comando.setString(2, direccion.getCalle());
            comando.setString(3, direccion.getColonia());

            comando.executeUpdate();
            ResultSet llaves = comando.getGeneratedKeys();
            if (llaves.next()) {
                Integer llavePrimaria = llaves.getInt(1);
                direccion.setId(llavePrimaria);
                return direccion;
            }
            throw new PersistenciaException("Dirección registrada, pero ID no generado");

        } catch (SQLException e) {
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible registrar la dirección");
        }
    }

    @Override
    public Direccion consultar(Direccion direccion) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    

