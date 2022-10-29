/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Funcionario;
import Dominio.ListaFuncionarios;
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
public class PruebaFuncionario extends IngresoFuncionario {
    public static void main(String[] args) {
        ListaFuncionarios lista = new ListaFuncionarios();
        
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("funcionarios"));
            lista = (ListaFuncionarios)in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngresoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PruebaArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }

        IngresoFuncionario nueva = new IngresoFuncionario(lista);
        nueva.setVisible(true);
        
    }
}
