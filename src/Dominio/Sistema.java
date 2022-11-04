package Dominio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

/** Clase principal del programa.
 * @author yliana*/
public abstract class Sistema implements Serializable {
    private static Inventario inventario;
    private static ListaDrones drones;
    private static Personal personal;
    private static ArrayList<Carga> cargas;
    private static ArrayList<Vuelo> vuelos;
    public static boolean sistemaPrecargado = false;
    
    public static void main(String[] args) {
        if (sistemaPrecargado) {
            
        } else {
            inicializarDeCero();
        }
        //ACA TIENE QUE CREARSE LA VENTANA DE MENU PRINCIPAL!!
    }
    
    public static void inicializarDeCero() {
        inventario = new Inventario();
        drones = new ListaDrones();
        personal = new Personal();
        cargas = new ArrayList<Carga>();
        vuelos = new ArrayList<Vuelo>();
    }
    
    public static void cargarSistema() {
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("articulos"));
            inventario = (Inventario)in.readObject();
        } catch (FileNotFoundException ex) {
            inventario = new Inventario();
        } catch (IOException | ClassNotFoundException ex) {
            inventario = new Inventario();
        }
        
        try {
            in = new ObjectInputStream(new FileInputStream("drones"));
            drones = (ListaDrones)in.readObject();
        } catch (FileNotFoundException ex) {
            drones = new ListaDrones();
        } catch (IOException | ClassNotFoundException ex) {
            drones = new ListaDrones();
        }
        
        try {
            in = new ObjectInputStream(new FileInputStream("funcionarios"));
            personal = (Personal)in.readObject();
        } catch (FileNotFoundException ex) {
            personal = new Personal();
        } catch (IOException | ClassNotFoundException ex) {
            personal = new Personal();
        }
        
        
    }
    
}