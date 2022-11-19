package Dominio;

import Interfaz.IngresoArticulo;
import Interfaz.IngresoDron;
import Interfaz.IngresoFuncionario;
import Interfaz.IngresoVuelo;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

/** Clase principal del programa. Funciona como una base de datos.
 * @author yliana*/
public class Sistema implements Serializable {
    private ArrayList<Articulo> articulos;
    private ArrayList<Dron> drones;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Carga[][]> cargas;
    private ArrayList<Vuelo> vuelos;
    public String [] areas = { "A","B","C","D","E"};
    transient private PropertyChangeSupport manejador;
    
    /** Crea un objeto de tipo Sistema.
     * @param sistemaPrecargado si es True, se debe intentar cargar los datos del sistema desde archivos existentes.
     * Si es False, es debe crear todo desde cero.*/
    public Sistema(boolean sistemaPrecargado) {
        this.manejador = new PropertyChangeSupport(this);
        
        articulos = new ArrayList<Articulo>();
        drones = new ArrayList<Dron>();
        funcionarios = new ArrayList<Funcionario>();
        cargas = new ArrayList<Carga[][]>();
        resetCargas();
        vuelos = new ArrayList<Vuelo>();
    }
    
    public void crearManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }

    /** @return El inventario del sistema.*/
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    /** @return La lista de drones del sistema.*/
    public ArrayList<Dron> getDrones() {
        return drones;
    }
    
    

    /** @return El personal del sistema.*/
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**@return La lista de cargas del sistema.*/
    public ArrayList<Carga[][]> getCargas() {
        return cargas;
    }

    /** @return La lista de vuelos del sistema.*/
    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    /*LISTA DE ARTICULOS*/
    
    /** Agrega un articulo a la lista, sin importar si este ya estaba presente. 
     * @param unArticulo el artículo a agregar.*/
    public void agregarArticulo(Articulo unArticulo) {
        articulos.add(unArticulo);
        manejador.firePropertyChange("cant", articulos.size()-1, articulos.size());
    }
    
    /** Busca un nombre puntual entre todos los nombres de los artículos de la lista.
     * @param unNombre el nombre a buscar en la lista.
     * @return Devuelve true si hay algun artículo en la lista con ese nombre, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean nombreArticuloYaExistente(String unNombre) {
        boolean existe = false;
        for (int pos = 0; pos < articulos.size() && !existe; pos++) {
            Articulo articuloActual = articulos.get(pos);
            String nombreActual = articuloActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
        }
        
        return existe;
    }

    public Articulo buscarArticuloPorNombre(String unNombre) {
        boolean existe = false;
        Articulo unArticulo = new Articulo(unNombre, "");

        for (int pos = 0; pos < articulos.size() && !existe; pos++) {
            Articulo articuloActual = articulos.get(pos);
            String nombreActual = articuloActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
            if (existe) {
                unArticulo = articuloActual;
            }
        }

        return unArticulo;
    }
    
    public void agregarListener(IngresoArticulo ingresoArticulo) {
        manejador.addPropertyChangeListener(ingresoArticulo); // anota interesado
    }
    
    /*LISTA DE DRONES*/
    
    /** Agrega un dron a la lista, sin importar si este ya estaba presente. 
     * @param unDron el dron a agregar.*/
    public void agregarDron(Dron unDron) {
        drones.add(unDron);
        manejador.firePropertyChange("cant", drones.size()-1, drones.size());
    }
    
    /** Busca un identificacion puntual entre todos las Identificaciones de los drones de la lista.
     * @param unIdentificacion el identificacion a buscar en la lista.
     * @return Devuelve true si hay algun dron en la lista con ese identificacion, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean identificacionDronYaExistente(String unIdentificacion) {
        boolean existe = false;
        for (int pos = 0; pos < drones.size() && !existe; pos++) {
            Dron dronActual = drones.get(pos);
            String identificacionActual = dronActual.getIdentificacion();
            
            existe = identificacionActual.equalsIgnoreCase(unIdentificacion);
        }
        
        return existe;
    }
    
    public ArrayList<Dron> dronesSinVuelos() {
        ArrayList<Dron> sinVuelos = new ArrayList<Dron>();
        
        for (int pos = 0; pos < drones.size(); pos++) {
            Dron dronActual = drones.get(pos);
            if (dronActual.getTieneVuelos()) {
                sinVuelos.add(dronActual);
            }
        }
        
        return sinVuelos;
    }
    
    public ArrayList<Dron> dronesConVuelos() {
        ArrayList<Dron> conVuelos = new ArrayList<Dron>();
        
        for (int pos = 0; pos < drones.size(); pos++) {
            Dron dronActual = drones.get(pos);
            if (!dronActual.getTieneVuelos()) {
                conVuelos.add(dronActual);
            }
        }
        
        return conVuelos;
    }
    
    public ArrayList<Vuelo> vuelosDeUnDron(String id) {
        ArrayList<Vuelo> vuelosDron = new ArrayList<Vuelo>();
        
        for (int pos = 0; pos < vuelos.size(); pos++) {
            Vuelo vueloActual = vuelos.get(pos);
            if (vueloActual.getIdDron().equals(id)) {
                vuelosDron.add(vueloActual);
            }
        }
        
        return vuelosDron;
    }
    
    public void agregarListener(IngresoDron ingresoDron) {
        manejador.addPropertyChangeListener(ingresoDron); // anota interesado
    }
    
    /*LISTA DE FUNCIONARIOS*/
    
    /** Agrega un funcionario a la lista, sin importar si este ya estaba presente. 
     * @param unFuncionario el funcionario a agregar.*/
    public void agregarFuncionario(Funcionario unFuncionario) {
        funcionarios.add(unFuncionario);
        manejador.firePropertyChange("cant", funcionarios.size()-1, funcionarios.size());
    }
    
    /** Busca un nombre puntual entre todos los nombres de los funcionarios de la lista.
     * @param unNombre el nombre a buscar en la lista.
     * @return Devuelve true si hay algun funcionario en la lista con ese nombre, 
     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
    public boolean nombreFuncionarioYaExistente(String unNombre) {
        boolean existe = false;
        for (int pos = 0; pos < funcionarios.size() && !existe; pos++) {
            Funcionario funcionarioActual = funcionarios.get(pos);
            String nombreActual = funcionarioActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
        }
        
        return existe;
    }

    public Funcionario buscarFuncionarioPorNombre(String unNombre) {
        boolean existe = false;
        Funcionario unFuncionario = new Funcionario(unNombre, 0);

        for (int pos = 0; pos < funcionarios.size() && !existe; pos++) {
            Funcionario funcionarioActual = funcionarios.get(pos);
            String nombreActual = funcionarioActual.getNombre();
            
            existe = nombreActual.equalsIgnoreCase(unNombre);
            if (existe) {
                unFuncionario = funcionarioActual;
            }
        }
        
        return unFuncionario;
    }

    public void agregarListener(IngresoFuncionario ingresoFuncionario) {
        manejador.addPropertyChangeListener(ingresoFuncionario); // anota interesado
    }
    
    /** Busca el número de funcionario mas alto en la lista.
     * @return El mayor número de funcionario entre los presentes.*/
    public int numeroFuncionarioMasAlto() {
        int numero = 0;
        
        for (int pos = 0; pos < funcionarios.size(); pos++) {
            int numeroActual = funcionarios.get(pos).getNumero();
            if (numeroActual > numero) {
                numero = numeroActual;
            }
        }
        
        return numero;
    }
    
    /*LISTA DE VUELOS*/
    
    /** Agrega un Vuelo a la lista, sin importar si este ya estaba presente. 
     * @param unVuelo el Vuelo a agregar.*/
    public void agregarVuelo(Vuelo unVuelo) {
        vuelos.add(unVuelo);
        Dron dronDelVuelo = buscarDronPorID(unVuelo.getIdDron());
        dronDelVuelo.setTieneVuelos(true);
        manejador.firePropertyChange("cant", vuelos.size()-1, vuelos.size());
    }

    public Dron buscarDronPorID(String unID) {
        boolean existe = false;
        Dron unDron = new Dron(unID, "", 1);

        for (int pos = 0; pos < drones.size() && !existe; pos++) {
            Dron dronActual = drones.get(pos);
            String idActual = dronActual.getIdentificacion();
            
            existe = idActual.equalsIgnoreCase(unID);
            if (existe) {
                unDron = dronActual;
            }
        }
        
        return unDron;
    }

    public void agregarListener(IngresoVuelo ingresoVuelo) {
        manejador.addPropertyChangeListener(ingresoVuelo); // anota interesado
    }
    
    public final void resetCargas(){
        for(int i=0; i<5;i++){
            Carga[][] mat = new Carga[12][10];
            cargas.add(mat);
        }
    }

    public void agregarCarga(int area, int fila, int col, Carga unaCarga) {
        cargas.get(area)[fila][col] = unaCarga;
    }

}