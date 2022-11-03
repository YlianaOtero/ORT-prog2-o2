package IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/** Maneja la grabacion de archivos de texto.=
 * @author yliana*/
public class ArchivoGrabacion {
     private Formatter out;

    /** Crea un objeto de tipo ArchivoGrabacion. En caso de que no se pueda crear
     * el archivo, imprime un mensaje de error en la consola.
     * @param nombre el nombre del archivo a guardar.*/
    public ArchivoGrabacion(String nombre) {
        try {
            out = new Formatter(nombre);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se puede crear el archivo.");
        }
    }

    /** Crea un objeto de tipo ArchivoGrabacion. Puede elegirse si el contenido del
     * archivo ya existente con ese nombre debe ser sobreescrito o extendido.
     * En caso de que no se pueda guardar el archivo, imprime un mensaje de error.
     * @param nombre el nombre del archivo a guardar.
     * @param extender en caso de ser True, el archivo se extiende. Si es False,
     * se sobreescribe.*/
    public ArchivoGrabacion(String nombre, boolean extender) {
        try {
            FileWriter f = new FileWriter(nombre, extender);
            out = new Formatter(f);
        } catch (IOException e) {
            System.out.println("Error: No se puede crear/extender el archivo.");
        }
    }

    /** Agrega una linea al archivo.
     * @param linea la linea a escribir.*/
    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }

    /** Guarda y cierra el archivo.*/
    public void cerrar() {
        out.close();
    }
}
