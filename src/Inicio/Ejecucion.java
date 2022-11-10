
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
            Inventario i = new Inventario(); // para volver a crear el manejador
        } catch (IOException | ClassNotFoundException ex) {
            datos =  new Sistema(true);
        }

        Inicio ventanaIni = new Inicio(datos);
        //cree la ventana de inicio (la de la clase VentanaInicial.java)
        ventanaIni.setVisible(true);
        //la hago visiblen
    }    
}
