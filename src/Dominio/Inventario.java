package Dominio;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Interfaz.IngresoArticulo;

/** Representa un inventario de articulos.
 * @author yliana*/
public class Inventario implements Serializable {
    private ArrayList<Articulo> lista;
    private int cantidad;
    private PropertyChangeSupport manejador;
    
    /** Crea un objeto de tipo Inventario.*/
    public Inventario() {
        manejador = new PropertyChangeSupport(this);
        this.lista = new ArrayList<Articulo>();
        this.cantidad = 0;
    }
    
    /** @return El ArrayList de artículos.*/
    public ArrayList<Articulo> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de artículos presentes en la lista. */
    public int getCantidad() {
        return this.cantidad;
    }
    
    /** @param pos una posición válida en la lista.
     * @return El artículo presente en la posición de la lista pasada por parámetro.*/
    public Articulo getArticuloEnPos(int pos) {
        return this.lista.get(pos);
    }
    
    /** Busca a un artículo puntual en la lista. Se asume que el artículo está presente.
     * @param unArticulo - el artículo a buscar.
     * @return La posición del artículo en la lista.*/
    public int getPosArticulo(Articulo unArticulo) {
        boolean encontrado = false;
        
        int pos = 0;
        
        while (pos < this.cantidad && !encontrado) {
            encontrado = unArticulo.equals(this.lista.get(pos));
            pos++;
        }
        
        return pos;
    }
    
    /** Busca un artículo puntual en la lista, pero por nombre. Se asume que existe
     * un artículo con ese nombre en la lista.
     * @param unNombre - el nombre del artículo a buscar.
     * @return La posición del artículo con este nombre en la lista.*/
    public int getPosArticulo(String unNombre) {
        boolean encontrado = false;
        
        int pos = 0;
        
        while (pos < this.cantidad && !encontrado) {
            encontrado = unNombre.equalsIgnoreCase(this.lista.get(pos).getNombre());
            pos++;
        }
        
        return pos;
    }
    
    /** Agrega un articulo a la lista, sin importar si este ya estaba presente. 
     * @param unArticulo el artículo a agregar.*/
    public void agregarArticulo(Articulo unArticulo) {
        ArrayList<Articulo> listaAnterior = this.lista;
        int cantidadAnterior = this.cantidad;

        this.lista.add(unArticulo);
        this.cantidad++;

        actualizarEnListener(listaAnterior, cantidadAnterior);
    }

    private void actualizarEnListener(ArrayList<Articulo> listaAnterior, int cantidadAnterior) {
        manejador.firePropertyChange("lista", listaAnterior, this.lista);
        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
    }
    
    /** Borra al artículo de la lista, cuando este mismo artículo pertenece a ella.
     * @param unArticulo - artículo a remover
     * @return Devuelve 1 en caso de que el artículo haya sido eliminado exitosamente.
     * Si el artículo no fue elminado, es porque no existe tal artículo en la lista,
     * en cuyo caso se retorna -1.*/
    public int removerArticulo(Articulo unArticulo) {
        int resultado = 1;
        
        if (estaEnLaLista(unArticulo)) {
            resultado = -1;
        } else {
            ArrayList<Articulo> listaAnterior = this.lista;
            int cantidadAnterior = this.cantidad;

            this.lista.remove(unArticulo);
            this.cantidad--;

            actualizarEnListener(listaAnterior, cantidadAnterior);
        }
        
        return resultado;
    }
    
    /** Borra de la lista al artículo presente en la posición pos.
     * @param pos - una posición válida de la lista (rango 0..cantidad)*/
    public void removerArticuloEnPos(int pos) {
        ArrayList<Articulo> listaAnterior = this.lista;
        int cantidadAnterior = this.cantidad;

        this.lista.remove(pos);
        this.cantidad--;

        actualizarEnListener(listaAnterior, cantidadAnterior);
    }
    
    /** Busca a un artículo puntual en la lista.
     * @param unArticulo el artículo a buscar en la lista.
     * @return Devuelve true si el artículo fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Articulo unArticulo) {
        return this.lista.contains(unArticulo);
    }
    
    /** Busca un nombre puntual entre todos los nombres de los artículos de la lista.
     * @param unNombre el nombre a buscar en la lista.
     * @return Devuelve true si hay algun artículo en la lista con ese nombre, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean nombreYaExistente(String unNombre) {
        boolean existe = false;
        for (int pos = 0; pos < this.cantidad && !existe; pos++) {
            Articulo articuloActual = this.lista.get(pos);
            String nombreActual = articuloActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
        }
        
        return existe;
    }
    
    /** Ordena la lista alfabéticamente por nombre, sin distinguir mayúsculas de minúsculas.*/
    public void ordenarLista() { 
        Collections.sort(this.lista, new Comparator<Articulo>(){
            @Override
            public int compare(Articulo art1, Articulo art2) {
                String nombre1 = art1.getNombre();
                String nombre2 = art2.getNombre();
                return nombre1.compareToIgnoreCase(nombre2);
            }
        });
    }

    public void agregarListener(IngresoArticulo ingresoArticulo) {
        manejador.addPropertyChangeListener(ingresoArticulo); // anota interesado
    }
}
