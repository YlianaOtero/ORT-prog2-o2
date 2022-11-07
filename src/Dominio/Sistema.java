package Dominio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/** Clase principal del programa.
 * @author yliana*/
public class Sistema implements Serializable {
    private Inventario inventario;
    private ListaDrones drones;
    private Personal personal;
    private ListaCargas cargas;
    private ListaVuelos vuelos;
    private ObjectInputStream in;
    
    /** Crea un objeto de tipo Sistema.
     * @param sistemaPrecargado si es True, se debe intentar cargar los datos del sistema desde archivos existentes.
     * Si es False, es debe crear todo desde cero.*/
    public Sistema(boolean sistemaPrecargado) {
        if (sistemaPrecargado) {
            cargarSistema();
        } else {
            inicializarDeCero();
        }
    }

    /** @return El inventario del sistema.*/
    public Inventario getInventario() {
        return inventario;
    }

    /** @return La lista de drones del sistema.*/
    public ListaDrones getDrones() {
        return drones;
    }

    /** @return El personal del sistema.*/
    public Personal getPersonal() {
        return personal;
    }

    /** @return La lista de cargas del sistema.*/
    public ListaCargas getCargas() {
        return cargas;
    }

    /** @return La lista de vuelos del sistema.*/
    public ListaVuelos getVuelos() {
        return vuelos;
    }

    /** Se cargan todos los elementos del Sistema desde archivos preexistentes. */
    private void cargarSistema() {
        cargarInventario();
        cargarPersonal();
        cargarDrones(); 
        cargarCargas();
        cargarVuelos();
    }
    
    /** Se cargan todos los elementos el sistema desde un estado limpio.*/
    private void inicializarDeCero() {
        inventario = new Inventario();
        drones = new ListaDrones();
        personal = new Personal();
        cargas = new ListaCargas();
        vuelos = new ListaVuelos();
    }

    /** Se intenta cargar el inventario desde un archivo preexistente. En caso de
     * que no se encuentre el archivo, se carga el inventario desde cero.*/
    private void cargarInventario() {
        try {
            in = new ObjectInputStream(new FileInputStream("articulos"));
            inventario = (Inventario)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            inventario = new Inventario();
        }
    }

    /** Se intenta cargar el personal desde un archivo preexistente. En caso de
     * que no se encuentre el archivo, se carga el personal desde cero.*/
    private void cargarPersonal() {
        try {
            in = new ObjectInputStream(new FileInputStream("funcionarios"));
            personal = (Personal)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            personal = new Personal();
        }
    }

    /** Se intenta cargar la lista de drones desde un archivo preexistente. 
     * En caso de que no se encuentre el archivo, se carga la lista desde cero.*/
    private void cargarDrones() {
        try {
            in = new ObjectInputStream(new FileInputStream("drones"));
            drones = (ListaDrones)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            drones = new ListaDrones();
        }
    }

    /** Se intenta cargar la lista de cargas desde un archivo preexistente. 
     * En caso de que no se encuentre el archivo, se carga la lista desde cero.*/
    private void cargarCargas() {
        try {
            in = new ObjectInputStream(new FileInputStream("cargas"));
            cargas = (ListaCargas)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            cargas = new ListaCargas();
        }
    }

    /** Se intenta cargar la lista de vuelos desde un archivo preexistente. 
     * En caso de que no se encuentre el archivo, se carga la lista desde cero.*/
    private void cargarVuelos() {
        try {
            in = new ObjectInputStream(new FileInputStream("vuelos"));
            vuelos = (ListaVuelos)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            vuelos = new ListaVuelos();
        }
    }
}