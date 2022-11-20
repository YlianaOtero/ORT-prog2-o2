/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author nalux
 */
public class VentanaCargas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCarga
     */
    public VentanaCargas() {
        initComponents();
        generateButtons();
    }

    public VentanaCargas(Sistema unSistema) {
        try {
            this.sistema = unSistema;

            this.funcionarios = this.sistema.getFuncionarios();
            this.articulos = this.sistema.getArticulos();
        } catch (NullPointerException e) {
            this.sistema = new Sistema();
            this.funcionarios = this.sistema.getFuncionarios();
            this.articulos = this.sistema.getArticulos();
        }

        initComponents();
        generateButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onp_aviso = new javax.swing.JOptionPane();
        panelEspacios = new javax.swing.JPanel();
        PanelIngresoEgreso = new javax.swing.JPanel();
        jLabelIngEgr = new javax.swing.JLabel();
        jLabelCodEg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFun = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaArt = new javax.swing.JList<>();
        jLabelArtEg = new javax.swing.JLabel();
        jLabelCantEg = new javax.swing.JLabel();
        jLabelFunEg = new javax.swing.JLabel();
        jLabelFun = new javax.swing.JLabel();
        jLabelArt = new javax.swing.JLabel();
        jButtonIngrEgr = new javax.swing.JButton();
        jLabelCant = new javax.swing.JLabel();
        jTextFieldCant = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        labelcod = new javax.swing.JLabel();
        labelart = new javax.swing.JLabel();
        labelcant = new javax.swing.JLabel();
        labelfun = new javax.swing.JLabel();
        letraArea = new javax.swing.JLabel();
        jButtonAvanzar = new javax.swing.JButton();
        jButtonRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelEspacios.setLayout(new java.awt.GridLayout(12, 10));
        getContentPane().add(panelEspacios);
        panelEspacios.setBounds(70, 50, 550, 510);
        botonAnterior = new javax.swing.JButton();

        jScrollPane1.setViewportView(listaFun);

        jScrollPane2.setViewportView(listaArt);

        jLabelFun.setText("               ");

        jLabelArt.setText("           ");

        jButtonIngrEgr.setText("        ");
        jButtonIngrEgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngrEgrActionPerformed(evt);
            }
        });

        jLabelCant.setText("              ");

        jTextFieldCant.setText("");

        jLabelCodigo.setText("              ");

        jTextFieldCod.setText("");

        labelcod.setText("                    ");

        labelart.setText("                ");

        labelcant.setText("            ");

        labelfun.setText("               ");

        javax.swing.GroupLayout PanelIngresoEgresoLayout = new javax.swing.GroupLayout(PanelIngresoEgreso);
        PanelIngresoEgreso.setLayout(PanelIngresoEgresoLayout);
        PanelIngresoEgresoLayout.setHorizontalGroup(
            PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoEgresoLayout.createSequentialGroup()
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIngresoEgresoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonIngrEgr, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoEgresoLayout.createSequentialGroup()
                                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFunEg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                        .addComponent(jLabelCantEg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelcant, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(labelfun, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                        .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                                .addComponent(jLabelArtEg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoEgresoLayout.createSequentialGroup()
                                                .addComponent(jLabelCodEg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)))
                                        .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelcod, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelart, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabelFun, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabelArt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIngresoEgresoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelIngEgr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        PanelIngresoEgresoLayout.setVerticalGroup(
            PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelIngEgr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelcod)
                    .addComponent(jLabelCodEg, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArtEg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelart))
                .addGap(18, 18, 18)
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantEg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcant))
                .addGap(18, 18, 18)
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFunEg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelfun)
                    .addComponent(jLabelCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFun)
                    .addComponent(jLabelArt)
                    .addComponent(jTextFieldCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngrEgr))
                    .addGroup(PanelIngresoEgresoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PanelIngresoEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );

        getContentPane().add(PanelIngresoEgreso);
        PanelIngresoEgreso.setBounds(700, 50, 770, 470);

        letraArea.setText("A");
        getContentPane().add(letraArea);
        letraArea.setBounds(280, 20, 60, 20);

        jButtonAvanzar.setText(">>");
        jButtonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvanzarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAvanzar);
        jButtonAvanzar.setBounds(500, 570, 72, 22);

        jButtonRetroceder.setText("<<");
        jButtonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetrocederActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetroceder);
        jButtonRetroceder.setBounds(110, 570, 72, 22);

        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        jButtonIngrEgr.setVisible(false);
        jTextFieldCant.setVisible(false);
        jTextFieldCod.setVisible(false);
        setBounds(0, 0, 1496, 635);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetrocederActionPerformed
        // TODO add your handling code here:
        if (contador == 0) {
            letraArea.setText("E");
            contador = 4;
        } else {
            contador--;
            letraArea.setText(sistema.areas[contador]);
        }
    }//GEN-LAST:event_jButtonRetrocederActionPerformed

    private void jButtonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvanzarActionPerformed
        if (contador == 4) {
            contador = 0;
            letraArea.setText("A");
        } else {
            contador++;
            letraArea.setText(sistema.areas[contador]);
        }

    }//GEN-LAST:event_jButtonAvanzarActionPerformed

    private void jButtonIngrEgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngrEgrActionPerformed
        if (jButtonIngrEgr.getText().equals("Ingresar")) {
            agregarSegunDatos();
           PanelIngresoEgreso.setBackground(Color.green);
        } else {
           eliminar();
           PanelIngresoEgreso.setBackground(Color.BLUE);
           
        }
    }
        
        
    private void eliminar() {
        sistema.eliminarCarga(contador, filaSeleccionada, colSeleccionada);
        JOptionPane.showMessageDialog(onp_aviso,
                            "La carga fue egresada correctamente.", "Carga egresada",
                            + JOptionPane.INFORMATION_MESSAGE);
    }
        /** Asumiendo que los datos cantArticulos y codigoCargas son correctos, y que
     * el usuario seleccionó un funcionario y un articulo de las listas correspondientes,
     * crea una carga con esos datos y la agrega a la lista.
     * @param cantArticulos cantidad de articulos que hay en la carga
     * @param codigoCarga código identificador de la carga*/
    private void agregarCargaManual(int cantArticulos, String codigoCarga) {
        String nombreFuncionario = listaFun.getSelectedValue();
        String nombreArticulo = listaArt.getSelectedValue();

        Funcionario func = sistema.buscarFuncionarioPorNombre(nombreFuncionario);
        Articulo art = sistema.buscarArticuloPorNombre(nombreArticulo);

        Carga nueva = new Carga(func, art, cantArticulos, codigoCarga);

        sistema.agregarCarga(contador, filaSeleccionada, colSeleccionada, nueva);
    }

    /** Si los datos que el usuario ingresó (funcionario y articulo seleccionado, y cantidad y codigo de carga)
     * son validos y no nulos, entonces llama a agregarCargaManual. De lo contrario, informa al usuario
     * para que vuelva a ingresar o seleccionar los datos de manera correcta.*/
    private void agregarSegunDatos() {
        if(listaFun.getSelectedValue() == null || listaArt.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(onp_aviso,
                "Debe seleccionar tanto un usuario como un artículo.", "Datos incompletos",
                + JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                String codigoCarga = jTextFieldCod.getText();
                String cantArt = jTextFieldCant.getText();
                
                if (!codigoCarga.equals("") && !cantArt.isEmpty()) {
                    int cantArticulos = Integer.parseInt(cantArt);

                    if (cantArticulos > 0) {
                        agregarCargaManual(cantArticulos, codigoCarga);
                        JOptionPane.showMessageDialog(onp_aviso,
                            "La carga fue ingresada correctamente.", "Carga ingresada",
                            + JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(onp_aviso,
                        "La cantidad debe ser mayor a cero", "Datos incorrectos",
                        + JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(onp_aviso,
                        "Debe ingresar una cantidad y un codigo de carga", "Datos incompletos",
                        + JOptionPane.ERROR_MESSAGE);
                }
            
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(onp_aviso,
                "La cantidad debe ser un número entero", "Datos incorrectos",
                + JOptionPane.ERROR_MESSAGE);
            }
        }
    
       
    }//GEN-LAST:event_jButtonIngrEgrActionPerformed

    public void generateButtons() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                JButton nuevo = new JButton(" ");
                nuevo.setMargin(new Insets(-5, -5, -5, -5));
                nuevo.setBackground(Color.GRAY);
                nuevo.setForeground(Color.WHITE);
                String aux1 = i + 1 + ".";
                int aux2 = j + 1;

                nuevo.setText(aux1 + aux2);

                nuevo.addActionListener(new VentanaCargas.EspacioListener());
                this.panelEspacios.add(nuevo);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaCargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelIngresoEgreso;
    private javax.swing.JButton jButtonAvanzar;
    private javax.swing.JButton jButtonIngrEgr;
    private javax.swing.JButton jButtonRetroceder;
    private javax.swing.JLabel jLabelArt;
    private javax.swing.JLabel jLabelArtEg;
    private javax.swing.JLabel jLabelCant;
    private javax.swing.JLabel jLabelCantEg;
    private javax.swing.JLabel jLabelCodEg;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFun;
    private javax.swing.JLabel jLabelFunEg;
    private javax.swing.JLabel jLabelIngEgr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCant;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JLabel labelart;
    private javax.swing.JLabel labelcant;
    private javax.swing.JLabel labelcod;
    private javax.swing.JLabel labelfun;
    private javax.swing.JLabel letraArea;
    private javax.swing.JList<String> listaArt;
    private javax.swing.JList<String> listaFun;
    private javax.swing.JOptionPane onp_aviso;
    private javax.swing.JPanel panelEspacios;
    // End of variables declaration//GEN-END:variables

    private Sistema sistema;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Articulo> articulos;

    int contador = 0;
    private JButton botonAnterior;
    private int filaSeleccionada;
    private int colSeleccionada;

    private class EspacioListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
// este código se ejecutará al presionar el botón, obtengo cuál botón

            JButton cual = ((JButton) e.getSource());
            cual.setBackground(Color.red);
            botonAnterior.setBackground(Color.GRAY);
            String pos = cual.getText();
            String[] parts = pos.split("\\.");
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);
            filaSeleccionada = part1 - 1;
            colSeleccionada = part2 - 1;
            if (sistema.getCargas().get(contador)[part1 - 1][part2 - 1] == null) {
                ingreso();
                PanelIngresoEgreso.setBackground(Color.GREEN);
            } else {
                egreso();
                PanelIngresoEgreso.setBackground(Color.BLUE);

            }


            botonAnterior = cual;

        }
    }

    public void ingreso() {

        jLabelIngEgr.setText("Ingreso");
        jLabelFun.setText("Funcionarios");
        jLabelArt.setText("Articulos");
        jLabelCant.setText("Cantidad");
        jLabelCodigo.setText("Codigo");
        jButtonIngrEgr.setText("Ingresar");

        String f[] = new String[sistema.getFuncionarios().size()];
        for (int i = 0; i < f.length; i++) {
            f[i] = sistema.getFuncionarios().get(i).getNombre();
        }

        listaFun.setListData(f);

        String a[] = new String[sistema.getArticulos().size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = sistema.getArticulos().get(i).getNombre();
        }
        listaArt.setListData(a);

        jLabelIngEgr.setVisible(true);
        jLabelFun.setVisible(true);
        jLabelArt.setVisible(true);
        jLabelCant.setVisible(true);
        jLabelCodigo.setVisible(true);
        jTextFieldCant.setVisible(true);
        jTextFieldCod.setVisible(true);

        jButtonIngrEgr.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane2.setVisible(true);


        jLabelArtEg.setVisible(false);
        jLabelCantEg.setVisible(false);
        jLabelCodEg.setVisible(false);
        jLabelFunEg.setVisible(false);

        labelart.setVisible(false);
        labelcant.setVisible(false);
        labelcod.setVisible(false);
        labelfun.setVisible(false);
    }

    
    
    public void egreso() {

        jLabelIngEgr.setText("Egreso");
        jLabelArtEg.setText("Articulos");
        jLabelCantEg.setText("Cantidad");
        jLabelCodEg.setText("Codigo");
        jLabelFunEg.setText("Funcionarios");
        jButtonIngrEgr.setText("Egresar");

        Carga cargaActual = sistema.getCargas().get(contador)[filaSeleccionada][colSeleccionada];
 
        labelart.setText(cargaActual.getArticulo().getNombre());
        labelcant.setText(String.valueOf(cargaActual.getCantUnidades()));
        labelcod.setText(cargaActual.getCodigo());
        labelfun.setText(cargaActual.getFuncionario().getNombre());
        
        
        jLabelIngEgr.setVisible(true);
        jLabelArtEg.setVisible(true);
        jLabelCantEg.setVisible(true);
        jLabelCodEg.setVisible(true);
        jLabelFunEg.setVisible(true);
        jButtonIngrEgr.setVisible(true);
        labelart.setVisible(true);
        labelcant.setVisible(true);
        labelcod.setVisible(true);
        labelfun.setVisible(true);
      
       
        jLabelFun.setVisible(false);
        jLabelArt.setVisible(false);
        jLabelCant.setVisible(false);
        jLabelCodigo.setVisible(false);
        jTextFieldCant.setVisible(false);
        jTextFieldCod.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        
        

    }
}