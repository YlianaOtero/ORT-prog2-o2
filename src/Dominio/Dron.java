package Dominio;

import java.io.Serializable;

/** Representa a un dron puntual, con su código de indentificación, modelo y
 * tipo de cámara.
 * @author yliana*/
public class Dron implements Serializable {
    private String identificacion;
    private String modelo;
    private int tipoCamara;
    private boolean tieneVuelos;

    public boolean getTieneVuelos() {
        return tieneVuelos;
    }

    public void setTieneVuelos(boolean tieneVuelos) {
        this.tieneVuelos = tieneVuelos;
    }

    /** Crea un objeto de tipo Dron. Se asume que los datos son correctos.
     * @param unaIdentificacion código de identificación del dron.
     * @param unModelo modelo del dron.
     * @param unTipoCamara un entero entre el 1 y el 6, que representa al tipo de cámara del dron.*/
    public Dron(String unaIdentificacion, String unModelo, int unTipoCamara) {
        this.identificacion = unaIdentificacion;
        this.modelo = unModelo;
        this.tipoCamara = unTipoCamara;
        this.tieneVuelos = false;
    }
    
    /** @return Código de identificación del dron.*/
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    /** @return Modelo del dron.*/
    public String getModelo() {
        return this.modelo;
    }
    
    /** @return Un entero entre el 1 y el 6, que representa al tipo de cámara del dron.*/
    public int getTipoCamara() {
        return this.tipoCamara;
    }
    
    /** Modifica el código de identificación del dron. Se asume que los datos son correctos.
     * @param unaIdentificacion el nuevo código de identificación a sobreescribir en el dron.*/
    public void setIdentificacion(String unaIdentificacion) {
        this.identificacion = unaIdentificacion;
    }
    
    /** Modifica el modelo del dron. Se asume que los datos son correctos.
     * @param unModelo el nuevo modelo a sobreescribir en el dron.*/
    public void setModelo(String unModelo) {
        this.modelo = unModelo;
    }
    
    /** Modifica el tipo de cámara del dron. Se asume que los datos son correctos.
     * @param unTipoCamara el nuevo tipo de cámara a sobreescribir en el dron.
     */
    public void setTipoCamara(int unTipoCamara) {
        this.tipoCamara = unTipoCamara;
    }
}
