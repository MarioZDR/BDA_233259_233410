/*
Cuenta.java creada el 15/02/2023
*/
package dominio;

import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author 00000233259 y 00000233410.
 */
public class Cuenta {
    /**
     * Atributo que representa el número de cuenta.
     */
    private Integer numCuenta;
    /**
     * Atributo que representa la fecha de apertura de la cuenta.
     */
    private Date fechaApertura;
    /**
     * Atributo que representa el saldo de la cuenta.
     */
    private float saldo;
    /**
     * Atributo que representa la ID del cliente a la cual le pertenece la cuenta.
    */
    private Integer idCliente;
    /**
     * Atributo que representa el estado de la cuenta (Activo o Cancelado).
     */
    private String estado;
    /**
     * Constructor por defecto.
     */
    public Cuenta() {
    }
    /**
     * Constructor que inicializa los atributos al valor de los parámetros enviados, además de asignar el saldo a cero.
     * @param numCuenta número de la cuenta.
     * @param fechaApertura fecha de apertura de la cuenta.
     * @param idCliente ID del dueño de la cuenta.
     * @param estado estado de la cuenta.
     */
    public Cuenta(Integer numCuenta, Date fechaApertura, Integer idCliente, String estado) {
        this.numCuenta = numCuenta;
        this.fechaApertura = fechaApertura;
        this.idCliente = idCliente;
        this.estado = estado;
        this.saldo=0f;
    }
    /**
     * Método que regresa el número de cuenta.
     * @return número de cuenta.
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * Método que asigna el número de cuenta al valor de su parámetro.
     * @param numCuenta número de cuenta.
     */
    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Método que regresa la fecha de apertura de la cuenta.
     * @return fecha de apertura de la cuenta.
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }
    /**
     * Método que asigna la fecha de apertura al valor de su parámetro.
     * @param fechaApertura 
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    /**
     * Método que regresa el saldo de la cuenta.
     * @return saldo de la cuenta.
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * Método que asigna el saldo de la cuenta.
     * @param saldo 
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * Método que regresa la ID del cliente.
     * @return ID del cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }
    /**
     * Método que asigna la ID del cliente al valor de su parámetro.
     * @param idCliente 
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    /**
     * Método que obtiene el estado de la cuenta.
     * @return estado de la cuenta.
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Método que asigna el estado de la cuenta.
     * @param estado estado de la cuenta.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Método hashCode de la clase Cuenta.
     * @return hashCode.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numCuenta;
        return hash;
    }
    /**
     * Método equals de la clase Cuenta.
     * @param obj objeto Cuenta a comparar.
     * @return valor booleano.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if (this.numCuenta != other.numCuenta) {
            return false;
        }
        return true;
    }
    /**
     * Método toString de la clase Cuenta.
     * @return objeto representado en String.
     */
    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", idCliente=" + idCliente + ", estado=" + estado + '}';
    }
    
    
}
