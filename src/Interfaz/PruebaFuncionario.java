/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
