package Dominio;
import java.io.Serializable;

/** Representa un articulo puntual, con nombre y descripción.
 * @author yliana*/
public class Articulo implements Serializable {
    private String nombre;
    private String descripcion;

    /** Crea un objeto de tipo Articulo. Se asume que los datos son correctos.
     * @param unNombre nombre del articulo.
     * @param unaDescripcion descripción del articulo.*/
    public Articulo(String unNombre, String unaDescripcion) {
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }
    
    /** @return Nombre del articulo.*/
    public String getNombre() {
        return this.nombre;
    }
    
    /** @return Descripción del articulo.*/
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /** Modifica el nombre del articulo. Se asume que los datos son correctos.
     * @param unNombre el nuevo nombre a sobreescribir en el articulo.*/
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    /** Modifica la descripción del articulo. Se asume que los datos son correctos.
     * @param unaDescripcion la nueva descripción a sobreescribir en el articulo.*/
    public void setDescripcion(String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }
}