/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Dron;
import Dominio.Sistema;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** Ventana para ingresar drones.
 * @author yliana*/
public class IngresoDron extends javax.swing.JFrame implements PropertyChangeListener {

    /**
     * Creates new form IngresoDron
     */
    public IngresoDron() {
        initComponents();
    }
    
    public IngresoDron(Sistema datos) {
        this.datos = datos;
        this.drones = datos.getDrones();
        datos.agregarListener(this);

        initComponents();
        
        cargarTabla();
    }
    
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        int cantidad = drones.size();
        
        for (int elem = 0; elem < cantidad; elem++) {
            String identificacion = drones.get(elem).getIdentificacion();
            String modeloDron = drones.get(elem).getModelo();
            int tipoCamara = drones.get(elem).getTipoCamara();
            
            modelo.insertRow(elem, new Object[] { identificacion, modeloDron, tipoCamara });
        }
    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drones");
        setBounds(new java.awt.Rectangle(500, 300, 600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_identificacion.setText("Identificación");

        tbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        lbl_modelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_modelo.setText("Modelo");

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_modelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modeloActionPerformed(evt);
            }
        });

        txt_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        spr_tipoCamara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spr_tipoCamara.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        lbl_tipoCamara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
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
                        .addContainerGap(65, Short.MAX_VALUE))
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
        } else if (datos.identificacionDronYaExistente(identificacion)) {
            JOptionPane.showMessageDialog(onp_aviso, "Ya existe un dron con esa "
                + "identificacion.", "Dron no ingresado", JOptionPane.ERROR_MESSAGE);
        } else {
            agregarEnLista(identificacion, modelo, tipoCamara);
        }  
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void agregarEnLista(String identificacion, String modeloDron, int tipoCamara) {
        Dron nuevo = new Dron(identificacion, modeloDron, tipoCamara);
        boolean tieneVuelos = datos.tieneVuelosEnLista(nuevo);
        nuevo.setTieneVuelos(tieneVuelos);
        datos.agregarDron(nuevo);
        
        JOptionPane.showMessageDialog(onp_aviso,
                "El dron fue ingresado correctamente.", "Dron ingresado",
                + JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing


    private ArrayList<Dron> drones;
    private Sistema datos;
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
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        limpiarTabla();
        cargarTabla();
    }
}
