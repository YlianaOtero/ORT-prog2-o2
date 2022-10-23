package Dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/** Representa un registro de funcionarios.
 * @author yliana*/
public class ListaFuncionarios {
    private ArrayList<Funcionario> lista;
    private int cantidad;
    
    /** Crea un objeto de tipo ListaFuncionarios.*/
    public ListaFuncionarios() {
        this.lista = new ArrayList<Funcionario>();
        this.cantidad = 0;
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
    
    /** @param unFuncionario el funcionario a agregar.
     * @return Devuelve 1 en caso de haber agregado el funcionario exitosamente. En 
     * cualquier otro caso, no fue agregado. Si devuelve 0, es porque el funcionario
     * ya existía previamente en la lista, y si devuelve -1, es porque la lista
     * ya contiene a otro funcionario con el mismo nombre.*/
    public int agregarFuncionario(Funcionario unFuncionario) {
        int resultado = 1;
        
        if (estaEnLaLista(unFuncionario)) {
            resultado = 0;
        } else if (nombreYaExistente(unFuncionario.getNombre())) {
            resultado = -1;
        } else {
            this.lista.add(unFuncionario);
            this.cantidad++;
        }
        
        return resultado;     
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
}
