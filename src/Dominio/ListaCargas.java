package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaCargas implements Serializable {
    private ArrayList<Carga[][]> lista;
    private int cantidad;

    /** Crea un objeto de tipo ListaCargas.*/
    public ListaCargas() {
        this.lista = new ArrayList<Carga[][]>();
        this.cantidad = 0;
        
    }
    
    /** @return El ArrayList de cargas.*/
    public ArrayList<Carga[][]> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de cargas presentes en la lista. */
    public int getCantidad() {
        return this.cantidad;
    }

    /** @param pos una posición válida en la lista.
     * @return El carga presente en la posición de la lista pasada por parámetro.*/
    public Carga[][] getCargaEnPos(area,i,j) {
    //en VentanaCarga hago metodo que cuando cambie de letra (A,B,C,D,E) cambie de numero (0,1,2,3,4) para quedarme con el numero
        return this.lista.get(pos);
    }

    /** Agrega un Carga a la lista, sin importar si este ya estaba presente. 
     * @param unCarga el carga a agregar.*/
    public void agregarCarga(Carga unCarga) {
        this.lista.add(unCarga);
        this.cantidad++;
    }
    
    /** Borra al carga de la lista, cuando este mismo carga pertenece a ella.
     * @param unCarga - carga a remover
     * @return Devuelve 1 en caso de que el carga haya sido eliminado exitosamente.
     * Si el carga no fue elminado, es porque no existe tal carga en la lista,
     * en cuyo caso se retorna -1.*/
    public int removerCarga(Carga unCarga) {
        int resultado = 1;
        
        if (estaEnLaLista(unCarga)) {
            resultado = -1;
        } else {
            this.lista.remove(unCarga);
            this.cantidad--;
        }
        
        return resultado;
    }
    
    /** Borra de la lista la carga presente en la posición pos.
     * @param pos - una posición válida de la lista (rango 0..cantidad)*/
    public void removerCargaEnPos(int pos) {
        this.lista.remove(pos);
        this.cantidad--;
    }
    
    /** Busca a un carga puntual en la lista.
     * @param unCarga el carga a buscar en la lista.
     * @return Devuelve true si el carga fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Carga unCarga) {
        return this.lista.contains(unCarga);
    }
}