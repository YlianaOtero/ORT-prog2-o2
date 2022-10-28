/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.ListaArticulos;

/**
 *
 * @author ylian
 */
public class Prueba extends AAAAAAA {
    public static void main(String[] args) {
        ListaArticulos lista = new ListaArticulos();
        Articulo nuevo = new Articulo("a1", "asadasd");
        int agrego = lista.agregarArticulo(nuevo);
     //   System.out.println(lista.getArticuloEnPos(0).getNombre());
        AAAAAAA nueva = new AAAAAAA(lista);
        nueva.setVisible(true);
    }
}
