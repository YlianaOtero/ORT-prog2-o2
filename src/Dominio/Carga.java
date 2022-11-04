package Dominio;

import java.io.Serializable;

/** Representa una carga puntual.
 * @author yliana*/
public class Carga implements Serializable{
    Funcionario funcionario;
    Articulo articulo;
    int cantUnidades;
    String codigo;
    
    /** Crea un objeto de tipo Carga. Se asumen datos validos.
     * @param func el funcionario del personal que ingresa la carga.
     * @param art el articulo del inventario a ingresar.
     * @param cant la cantidad de unidades de este articulo a agregar.
     * @param codigo el codigo de la carga.*/
    public Carga(Funcionario func, Articulo art, int cant, String codigo) {
        this.funcionario = func;
        this.articulo = art;
        this.cantUnidades = cant;
        this.codigo = codigo;
    }
    
    /** @return El funcionario que ingreso esta carga.*/
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    /** @return El articulo ingresado en esta carga.*/
    public Articulo getArticulo() {
        return articulo;
    }

    /** @return La cantidad de unidades del articulo que fueron ingresadas en
     * esta carga.*/
    public int getCantUnidades() {
        return cantUnidades;
    }

    /** @return El codigo identificador de esta carga.*/
    public String getCodigo() {
        return codigo;
    }
}