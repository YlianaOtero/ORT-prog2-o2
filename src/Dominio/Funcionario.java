package Dominio;

/** Representa un funcionario puntual, con nombre, edad y número.
 * @author yliana*/
public class Funcionario {
    private static int UltimoNumero = 0;

    private String nombre;
    private int edad;
    private final int numero;
    
    /** Crea un objeto de tipo Funcionario. Se asume que los datos son correctos.
     * @param unNombre nombre del funcionario.
     * @param unaEdad edad del funcionario. */
    public Funcionario(String unNombre, int unaEdad) {
        this.nombre = unNombre;
        this.edad = unaEdad;
        UltimoNumero++;
        this.numero = UltimoNumero;
    }
    
    /** @return Nombre del funcionario.*/
    public String getNombre() {
        return this.nombre;
    }
    
    /** @return Edad del funcionario.*/
    public int getEdad() {
        return this.edad;
    }
    
    /** @return Número del funcionario.*/
    public int getNumero() {
        return this.numero;
    }
    
    /** @return Último número entre los funcionarios. Tener en cuenta que es una 
     * variable de clase, y no un atributo de un funcionario puntual.*/
    public int getUltimoNumero() {
        return UltimoNumero;
    }
    
    /** Modifica el nombre del funcionario. Se asume que los datos son correctos.
     * @param unNombre el nuevo nombre a sobreescribir en el funcionario.*/
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    /** Modifica la edad del funcionario. Se asume que los datos son correctos.
     * @param unaEdad la nueva edad a sobreescribir en el funcionario.*/
    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }
}