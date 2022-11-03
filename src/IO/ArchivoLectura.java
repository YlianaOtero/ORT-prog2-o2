package IO;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/** Maneja la lectura de archivos de texto.
 * @author yliana*/
public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    /** Crea un objeto de tipo ArchivoLectura. En caso de que no se pueda encontrar
     * el archivo, imprime un mensaje de error en la consola.
     * @param nombre el nombre del archivo a leer.*/
    public ArchivoLectura(String nombre) {
        try {
            in = new Scanner(Paths.get(nombre));
        } catch (IOException e) {
            System.err.println("Error: no se pudo encontrar el archivo.");
        }
    }
    
    /** @return Devuelve True si el archivo tiene mas lineas para leer, y False
     * en caso contrario.*/
    public boolean hayMasLineas() {
        boolean hay = false;
        
        linea = null;
        if (in.hasNext()) {
            linea = in.nextLine();
            hay = true;
        }
        
        return hay;
    }

    /** @return Devuelve el contenido de la linea actual.*/
    public String linea() {
        return linea;
    }

    /** Guarda y cierra el archivo. */
    public void cerrar() {
        in.close();
    }
}
