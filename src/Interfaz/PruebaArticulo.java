/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Inventario;
import Dominio.Sistema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
