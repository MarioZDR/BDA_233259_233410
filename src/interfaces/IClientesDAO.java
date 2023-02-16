/**
 * Clase IClientesDAO.java creada el 15/02/2023.
 */
package interfaces;

import dominio.Cliente;
import excepciones.PersistenciaException;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public interface IClientesDAO {
     Cliente consultar(int idCliente)throws PersistenciaException;
    Cliente insertar(Cliente cliente) throws PersistenciaException;
    Cliente actualizar(Cliente cliente) throws PersistenciaException;
}
