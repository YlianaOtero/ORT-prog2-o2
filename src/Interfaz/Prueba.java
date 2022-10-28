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
public class Prueba extends IngresoArticulo {
    public static void main(String[] args) {
        ListaArticulos lista = new ListaArticulos();
        Articulo nuevo = new Articulo("Taza", "Taza sublimada de Shrek");
        int agrego = lista.agregarArticulo(nuevo);
        Articulo nuevo2 = new Articulo("Papas rusticas", "Papitas");
        int agrego2 = lista.agregarArticulo(nuevo2);
        Articulo nuevo3 = new Articulo("Silla oficina", "Silla con ruedas");
        int agrego3 = lista.agregarArticulo(nuevo3);
        Articulo nuevo4 = new Articulo("Agua mineral", "Agua mineral SIRTE con gas");
        int agrego4 = lista.agregarArticulo(nuevo4);
     //   System.out.println(lista.getArticuloEnPos(0).getNombre());
        IngresoArticulo nueva = new IngresoArticulo(lista);
        nueva.setVisible(true);
    }
}
