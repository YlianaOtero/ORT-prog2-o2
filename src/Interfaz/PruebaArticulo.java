/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.Inventario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ylian
 */
public class PruebaArticulo extends IngresoArticulo {
    public static void main(String[] args) {
        Inventario lista = new Inventario();
        
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("articulos"));
            lista = (Inventario)in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngresoArticulo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PruebaArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }

        IngresoArticulo nueva = new IngresoArticulo(lista);
        nueva.setVisible(true);
        
    }
}
