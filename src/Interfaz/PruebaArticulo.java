package Interfaz;

import Dominio.Sistema;


/**
 *
 * @author ylian
 */
public class PruebaArticulo extends IngresoArticulo {
    public static void main(String[] args) {
        boolean precargado = true;
        Sistema datos = new Sistema(precargado);

        IngresoArticulo nueva = new IngresoArticulo(datos.getInventario());
        nueva.setVisible(true);
    }
}
