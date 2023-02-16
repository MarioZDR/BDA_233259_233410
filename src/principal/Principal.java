/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import UI.FrmLogin;
import implementaciones.ClientesDAO;
import implementaciones.ConexionBD;
import implementaciones.DireccionesDAO;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import interfaces.IDireccionesDAO;

/**
 *
 * @author 00000233259_00000233410
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IConexionBD generadorConexiones = new ConexionBD("jdbc:mysql://localhost/bancoproyectouno","root","12345678");
        IClientesDAO clientesDAO = new ClientesDAO(generadorConexiones);
        IDireccionesDAO direccionesDAO = new DireccionesDAO(generadorConexiones);
        new FrmLogin(clientesDAO,direccionesDAO).setVisible(true);
    }
    
}
