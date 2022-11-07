package Interfaz;

import Dominio.Sistema;


/**
 *
 * @author ylian
 */
public class PruebaFuncionario extends IngresoFuncionario {
    public static void main(String[] args) {
        boolean precargado = true;
        Sistema datos = new Sistema(precargado);

        IngresoFuncionario nueva = new IngresoFuncionario(datos.getPersonal());
        nueva.setVisible(true);
    }
}
