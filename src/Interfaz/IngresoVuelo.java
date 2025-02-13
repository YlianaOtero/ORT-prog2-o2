package Interfaz;

import Dominio.Carga;
import Dominio.Dron;
import Dominio.Sistema;
import Dominio.Vuelo;
import IO.ArchivoLectura;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/** Ventana para ingresar vuelos.
 * @author yliana*/
public class IngresoVuelo extends javax.swing.JFrame implements PropertyChangeListener {

    /**
     * Creates new form IngresoVuelo
     */
    public IngresoVuelo() {
        initComponents();
    }

    public IngresoVuelo(Sistema datos) {
        this.datos = datos;
        this.cargas = datos.getCargas();
        this.datos.agregarListener(this);
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

        onp_aviso = new javax.swing.JOptionPane();
        fileChooser = new javax.swing.JFileChooser();
        modificarFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new TablaCustomizada();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_fila = new javax.swing.JLabel();
        lbl_coincidencias = new javax.swing.JLabel();
        lbl_diferencias = new javax.swing.JLabel();

        idDron = "";
        pos = "";

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
        centrarCeldas();
        codigosCargas = new ArrayList<String>();

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
    }// </editor-fold>                        

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            ArchivoLectura arch = new ArchivoLectura(ruta);
            int cantLineas = 0;
            int cantLineasDeCarga = 0;
            
            idDron = "";
            pos = "";
            codigosCargas.clear();
            codigosCargas.add("Archivo");
            
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
               codigosCargas.remove(0);
               insertarEnSistema(idDron, pos, codigosCargas, ruta);
            } else {
                insertarEnTabla(idDron, pos, codigosCargas);
                codigosCargas.remove(0);
                insertarEnSistema(idDron, pos, codigosCargas, ruta);
            }
        } catch (NullPointerException e) {
            //No hacer nada
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
             
        cambiarVacioPorCero(codigos);
        modelo.insertRow(0,codigos.toArray());
        
        if (hayDatosManuales(area, fila)) {
            String[] manuales = datosManuales(area, fila);
            modelo.insertRow(1, manuales);
            contarDiferencias();
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
            JOptionPane.showMessageDialog(onp_aviso, "No se ha registrado ningun dron "
                   + "con la identificación del archivo. \nTenga en cuenta que si desea ver las estadísticas "
                    + "para este dron, deberá registrarlo primero." , "Dron inexistente", JOptionPane.INFORMATION_MESSAGE);
        }
        
        datos.agregarVuelo(nuevo);
    }
    
    /**Chequea que en esa area y fila haya al menos una carga en una fila.
     * @return True si hay datos en esa area y fila, False en caso contrario.*/
    private boolean hayDatosManuales(char area, int fila) {
        int areaNum = area - 65;
        Carga[] datosArea;
        datosArea = cargas.get(areaNum)[fila];
        
        return datosArea != null;
    }
    
    /** @param area un área del inventario.
     * @param fila una fila del inventario.
     * @return Un arreglo con los códigos de las cargas insertadas manualmente
     * en esa área y fila puntual.*/
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
    
    /** Busca todos los strings vacios y los cambia por 0.
     * @param codigos los códigos de carga que fueron ingresados en el archivo de un vuelo.*/
    private void cambiarVacioPorCero(ArrayList<String> codigos) {
        for (int i = 0; i < codigos.size(); i++) {
            if (codigos.get(i).isBlank()) {
                codigos.set(i, "0");
            }
        }
    }

    /** Identifica diferencias entre las cargas registradas por un dron, y las registradas
    * manualmente. Muestra la cantidad de diferencias y coincidencias en la ventana.*/
    private void contarDiferencias() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        int diferencias = 0;
        int coincidencias = 10;
        for (int columna = 1; columna < 11; columna++) {
            String archivo = modelo.getValueAt(0, columna).toString();
            String manual = modelo.getValueAt(1, columna).toString();

            if (!archivo.equals(manual)) {
                diferencias++;
                coincidencias--;
            }
        }
        
        lbl_coincidencias.setText("Total coincidencias: " + Integer.toString(coincidencias));
        lbl_diferencias.setText("Total diferencias:  " + Integer.toString(diferencias));
        
        ArrayList<Vuelo> vuelos = datos.getVuelos();
        int ultimo = vuelos.size()-1;
        
        if (ultimo > -1) {
            Vuelo actual = vuelos.get(ultimo);
            actual.setCoincidencias(coincidencias);
            actual.setDiferencias(diferencias);
        } else {
            System.out.println("no hay vuelos para contar diferencias");
        }
    }
    
    public void centrarCeldas() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        TableModel modelo = tbl_datos.getModel();
        
        int alineacion = SwingConstants.CENTER;
        renderer.setHorizontalAlignment(alineacion);

        for (int col = 1; col < modelo.getColumnCount(); col++){
            tbl_datos.getColumnModel().getColumn(col).setCellRenderer(renderer);
        }
    }
    
    /**Settea el texto del File Chooser para ponerlo en español.*/
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
    private String idDron;
    private String pos;     
    private ArrayList<String> codigosCargas;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int ultimo = datos.getVuelos().size();
        Vuelo ultimoVuelo = datos.getVuelos().get(ultimo-1);

        String idDronAux = ultimoVuelo.getIdDron();
        String posAux = ultimoVuelo.getArea() + "#" + ultimoVuelo.getFila();

        ArrayList<String> codigosCargasAux = new ArrayList<String>();
        String[] arregloCodigos = ultimoVuelo.getCargas();

        for (int i = 0; i < arregloCodigos.length; i++) {
            codigosCargasAux.add(arregloCodigos[i]);
        }
        
        codigosCargasAux.add(0, "Archivo");
        
        insertarEnTabla(idDronAux, posAux, codigosCargasAux);  
        
    }
}