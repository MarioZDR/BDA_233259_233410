package validadores;

import dominio.Cliente;
import dominio.Direccion;
import excepciones.PersistenciaException;
import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 00000233410_00000233259
 */
public class Validador {

    /**
     * Constructor por defecto.
     */
    public Validador() {

    }

    /**
     * Método que valida un campo.
     *
     * @param nombre campo a validar 5 a 30 caracteres solo letras y espacios.
     * @return Verdadero o falso si se ha validado el campo.
     */
    public boolean validaCampoSinNumero(String nombre)throws PersistenciaException {
        String patron = "^(?=.{1,35}$)[a-zA-Z]+(?: [a-zA-Z]+)*$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(nombre);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * Método que valida un campo.
     *
     * @param nombre campo a validar 5 a 30 caracteres letras, espacio, "_" y numeros.
     * @return Verdadero o falso si se ha validado el campo.
     */
    public boolean validaCampoConNumero(String nombre)throws PersistenciaException {
        String patron = "^(?=.{1,35}$)[a-zA-Z0-9]+(?: [a-zA-Z0-9]+)*$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(nombre);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    
    /**
     * Método que valida una contraseña.
     *
     * @param pass contraseña a validar.
     * @return Verdadero o falso si se ha validado el contraseña.
     */
    public boolean validaContrasenia(String pass)throws PersistenciaException {
        String patron = "^(?i)(?=.*[a-z])(?=.*[0-9])[a-z0-9#.!@$*&_]{8,30}$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(pass);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * Método que valida una fecha.
     *
     * @param fecha fecha a validar.
     * @return Verdadero o falso si se ha validado el fecha.
     */
    public boolean validaFecha(Date fecha) throws PersistenciaException{
        if (fecha != null) {
            return true;
        } else {
            throw new PersistenciaException("Selecciona una fecha.");
        }
    }
    
    public void validarCliente(Cliente cliente) throws PersistenciaException {
        if (cliente.getNombre()!= null && cliente.getApellidoMaterno()!= null && 
                cliente.getApellidoPaterno()!= null && cliente.getPassword()!= null) {
            if (!cliente.getNombre().trim().equals("")
                    && !cliente.getApellidoMaterno().trim().equals("")
                    && !cliente.getApellidoPaterno().trim().equals("")
                    && !cliente.getPassword().trim().equals("")) {
                if(this.validaCampoSinNumero(cliente.getNombre())&&
                        this.validaCampoSinNumero(cliente.getApellidoMaterno())
                        &&this.validaCampoSinNumero(cliente.getApellidoPaterno())
                        &&this.validaContrasenia(cliente.getPassword())){
                    System.out.println("Cliente validado");
                }else{
                    throw new PersistenciaException("Formato invalido del cliente");
                }
            }else{
                throw new PersistenciaException("Formato invalido del cliente");
            }
        }else{
            throw new PersistenciaException("Formato invalido del cliente");
        }
    }

    public void validarDireccion(Direccion direccion) throws PersistenciaException {
        if (direccion.getCalle() != null && direccion.getColonia() != null && direccion.getNumeroCasa() != null) {
            if (!direccion.getCalle().trim().equals("")
                    && !direccion.getColonia().trim().equals("")
                    && !direccion.getNumeroCasa().trim().equals("")) {
                if(this.validaCampoSinNumero(direccion.getCalle())&&
                        this.validaCampoSinNumero(direccion.getColonia())&&
                        this.validaCampoConNumero(direccion.getNumeroCasa())){
                    System.out.println("Direccion valida");
                }else{
                     throw new PersistenciaException("Formato invalido de la direccion");
                }
            }else{
                throw new PersistenciaException("Formato invalido de la direccion");
            }
        }else{
            throw new PersistenciaException("Formato invalido de la direccion");
        }
    }
    
    
}