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
 //   private ListaCargas cargas;
    private ListaVuelos vuelos;
    private ObjectInputStream in;
    
    /** Crea un objeto de tipo Sistema.
     * @param sistemaPrecargado si es True, se debe intentar cargar los datos del sistema desde archivos existentes.
     * Si es False, es debe crear todo desde cero.*/
    public Sistema(boolean sistemaPrecargado) {
        /* if (sistemaPrecargado) {
            cargarSistema();
        } else {
            inicializarDeCero();
        } */

        inventario = new Inventario();
        drones = new ListaDrones();
        personal = new Personal();
      //  cargas = new ListaCargas();
        vuelos = new ListaVuelos();
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
  /*    public ListaCargas getCargas() {
        return cargas;
    }*/

    /** @return La lista de vuelos del sistema.*/
    public ListaVuelos getVuelos() {
        return vuelos;
    }

    /** Se cargan todos los elementos del Sistema desde archivos preexistentes. */
    private void cargarSistema() {
        
    }
    
    /** Se cargan todos los elementos el sistema desde un estado limpio.*/
    private void inicializarDeCero() {
        inventario = new Inventario();
        drones = new ListaDrones();
        personal = new Personal();
      //  cargas = new ListaCargas();
        vuelos = new ListaVuelos();
    }

}