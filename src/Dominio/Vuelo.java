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
    
    public int getCoincidencias() {
        return coincidencias;
    }

    public int getDiferencias() {
        return diferencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
    }
   
    
    /** Crea un objeto de tipo Vuelo. Se asume que los datos son correctos.
     * @param id código de identificación del dron del vuelo.
     * @param area área del vuelo (entre A y E)
     * @param fila fila del vuelo (entre 1 y 12)
     * @param cargas contiene los codigos de las cargas */
    public Vuelo(String id, char area, int fila, String[] cargas) {
        this.idDron = id;
        this.area = area;
        this.fila = fila;
        this.cargas = cargas;
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
    
    /** Verifica que un área sea correcta para un vuelo.
     * @param areaPosible el área a evaluar si es válida o no.
     * @return True en caso de ser un área válida, False en caso contrario.*/
    public static boolean areaValida(char areaPosible) {
        return "ABCDEF".contains(Character.toString(areaPosible));
    }
    
    /** Verifica que una fila sea correcta para un vuelo.
     * @param filaPosible la fila a evaluar si es válida o no.
     * @return True en caso de ser una fila válida, False en caso contrario.*/
    public static boolean filaValida(int filaPosible) {
        return filaPosible > 0 && filaPosible <= 12;
    }
}