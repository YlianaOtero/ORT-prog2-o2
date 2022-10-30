/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Dron;
import Dominio.ListaDrones;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ylian
 */
public class IngresoDron extends javax.swing.JFrame {

    /**
     * Creates new form IngresoDron
     */
    public IngresoDron() {
        initComponents();
    }
    
    public IngresoDron(ListaDrones unaLista) {
        this.drones = unaLista;
      
        initComponents();
        
        cargarTabla();
    }
    
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        int cantidad = this.drones.getCantidad();
        
        for (int elem = 0; elem < cantidad; elem++) {
            String identificacion = this.drones.getDronEnPos(elem).getIdentificacion();
            String modeloDron = this.drones.getDronEnPos(elem).getModelo();
            int tipoCamara = this.drones.getDronEnPos(elem).getTipoCamara();
            modelo.insertRow(elem, new Object[] { identificacion, modeloDron, tipoCamara });
        }
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
        lbl_identificacion = new javax.swing.JLabel();
        slp_datos = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        lbl_modelo = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_modelo = new javax.swing.JTextField();
        txt_identificacion = new javax.swing.JTextField();
        spr_tipoCamara = new javax.swing.JSpinner();
        lbl_tipoCamara = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drones");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_identificacion.setText("Identificación");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Modelo", "Tipo de cámara"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_datos.setName(""); // NOI18N
        tbl_datos.getTableHeader().setReorderingAllowed(false);
        slp_datos.setViewportView(tbl_datos);

        lbl_modelo.setText("Modelo");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modeloActionPerformed(evt);
            }
        });

        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        spr_tipoCamara.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        lbl_tipoCamara.setText("Tipo de cámara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_identificacion)
                            .addComponent(lbl_modelo)
                            .addComponent(lbl_tipoCamara))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spr_tipoCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)))
                .addComponent(slp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_identificacion)
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_modelo)
                            .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipoCamara)
                            .addComponent(spr_tipoCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        String identificacion = txt_identificacion.getText();
        String modelo = txt_modelo.getText();
        int tipoCamara = (int)spr_tipoCamara.getValue();
                
        if (identificacion.length() == 0 || modelo.length() == 0) {
            JOptionPane.showMessageDialog(onp_aviso, "Por favor, ingrese todos los "
                + "datos solicitados.", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
        } else if (this.drones.identificacionYaExistente(identificacion)) {
            JOptionPane.showMessageDialog(onp_aviso, "Ya existe un dron con esa "
                + "identificacion.", "Dron no ingresado", JOptionPane.ERROR_MESSAGE);
        } else {
            agregarEnLista(identificacion, modelo, tipoCamara);
        }  
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void agregarEnLista(String identificacion, String modeloDron, int tipoCamara) {
        Dron nuevo = new Dron(identificacion, modeloDron, tipoCamara);
        this.drones.agregarDron(nuevo);
        
        JOptionPane.showMessageDialog(onp_aviso,
                "El dron fue ingresado correctamente.", "Dron ingresado",
                + JOptionPane.INFORMATION_MESSAGE);
        
        int cantidad = this.drones.getCantidad();
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        
        modelo.insertRow(cantidad-1, new Object[] { identificacion, modeloDron, tipoCamara });
    }
    
    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        guardarListaDrones();
    }//GEN-LAST:event_formWindowClosing

    public void guardarListaDrones() {
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(new FileOutputStream("drones"));
            out.writeObject(this.drones);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaArticulo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PruebaArticulo.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(IngresoDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDron().setVisible(true);
            }
        });
    }

    private ListaDrones drones;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel lbl_identificacion;
    private javax.swing.JLabel lbl_modelo;
    private javax.swing.JLabel lbl_tipoCamara;
    private javax.swing.JOptionPane onp_aviso;
    private javax.swing.JScrollPane slp_datos;
    private javax.swing.JSpinner spr_tipoCamara;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_modelo;
    // End of variables declaration//GEN-END:variables
}
