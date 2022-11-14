/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Dominio.Sistema;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nalux
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    public Inicio(Sistema datos) {
        this.datos = datos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        
        setTitle("Control de Inventarios");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);
        
        
        
        jMenu1.setText("Registrar");

        jMenuItem2.setText("Registrar artículo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Registrar funcionario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Registrar dron");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Registrar vuelo de dron");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }

            
        });
        jMenu1.add(jMenuItem5);
        
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ingreso/Egreso");

        jMenuItem1.setText("Ingreso/Egreso manual de carga");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Emisión de estadísticas");

        jMenuItem6.setText("Estadísticas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);
        
        
        setJMenuBar(jMenuBar1);

        setBounds(600, 250, 600, 400);
        
        Container c = getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("bienvenida.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(25, 50, size.width, size.height); //Sets the location of the image
 
        c.add(label); //Adds objects to the container
    
    }// </editor-fold>                        

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
// creo ventana para crear funcioario
        IngresoFuncionario ventanaFun = new IngresoFuncionario(datos);
        ventanaFun.setVisible(true);       

    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //creo ventana para crear el articulo   
        IngresoArticulo ventanaArt = new IngresoArticulo(datos);
        //la hago visible
        ventanaArt.setVisible(true);
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
         // creo ventana para crear dron
        IngresoDron ventanaDron = new IngresoDron(datos);
        ventanaDron.setVisible(true);
        
    }               
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        IngresoVuelo ventanaVuelo = new IngresoVuelo(datos);
            ventanaVuelo.setVisible(true);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        VentanaCargas ventCarg = new VentanaCargas(sistema);
        ventCarg.setVisible(true);
    }                                          

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
       // guardarSistema();
    }                                 

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here:
        guardarSistema();
    }                                  


    public void guardarSistema() {
        ObjectOutputStream out;
         try { 
            out = new ObjectOutputStream(new FileOutputStream("sistema"));
            out.writeObject(datos);
            out.close();
        }  catch (IOException ex) {
            System.out.println("No puedo guardar el archivo");
          //  Logger.getLogger(Inicio.class.getName()).log(null);
        }  
    }

    
  private Sistema datos;
  private Sistema sistema;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration                   
}
