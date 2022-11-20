/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.Carga;
import Dominio.Dron;
import Dominio.Funcionario;
import Dominio.Sistema;
import Dominio.Vuelo;
import IO.ArchivoLectura;
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author ylian
 */
public class IngresoVuelo extends javax.swing.JFrame implements PropertyChangeListener {

    /**
     * Creates new form IngresoVuelo
     */
    public IngresoVuelo() {
        crearCargasPrueba();

        
        initComponents();


    }

    public IngresoVuelo(Sistema datos) {
        this.datos = datos;
        this.cargas = datos.getCargas();
        
        initComponents();
    } 
    
    private void crearCargasPrueba() {
        Funcionario f = new Funcionario("Yliana", 20);
        Articulo a = new Articulo("Test", "test");
        datos.resetCargas();
        for (int i = 0; i < 10; i++) {
            char codigo = (char)(i+1 + '0');
            String cod = Character.toString(codigo);
            if (i == 0) {
                cod = "1";
            } else if (i == 3) {
                cod = "3";
            }
            Carga c1 = new Carga(f, a, i, cod);
            
            cargas.get(0)[0][i] = c1;
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
        fileChooser = new javax.swing.JFileChooser();
        modificarFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new TablaCustomizada()
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_fila = new javax.swing.JLabel();
        lbl_coincidencias = new javax.swing.JLabel();
        lbl_diferencias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Regístro de Vuelo");
        setName("Regístro de Vuelo"); // NOI18N

        SwingUtilities.updateComponentTreeUI(fileChooser);
        fileChooser.setApproveButtonToolTipText("");
        fileChooser.setDialogTitle("");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos .txt", "txt"));
        fileChooser.setFileHidingEnabled(true);
        fileChooser.setName("Nombre"); // NOI18N
        fileChooser.setVerifyInputWhenFocusTarget(false);
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ));
        tbl_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_datos);
        if (tbl_datos.getColumnModel().getColumnCount() > 0) {
            tbl_datos.getColumnModel().getColumn(0).setResizable(false);
            tbl_datos.getColumnModel().getColumn(1).setResizable(false);
            tbl_datos.getColumnModel().getColumn(2).setResizable(false);
            tbl_datos.getColumnModel().getColumn(3).setResizable(false);
            tbl_datos.getColumnModel().getColumn(4).setResizable(false);
            tbl_datos.getColumnModel().getColumn(5).setResizable(false);
            tbl_datos.getColumnModel().getColumn(6).setResizable(false);
            tbl_datos.getColumnModel().getColumn(7).setResizable(false);
            tbl_datos.getColumnModel().getColumn(8).setResizable(false);
            tbl_datos.getColumnModel().getColumn(9).setResizable(false);
            tbl_datos.getColumnModel().getColumn(10).setResizable(false);
        }
        setCellsAlignment(tbl_datos, SwingConstants.CENTER);

        jLabel2.setText(" ");

        lbl_area.setText("Área: ");

        lbl_fila.setText("Fila: ");

        lbl_coincidencias.setText("Total coincidencias: ");

        lbl_diferencias.setText("Total diferencias:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_diferencias)
                    .addComponent(lbl_coincidencias)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_area)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_fila)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_area)
                            .addComponent(lbl_fila))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbl_coincidencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_diferencias)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {
        String ruta = fileChooser.getSelectedFile().getAbsolutePath();
        ArchivoLectura arch = new ArchivoLectura(ruta);
        int cantLineas = 0;
        int cantLineasDeCarga = 0;
        
        String idDron = "";
        String pos = "";
        ArrayList<String> codigosCargas = new ArrayList<String>();
        
        while (arch.hayMasLineas()) {
            cantLineas++;
            switch (cantLineas) {
                case 1 -> idDron = arch.linea();
                case 2 -> pos = arch.linea();
                default -> {
                    codigosCargas.add(arch.linea());
                    cantLineasDeCarga++;
                }
            }
        }
        
        arch.cerrar();
        
        if (cantLineas < 2) {
            JOptionPane.showMessageDialog(onp_aviso, "El archivo debe tener "
                   + "identificación del dron, área y fila, y los correspondientes "
                    + "códigos de carga." , "Datos incompletos",JOptionPane.ERROR_MESSAGE);
        } else if (cantLineasDeCarga < 10) {
           JOptionPane.showMessageDialog(onp_aviso, "El archivo debe tener 10 líneas de"
                   + " código de carga, pero se encontraron " +(cantLineasDeCarga), 
                 "Datos incompletos",JOptionPane.ERROR_MESSAGE);
           insertarEnSistema(idDron, pos, codigosCargas, ruta);
        } else {
            insertarEnSistema(idDron, pos, codigosCargas, ruta);
            insertarEnTabla(idDron, pos, codigosCargas);
        } 
    }

    
    private void insertarEnTabla(String id, String pos, ArrayList<String> codigos) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();

        if (modelo.getRowCount() != 0) {
            modelo.setRowCount(0);
        }

        lbl_area.setText("Área: " + pos.charAt(0));
        lbl_fila.setText("Fila: " + pos.charAt(2));
        
        char area = pos.charAt(0);
        int fila;
        fila = Character.getNumericValue(pos.charAt(2));
        
        codigos.add(0, "Archivo");

        cambiarVacioPorCero(codigos);
        modelo.insertRow(0,codigos.toArray());
        
        if (hayDatosManuales(area, fila)) {
            String[] manuales = datosManuales(area, fila);
            modelo.insertRow(1, manuales);
            contarDiferencias();
        } 
    }
    
    private void cambiarVacioPorCero(ArrayList<String> codigos) {
        for (int i = 0; i < codigos.size(); i++) {
            if (codigos.get(i).isBlank()) {
                codigos.set(i, "0");
            }
        }
    }

    private void contarDiferencias() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        int diferencias = 0;
        int coincidencias = 10;

        for (int columna = 1; columna < 11; columna++) {
            String archivo = modelo.getValueAt(0, columna).toString();
            String manual = "";
            if (modelo.getRowCount() > 0) {
                manual = modelo.getValueAt(1, columna).toString();
            }
             
            if (!archivo.equals(manual)) {
                diferencias++;
                coincidencias--;
            }
        }
        
        lbl_coincidencias.setText("Total coincidencias: " + Integer.toString(coincidencias));
        lbl_diferencias.setText("Total diferencias:  " + Integer.toString(diferencias));
        
        ArrayList<Vuelo> vuelos = datos.getVuelos();
        int ultimo = vuelos.size()-1;

        if (ultimo >= 0) {
            Vuelo actual = vuelos.get(ultimo);
            actual.setCoincidencias(coincidencias);
            actual.setDiferencias(diferencias);
        } else {
            System.out.println("No encontre ningun vuelo en la lista!!!!");
        }
    }

    public static void setCellsAlignment(JTable table, int alignment) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }
    
    private void insertarEnSistema(String id, String pos, ArrayList<String> codigos, String archivo) {
        char area = pos.charAt(0);
        int fila =  Character.getNumericValue(pos.charAt(2));
        String[] codigosCargas = codigos.toArray((String[]::new));
        
        Vuelo nuevo = new Vuelo(id, area, fila, codigosCargas, archivo);
        
        if (datos.identificacionDronYaExistente(idDron)) {
            Dron dronActual = datos.buscarDronPorID(id);
            dronActual.setTieneVuelos(true);
        } else {
            Dron dronNuevo = new Dron(id, "", 1);
            dronNuevo.setTieneVuelos(true);
            datos.agregarDron(dronNuevo);
        } 
        
        datos.agregarVuelo(nuevo);
    }
    
    private boolean hayDatosManuales(char area, int fila) {
        int areaNum = area - 65;
        Carga[][] datosArea = cargas.get(areaNum);
        boolean esVacio = false;

        if (datosArea != null) {
            Carga[] datosFila = datosArea[fila];
            esVacio = datosFila == null;
        } else {
            esVacio = true;
        }

        return !esVacio;
    }
    
    private String[] datosManuales(char area, int fila) {
        int areaNum = area - 65;
        
        String[] aInsertar = new String[11];
        aInsertar[0] = "Manual";
           
        Carga[] datosArea;
        datosArea = cargas.get(areaNum)[fila-1];

        for (int i = 0; i < 10; i++) {
            String codigoActual;
            if (datosArea[i] != null) {
                codigoActual = datosArea[i].getCodigo();
            } else {
                codigoActual = "";
            }

            aInsertar[i+1] = codigoActual;
        }

        return aInsertar;
    }
    
    
    private void modificarFileChooser() {
        UIManager.put("FileChooser.lookInLabelText","Mirar en:");
        UIManager.put("FileChooser.saveButtonText","Guardar");
        UIManager.put("FileChooser.openButtonText","Abrir");
        UIManager.put("FileChooser.cancelButtonText","Cancelar");
        UIManager.put("FileChooser.updateButtonText","Actualizar");
        UIManager.put("FileChooser.helpButtonText","Ayuda");
        UIManager.put("FileChooser.saveButtonToolTipText","Guardar fichero");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir archivo");
        UIManager.put("FileChooser.cancelButtonToolTipText","Cancelar");
        UIManager.put("FileChooser.fileNameHeaderText","Nombre");
        UIManager.put("FileChooser.upFolderToolTipText", "Subir");
        UIManager.put("FileChooser.homeFolderToolTipText","Inicio");
        UIManager.put("FileChooser.newFolderToolTipText","Crear una nueva carpeta");
        UIManager.put("FileChooser.listViewButtonToolTipText","Lista");
        UIManager.put("FileChooser.newFolderButtonText","Crear una nueva carpeta");
        UIManager.put("FileChooser.renameFileButtonText", "Renombrar archivo");
        UIManager.put("FileChooser.deleteFileButtonText", "Eliminar archivo");
        UIManager.put("FileChooser.filterLabelText", "Tipo de archivo");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalles");
        UIManager.put("FileChooser.fileSizeHeaderText","Tamaño");
        UIManager.put("FileChooser.fileDateHeaderText", "Fecha de modificación");
        UIManager.put("FileChooser.fileTypeHeaderText", "Tipo");
        
        SwingUtilities.updateComponentTreeUI(fileChooser);
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
            java.util.logging.Logger.getLogger(IngresoVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoVuelo().setVisible(true);
            }
        });
    }
    
    
    private Sistema datos = new Sistema();
    private ArrayList<Carga[][]> cargas = datos.getCargas();
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_coincidencias;
    private javax.swing.JLabel lbl_diferencias;
    private javax.swing.JLabel lbl_fila;
    private javax.swing.JOptionPane onp_aviso;
    private javax.swing.JTable tbl_datos;
    private String idDron = "";
    private String pos = "";
    private ArrayList<String> codigosCargas;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // TODO Auto-generated method stub
        tbl_datos = new TablaCustomizada();
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
        insertarEnTabla(idDron, pos, codigosCargas); 
    }
}
