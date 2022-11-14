//package Dominio;
//
//import java.beans.PropertyChangeSupport;
//import java.io.Serializable;
//import java.util.ArrayList;
//
//import Interfaz.IngresoArticulo;
//
///** Representa un inventario de articulos.
// * @author yliana*/
//public class Inventario implements Serializable {
//    private ArrayList<Articulo> lista;
//    private int cantidad;
//    transient private PropertyChangeSupport manejador;
//
//    /** Crea un objeto de tipo Inventario.*/
//    public Inventario() {
//        manejador = new PropertyChangeSupport(this);
//        this.lista = new ArrayList<Articulo>();
//        this.cantidad = 0;
//    }
//    
//    public void crearManejador() {
//        this.manejador = new PropertyChangeSupport(this);
//    }
//    
//    /** @return El ArrayList de artículos.*/
//    public ArrayList<Articulo> getLista() {
//        return this.lista;
//    }
//    
//    /** @return La cantidad de artículos presentes en la lista. */
//    public int getCantidad() {
//        return this.cantidad;
//    }
//    
//    /** @param pos una posición válida en la lista.
//     * @return El artículo presente en la posición de la lista pasada por parámetro.*/
//    public Articulo getArticuloEnPos(int pos) {
//        return this.lista.get(pos);
//    }
//    
//    /** Agrega un articulo a la lista, sin importar si este ya estaba presente. 
//     * @param unArticulo el artículo a agregar.*/
//    public void agregarArticulo(Articulo unArticulo) {
//        ArrayList<Articulo> listaAnterior = this.lista;
//        int cantidadAnterior = this.cantidad;
//
//        this.lista.add(unArticulo);
//        this.cantidad++;
//
//        actualizarEnListener(listaAnterior, cantidadAnterior);
//    }
//
//    private void actualizarEnListener(ArrayList<Articulo> listaAnterior, int cantidadAnterior) {
//        manejador.firePropertyChange("lista", listaAnterior, this.lista);
//        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
//    }
//    
//    /** Busca un nombre puntual entre todos los nombres de los artículos de la lista.
//     * @param unNombre el nombre a buscar en la lista.
//     * @return Devuelve true si hay algun artículo en la lista con ese nombre, 
//     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
//    public boolean nombreYaExistente(String unNombre) {
//        boolean existe = false;
//        for (int pos = 0; pos < this.cantidad && !existe; pos++) {
//            Articulo articuloActual = this.lista.get(pos);
//            String nombreActual = articuloActual.getNombre();
//            
//            existe = nombreActual.equalsIgnoreCase(unNombre);
//        }
//        
//        return existe;
//    }
//
//    public void agregarListener(IngresoArticulo ingresoArticulo) {
//        manejador.addPropertyChangeListener(ingresoArticulo); // anota interesado
//    }
//}
