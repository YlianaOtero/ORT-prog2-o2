
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
        Sistema datos; 
        ObjectInputStream in;
        
        try {
            in = new ObjectInputStream(new FileInputStream("sistema"));
            datos = (Sistema)in.readObject();
        
           crearManejadores(datos);
        } catch (IOException | ClassNotFoundException ex) {
            datos =  new Sistema(true);
        }

        Inicio ventanaIni = new Inicio(datos);
        ventanaIni.setVisible(true);
    }    

    public static void crearManejadores(Sistema datos) {
        Inventario inventario = datos.getInventario();
        Personal personal = datos.getPersonal();
        ListaDrones drones = datos.getDrones();

        inventario.crearManejador();
        personal.crearManejador();
        drones.crearManejador();
    }
}
