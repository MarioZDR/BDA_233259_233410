/**
 * Clase PersistenciaException creada el 15/02/2023.
 */
package excepciones;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public class PersistenciaException extends Exception{

    public PersistenciaException() {
    }

    public PersistenciaException(String string) {
        super(string);
    }

    public PersistenciaException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PersistenciaException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PersistenciaException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

  
    
}
