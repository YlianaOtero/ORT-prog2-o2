package Dominio;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Interfaz.IngresoDron;

/** Representa un registro de drones.
 * @author yliana*/
public class ListaDrones implements Serializable {
    private ArrayList<Dron> lista;
    private int cantidad;
    transient private PropertyChangeSupport manejador;
    
    /** Crea un objeto de tipo ListaDrones.*/
    public ListaDrones() {
        this.manejador = new PropertyChangeSupport(this);
        this.lista = new ArrayList<Dron>();
        this.cantidad = 0;
    }

    public void crearManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }
    
    /** @return El ArrayList de drons.*/
    public ArrayList<Dron> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de drons registrados. */
    public int getCantidad() {
        return this.cantidad;
    }
    
    /** @param pos una posición válida en la lista.
     * @return El dron presente en la posición de la lista pasada por parámetro.*/
    public Dron getDronEnPos(int pos) {
        return this.lista.get(pos);
    }
    
    /** @param unDron el dron a agregar.
     * @return Devuelve 1 en caso de haber agregado el dron exitosamente. En 
     * cualquier otro caso, no fue agregado. Si devuelve 0, es porque el dron
     * ya existía previamente en la lista, y si devuelve -1, es porque la lista
     * ya contiene a otro dron con el mismo identificacion.*/
    public void agregarDron(Dron unDron) {
        ArrayList<Dron> listaAnterior = this.lista;
        int cantidadAnterior = this.cantidad;

        this.lista.add(unDron);
        this.cantidad++;  

        actualizarEnListener(listaAnterior, cantidadAnterior);
    }

    private void actualizarEnListener(ArrayList<Dron> listaAnterior, int cantidadAnterior) {
        manejador.firePropertyChange("lista", listaAnterior, this.lista);
        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
    }
    
    /** Busca a un dron puntual en la lista.
     * @param unDron el dron a buscar en la lista.
     * @return Devuelve true si el dron fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Dron unDron) {
        return this.lista.contains(unDron);
    }
    
    /** Busca un identificacion puntual entre todos los Identificaciones de los drons de la lista.
     * @param unIdentificacion el identificacion a buscar en la lista.
     * @return Devuelve true si hay algun dron en la lista con ese identificacion, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean identificacionYaExistente(String unIdentificacion) {
        boolean existe = false;
        for (int pos = 0; pos < this.cantidad && !existe; pos++) {
            Dron dronActual = this.lista.get(pos);
            String identificacionActual = dronActual.getIdentificacion();
            
            existe = identificacionActual.equalsIgnoreCase(unIdentificacion);
        }
        
        return existe;
    }
    
    /** Ordena la lista alfabéticamente por identificacion, sin distinguir mayúsculas de minúsculas.*/
    public void ordenarLista() { 
        Collections.sort(this.lista, new Comparator<Dron>(){
            @Override
            public int compare(Dron art1, Dron art2) {
                String identificacion1 = art1.getIdentificacion();
                String identificacion2 = art2.getIdentificacion();
                return identificacion1.compareToIgnoreCase(identificacion2);
            }
        });
    }

    public void agregarListener(IngresoDron ingresoDron) {
        manejador.addPropertyChangeListener(ingresoDron); // anota interesado
    }
}
