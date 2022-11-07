
package Inicio;
import Dominio.*;
import Interfaz.*;
/**
 *
 * @author natalia
 */
public class Inicio {
    public static void main(String[] args) {
        Sistema datos = new Sistema(true);
        VentanaInicial ventanaIni = new VentanaInicial(datos);
        //cree la ventana de inicio (la de la clase VentanaInicial.java)
        ventanaIni.setVisible(true);
        //la hago visible
    }    
}
