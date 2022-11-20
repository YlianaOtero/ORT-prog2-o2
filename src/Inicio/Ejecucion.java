package Inicio;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Dominio.*;
import Interfaz.*;
/**
 *
 * @author natalia
 */
public class Ejecucion {
    
    public static void main(String[] args) {
        Sistema datos = cargarSistema(); 

        Inicio ventanaIni = new Inicio(datos);
        ventanaIni.setVisible(true);
    }    

    public static Sistema cargarSistema() {
        Sistema datos; 
        ObjectInputStream in;

        try {
            in = new ObjectInputStream(new FileInputStream("sistema"));
            datos = (Sistema)in.readObject();
        
           datos.crearManejador();
        } catch (IOException | ClassNotFoundException | NullPointerException ex) {
            datos =  new Sistema();
        }
        
        return datos;
    }
}
