/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

/** Representa un vuelo puntual, con el id, area, fila
 * y cargas correspondientes.
 * @author ylian*/
public class Vuelo implements Serializable {
    private String idDron;
    private char area;
    private int fila;
    private String[] cargas;
    private int coincidencias;
    private int diferencias;
    private String archivo;
    
    /** Crea un objeto de tipo Vuelo. Se asume que los datos son correctos.
     * @param id código de identificación del dron del vuelo
     * @param area área del vuelo (entre A y E)
     * @param fila fila del vuelo (entre 1 y 12)
     * @param cargas contiene los codigos de las cargas
     * @param archivo el nombre del archivo desde el que se ingresó el vuelo*/
    public Vuelo(String id, char area, int fila, String[] cargas, String archivo) {
        this.idDron = id;
        this.area = area;
        this.fila = fila;
        this.cargas = cargas;
        this.archivo = archivo;
        this.coincidencias = 0;
        this.diferencias = 0;
    }
    
    /** @return Código de identificación del dron responsable del vuelo.*/
    public String getIdDron() {
        return this.idDron;
    }
    
    /** @return Área del vuelo.*/
    public char getArea() {
        return this.area;
    }
    
    /** @return Fila del vuelo.*/
    public int getFila() {
        return fila;
    }

    /** @return Arreglo con los códigos de las cargas del vuelo.*/
    public String[] getCargas() {
        return cargas;
    }

    /** @return Nombre del archivo desde el que se ingresó el vuelo*/
    public String getArchivo() {
        return archivo;
    }
    
    /** @return Coincidencias encontradas entre el vuelo y las cargas ingresadas en area y fila correspondiente*/
    public int getCoincidencias() {
        return coincidencias;
    }

    /** @return Diferencias encontradas entre el vuelo y las cargas ingresadas en area y fila correspondiente*/
    public int getDiferencias() {
        return diferencias;
    }

    /** @param coincidencias coincidencias encontradas entre el vuelo y las cargas ingresadas en area y fila correspondiente*/
    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    /** @param diferencias diferencias encontradas entre el vuelo y las cargas ingresadas en area y fila correspondiente*/
    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
    }
}