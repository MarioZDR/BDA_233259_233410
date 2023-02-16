/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Direccion;
import excepciones.PersistenciaException;

/**
 *
 * @author Gabriel Mancinas
 */
public interface IDireccionesDAO {
    Direccion insertar(Direccion direccion) throws PersistenciaException;
    Direccion consultar(Direccion direccion) throws PersistenciaException;
}
