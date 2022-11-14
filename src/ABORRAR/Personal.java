//package Dominio;
//
//import java.beans.PropertyChangeSupport;
//import java.io.Serializable;
//import java.util.ArrayList;
//
//import Interfaz.IngresoFuncionario;
//
///** Representa un registro de funcionarios.
// * @author yliana*/
//public class Personal implements Serializable {
//    private ArrayList<Funcionario> lista;
//    private int cantidad;
//    transient private PropertyChangeSupport manejador;
//    
//    /** Crea un objeto de tipo Personal.*/
//    public Personal() {
//        manejador = new PropertyChangeSupport(this);
//        this.lista = new ArrayList<Funcionario>();
//        this.cantidad = 0;
//    }
//
//    public void crearManejador() {
//        this.manejador = new PropertyChangeSupport(this);
//    }
//    
//    /** @return El ArrayList de funcionarios.*/
//    public ArrayList<Funcionario> getLista() {
//        return this.lista;
//    }
//    
//    /** @return La cantidad de funcionarios registrados. */
//    public int getCantidad() {
//        return this.cantidad;
//    }
//    
//    /** @param pos una posición válida en la lista.
//     * @return El funcionario presente en la posición de la lista pasada por parámetro.*/
//    public Funcionario getFuncionarioEnPos(int pos) {
//        return this.lista.get(pos);
//    }
//    
//    /** Busca el número de funcionario mas alto en la lista.
//     * @return El mayor número de funcionario entre los presentes.*/
//    public int numeroMasAlto() {
//        int numero = 0;
//        
//        for (int pos = 0; pos < cantidad; pos++) {
//            int numeroActual = getFuncionarioEnPos(pos).getNumero();
//            if (numeroActual > numero) {
//                numero = numeroActual;
//            }
//        }
//        
//        return numero;
//    }
//    
//    /** Agrega un funcionario a la lista, sin importar si este ya estaba presente. 
//     * @param unFuncionario el funcionario a agregar.*/
//    public void agregarFuncionario(Funcionario unFuncionario) {
//        ArrayList<Funcionario> listaAnterior = this.lista;
//        int cantidadAnterior = this.cantidad;
//
//        this.lista.add(unFuncionario);
//        this.cantidad++;  
//
//        actualizarEnListener(listaAnterior, cantidadAnterior);
//    }
//    
//    /** Busca un nombre puntual entre todos los nombres de los funcionarios de la lista.
//     * @param unNombre el nombre a buscar en la lista.
//     * @return Devuelve true si hay algun funcionario en la lista con ese nombre, 
//     * sin distinguir mayúsculas de minúsculas, y false en caso de que no.*/
//    public boolean nombreYaExistente(String unNombre) {
//        boolean existe = false;
//        for (int pos = 0; pos < this.cantidad && !existe; pos++) {
//            Funcionario funcionarioActual = this.lista.get(pos);
//            String nombreActual = funcionarioActual.getNombre();
//            
//            existe = nombreActual.equalsIgnoreCase(unNombre);
//        }
//        
//        return existe;
//    }
//
//    public void agregarListener(IngresoFuncionario ingresoFuncionario) {
//        manejador.addPropertyChangeListener(ingresoFuncionario); // anota interesado
//    }
//
//    private void actualizarEnListener(ArrayList<Funcionario> listaAnterior, int cantidadAnterior) {
//        manejador.firePropertyChange("lista", listaAnterior, this.lista);
//        manejador.firePropertyChange("cantidad", cantidadAnterior, this.cantidad);
//    }
//}
