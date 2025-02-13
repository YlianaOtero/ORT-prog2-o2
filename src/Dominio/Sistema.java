package Dominio;

import Interfaz.IngresoArticulo;
import Interfaz.IngresoDron;
import Interfaz.IngresoFuncionario;
import Interfaz.IngresoVuelo;
import Interfaz.VentanaCargas;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

/** Clase principal del programa. Funciona como una base de datos.
 * @author yliana*/
public class Sistema implements Serializable {
    public static String [] areas = { "A","B","C","D","E"};
    private ArrayList<Articulo> articulos;
    private ArrayList<Dron> drones;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Carga[][]> cargas;
    private ArrayList<Vuelo> vuelos;
    transient private PropertyChangeSupport manejador;
    
    /** Crea un objeto de tipo Sistema.
     * @param sistemaPrecargado si es True, se debe intentar cargar los datos del sistema desde archivos existentes.
     * Si es False, es debe crear todo desde cero.*/
    public Sistema() {
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

    /** @param unNombre El nombre del artículo a buscar. Se asume que es válido y que pertenece
     * al inventario del sistema.
     * @return El artículo con el nombre correspondiente.*/
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
    
    /** @return Devuelve una lista con todos los drones del sistema que no tienen vuelos asociados.*/
    public ArrayList<Dron> dronesSinVuelos() {
        ArrayList<Dron> sinVuelos = new ArrayList<Dron>();
        
        for (int pos = 0; pos < drones.size(); pos++) {
            Dron dronActual = drones.get(pos);
            if (!dronActual.getTieneVuelos()) {
                sinVuelos.add(dronActual);
            }
        }
        
        return sinVuelos;
    }
    
    /** @return Devuelve una lista con todos los drones del sistema que tienen vuelos asociados.*/
    public ArrayList<Dron> dronesConVuelos() {
        ArrayList<Dron> conVuelos = new ArrayList<Dron>();
        
        for (int pos = 0; pos < drones.size(); pos++) {
            Dron dronActual = drones.get(pos);
            if (dronActual.getTieneVuelos()) {
                conVuelos.add(dronActual);
            }
        }
        
        return conVuelos;
    }

    /** @param unID La identificación del dron a buscar. Se asume que es válido y que pertenece
     * a la lista de drones del sistema.
     * @return El dron con el código de identificación correspondiente.*/
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
    
    public void agregarListener(IngresoDron ingresoDron) {
        manejador.addPropertyChangeListener(ingresoDron);
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

    /** @param unNombre el nombre del funcionario a buscar. Se asume que es válido y que pertenece
     * al personal del sistema.
     * @return El funcionario que tiene ese nombre.*/
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

    public void agregarListener(IngresoFuncionario ingresoFuncionario) {
        manejador.addPropertyChangeListener(ingresoFuncionario); // anota interesado
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
    
    /** @param unDron El dron del cual queremos hallar los vuelos. Se asume que es válido y pertenece a la lista de drones.
     * @return Devuelve una lista con todos los vuelos que el correspondiente dron tiene asociados.*/
    public ArrayList<Vuelo> vuelosDeUnDron(Dron unDron) {
        ArrayList<Vuelo> vuelosDron = new ArrayList<Vuelo>();
        
        for (int pos = 0; pos < vuelos.size(); pos++) {
            Vuelo vueloActual = vuelos.get(pos);
            if (vueloActual.getIdDron().equals(unDron.getIdentificacion())) {
                vuelosDron.add(vueloActual);
            }
        }
        
        return vuelosDron;
    }

    /** Recorre la lista de vuelos del sistema para verificar si un dron tiene
     * vuelos registrados en ella.
     * @param unDron el dron del cual se quiere saber si tiene vuelos registrados.
     * @return True si tiene vuelos, False en caso contrario.*/
    public boolean tieneVuelosEnLista(Dron unDron) {
        boolean tiene = false;

        String idDron = unDron.getIdentificacion();
        for (int pos = 0; pos < vuelos.size() && !tiene; pos++) {
            String idActual = vuelos.get(pos).getIdDron();
            tiene = idActual.equalsIgnoreCase(idDron);
        }

        return tiene;
    }

    public void agregarListener(IngresoVuelo ingresoVuelo) {
        manejador.addPropertyChangeListener(ingresoVuelo); // anota interesado
    }
    
    /*LISTA DE CARGAS*/

    /** Reinicia la lista de cargas, dejando en cada posición una matriz de cargas limpia
     * sin datos dentro.*/
    public final void resetCargas(){
        for(int i=0; i<5;i++){
            Carga[][] mat = new Carga[12][10];
            cargas.add(mat);
        }
    }

    /** Agrega una carga a la lista de cargas. Se asumen datos válidos.
     * @param area el área en el que se ingresó la carga
     * @param fila la fila en la que se ingresó la carga
     * @param col la columna en la que se ingresó la carga
     * @param unaCarga la carga a agregar al sistema.*/
    public void agregarCarga(int area, int fila, int col, Carga unaCarga) {
        Carga anterior = cargas.get(area)[fila][col];
        cargas.get(area)[fila][col] = unaCarga;
        manejador.firePropertyChange("cant", anterior, unaCarga);
    }

    /** Elimina una carga de la lista de cargas. Se asumen datos válidos.
     * @param area  el área en el que se ingresó la carga a borrar
     * @param fila la fila en la que se ingresó la carga a borrar
     * @param col la columna en la que se ingresó la carga a borrar*/
    public void eliminarCarga(int area, int fila, int col) {
        cargas.get(area)[fila][col] = null;
    }
    
    /** Recorre la lista de cargas buscando el codigo que se le pasa por parametro.
     * Es una manera de, antes de agregar cargas, verificar que el código que se quiere
     * utilizar sea único.
     * @param codigo el código de una carga.
     * @return  True si se encuentra en la lista de cargas, False en caso contrario.*/
    public boolean codigoCargaYaExistente(String codigo) {
        boolean encontrado = false;
        
        for (int pos = 0; pos < cargas.size() && !encontrado; pos++) {
            Carga[][] matrizActual = cargas.get(pos);
            for (int i = 0; i < matrizActual.length; i++) {
                for (int j = 0; j < matrizActual[0].length; j++) {
                    if (matrizActual[i][j] != null) {
                        encontrado = matrizActual[i][j].getCodigo().equalsIgnoreCase(codigo);
                    }
                }
            }
        }
        
        return encontrado;
    }

    /*public void agregarListener(VentanaCargas ingresoCarga) {
        manejador.addPropertyChangeListener(ingresoCarga); // anota interesado
    }*/
}