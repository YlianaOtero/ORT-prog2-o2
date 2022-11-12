package Dominio;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaVuelos implements Serializable {
    private ArrayList<Vuelo> lista;
    private int cantidad;
    transient private PropertyChangeSupport manejador;

    /** Crea un objeto de tipo ListaVuelos.*/
    public ListaVuelos() {
        manejador = new PropertyChangeSupport(this);
        this.lista = new ArrayList<Vuelo>();
        this.cantidad = 0;
    }

    public void crearManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }
    
    /** @return El ArrayList de Vuelos.*/
    public ArrayList<Vuelo> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de Vuelos presentes en la lista. */
    public int getCantidad() {
        return this.cantidad;
    }

    /** Agrega un Vuelo a la lista, sin importar si este ya estaba presente. 
     * @param unVuelo el Vuelo a agregar.*/
    public void agregarVuelo(Vuelo unVuelo) {
        ArrayList<Vuelo> listaAnterior = this.lista;
        int cantidadAnterior = this.cantidad;

        this.lista.add(unVuelo);
        this.cantidad++;

        actualizarEnListener(listaAnterior, cantidadAnterior);
    }
    
    private void actualizarEnListener(ArrayList<Vuelo> listaAnterior, int cantidadAnterior) {
        manejador.firePropertyChange("lista", listaAnterior, this.lista);
        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
    }
    
    /** Busca a un Vuelo puntual en la lista.
     * @param unVuelo el Vuelo a buscar en la lista.
     * @return Devuelve true si el Vuelo fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Vuelo unVuelo) {
        return this.lista.contains(unVuelo);
    }
}
