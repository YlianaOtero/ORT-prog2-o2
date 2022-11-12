package Dominio;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Interfaz.IngresoFuncionario;

/** Representa un registro de funcionarios.
 * @author yliana*/
public class Personal implements Serializable {
    private ArrayList<Funcionario> lista;
    private int cantidad;
    transient private PropertyChangeSupport manejador;
    
    /** Crea un objeto de tipo Personal.*/
    public Personal() {
        manejador = new PropertyChangeSupport(this);
        this.lista = new ArrayList<Funcionario>();
        this.cantidad = 0;
    }

    public void crearManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }
    
    /** @return El ArrayList de funcionarios.*/
    public ArrayList<Funcionario> getLista() {
        return this.lista;
    }
    
    /** @return La cantidad de funcionarios registrados. */
    public int getCantidad() {
        return this.cantidad;
    }
    
    /** @param pos una posición válida en la lista.
     * @return El funcionario presente en la posición de la lista pasada por parámetro.*/
    public Funcionario getFuncionarioEnPos(int pos) {
        return this.lista.get(pos);
    }
    
    /** Busca el número de funcionario mas alto en la lista.
     * @return El mayor número de funcionario entre los presentes.*/
    public int numeroMasAlto() {
        int numero = 0;
        
        for (int pos = 0; pos < cantidad; pos++) {
            int numeroActual = getFuncionarioEnPos(pos).getNumero();
            if (numeroActual > numero) {
                numero = numeroActual;
            }
        }
        
        return numero;
    }
    
    /** Busca a un funcionario puntual en la lista. Se asume que el funcionario está presente.
     * @param unFuncionario - el funcionario a buscar.
     * @return La posición del funcionario en la lista.*/
    public int getPosFuncionario(Funcionario unFuncionario) {
        boolean encontrado = false;
        
        int pos = 0;
        
        while (pos < this.cantidad && !encontrado) {
            encontrado = unFuncionario.equals(this.lista.get(pos));
            pos++;
        }
        
        return pos;
    }
    
    /** Busca un funcionario puntual en la lista, pero por nombre. Se asume que existe
     * un funcionario con ese nombre en la lista.
     * @param unNombre - el nombre del funcionario a buscar.
     * @return La posición del funcionario con este nombre en la lista.*/
    public int getPosFuncionario(String unNombre) {
        boolean encontrado = false;
        
        int pos = 0;
        
        while (pos < this.cantidad && !encontrado) {
            encontrado = unNombre.equalsIgnoreCase(this.lista.get(pos).getNombre());
            pos++;
        }
        
        return pos;
    }
    
    /** Agrega un funcionario a la lista, sin importar si este ya estaba presente. 
     * @param unFuncionario el funcionario a agregar.*/
    public void agregarFuncionario(Funcionario unFuncionario) {
        ArrayList<Funcionario> listaAnterior = this.lista;
        int cantidadAnterior = this.cantidad;

        this.lista.add(unFuncionario);
        this.cantidad++;  

        actualizarEnListener(listaAnterior, cantidadAnterior);
    }
    
    /** Busca a un funcionario puntual en la lista.
     * @param unFuncionario el funcionario a buscar en la lista.
     * @return Devuelve true si el funcionario fue encontrado, y false en caso de que no.*/
    public boolean estaEnLaLista(Funcionario unFuncionario) {
        return this.lista.contains(unFuncionario);
    }
    
    /** Busca un nombre puntual entre todos los nombres de los funcionarios de la lista.
     * @param unNombre el nombre a buscar en la lista.
     * @return Devuelve true si hay algun funcionario en la lista con ese nombre, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean nombreYaExistente(String unNombre) {
        boolean existe = false;
        for (int pos = 0; pos < this.cantidad && !existe; pos++) {
            Funcionario funcionarioActual = this.lista.get(pos);
            String nombreActual = funcionarioActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
        }
        
        return existe;
    }
    
    /** Ordena la lista alfabéticamente por nombre, sin distinguir mayúsculas de minúsculas.*/
    public void ordenarLista() { 
        Collections.sort(this.lista, new Comparator<Funcionario>(){
            @Override
            public int compare(Funcionario art1, Funcionario art2) {
                String nombre1 = art1.getNombre();
                String nombre2 = art2.getNombre();
                return nombre1.compareToIgnoreCase(nombre2);
            }
        });
    }

    public void agregarListener(IngresoFuncionario ingresoFuncionario) {
        manejador.addPropertyChangeListener(ingresoFuncionario); // anota interesado
    }

    private void actualizarEnListener(ArrayList<Funcionario> listaAnterior, int cantidadAnterior) {
        manejador.firePropertyChange("lista", listaAnterior, this.lista);
        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
    }
}
