/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Funcionario;
import Dominio.Sistema;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** Ventana para ingresar funcionarios.
 * @author yliana*/
public class IngresoFuncionario extends javax.swing.JFrame implements PropertyChangeListener {

    /**
     * Creates new form IngresoFuncionario
     */
    public IngresoFuncionario() {
        initComponents();
    }
    
    public IngresoFuncionario (Sistema datos) {
        this.datos = datos;
        this.funcionarios = datos.getFuncionarios();
        datos.agregarListener(this);
        
        int ultimoNumero = datos.numeroFuncionarioMasAlto();
        Funcionario.setUltimoNumero(ultimoNumero);
        
        initComponents();
        
        cargarTabla();
    }
    
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        int cantidad = funcionarios.size();
        
        for (int elem = 0; elem < cantidad; elem++) {
            String nombre = funcionarios.get(elem).getNombre();
            int edad = this.funcionarios.get(elem).getEdad();
            int numero = this.funcionarios.get(elem).getNumero();
            
            modelo.insertRow(elem, new Object[] { nombre, edad, numero });
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
        lbl_edad = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_edad = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        slp_datos = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");
        setBounds(new java.awt.Rectangle(500, 300, 600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_edad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_edad.setText("Edad");

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_edad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre");

        tbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Número"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_agregar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_edad)
                            .addGap(48, 48, 48)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_nombre)
                            .addGap(30, 30, 30)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(slp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_edad))
                        .addGap(31, 31, 31)
                        .addComponent(btn_agregar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        String nombre = txt_nombre.getText();
        String edadIngresada = txt_edad.getText();

        if (nombre.length() == 0 || edadIngresada.length() == 0) {
            JOptionPane.showMessageDialog(onp_aviso, "El funcionario debe tener tanto "
                + "nombre como edad.", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int edad = Integer.valueOf(edadIngresada);
                
                if (edad < 0 || edad > 100) {
                    JOptionPane.showMessageDialog(onp_aviso, "La edad debe estar entre 0 "
                        + "y 100 años.", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
                } else if (datos.nombreFuncionarioYaExistente(nombre)) {
                    JOptionPane.showMessageDialog(onp_aviso, "Ya existe un "
                        + "funcionario con ese nombre.", "Funcionario no ingresado",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    agregarEnLista(nombre, edad);
                }
    
            } catch (InputMismatchException | NumberFormatException e) {
                JOptionPane.showMessageDialog(onp_aviso, "La edad solo puede contener "
                    + "números.", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void agregarEnLista(String nombre, int edad) {
        Funcionario nuevo = new Funcionario(nombre, edad);
        datos.agregarFuncionario(nuevo);
        
        JOptionPane.showMessageDialog(onp_aviso,
                "El funcionario fue ingresado correctamente.", "Funcionario "
                + "ingresado",  JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
      //  guardarPersonal();
    }//GEN-LAST:event_formWindowClosing

    private ArrayList<Funcionario> funcionarios;
    private Sistema datos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JOptionPane onp_aviso;
    private javax.swing.JScrollPane slp_datos;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        limpiarTabla();
        cargarTabla();   
    }
}
