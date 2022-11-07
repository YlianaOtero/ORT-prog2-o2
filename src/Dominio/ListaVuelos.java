package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaVuelos implements Serializable {
    private ArrayList<Vuelo> lista;
    private int cantidad;

    /** Crea un objeto de tipo ListaVuelos.*/
    public ListaVuelos() {
        this.lista = new ArrayList<Vuelo>();
        this.cantidad = 0;
    }
    
    /** @return El ArrayList de Vuelos.*/
    public ArrayList<Vuelo> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de Vuelos presentes en la lista. */
    public int getCantidad() {
        return this.cantidad;
    }

    /** @param pos una posición válida en la lista.
     * @return El Vuelo presente en la posición de la lista pasada por parámetro.*/
    public Vuelo getVueloEnPos(int pos) {
        return this.lista.get(pos);
    }

    /** Agrega un Vuelo a la lista, sin importar si este ya estaba presente. 
     * @param unVuelo el Vuelo a agregar.*/
    public void agregarVuelo(Vuelo unVuelo) {
        this.lista.add(unVuelo);
        this.cantidad++;
    }
    
    /** Borra al Vuelo de la lista, cuando este mismo Vuelo pertenece a ella.
     * @param unVuelo - Vuelo a remover
     * @return Devuelve 1 en caso de que el Vuelo haya sido eliminado exitosamente.
     * Si el Vuelo no fue elminado, es porque no existe tal Vuelo en la lista,
     * en cuyo caso se retorna -1.*/
    public int removerVuelo(Vuelo unVuelo) {
        int resultado = 1;
        
        if (estaEnLaLista(unVuelo)) {
            resultado = -1;
        } else {
            this.lista.remove(unVuelo);
            this.cantidad--;
        }
        
        return resultado;
    }
    
    /** Borra de la lista la Vuelo presente en la posición pos.
     * @param pos - una posición válida de la lista (rango 0..cantidad)*/
    public void removerVueloEnPos(int pos) {
        this.lista.remove(pos);
        this.cantidad--;
    }
    
    /** Busca a un Vuelo puntual en la lista.
     * @param unVuelo el Vuelo a buscar en la lista.
     * @return Devuelve true si el Vuelo fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Vuelo unVuelo) {
        return this.lista.contains(unVuelo);
    }
}
