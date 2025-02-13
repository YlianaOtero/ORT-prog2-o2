package Interfaz;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Color;

public class TablaCustomizada extends JTable {
    private int coincidencias;
    private int diferencias;

    public int getCoincidencias() {
        return coincidencias;
    }

    public int getDiferencias() {
        return diferencias;
    }
    
    public TablaCustomizada() {
        this.coincidencias = 0;
        this.diferencias = 0;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int columna) {
        Component result = super.prepareRenderer(renderer, row, columna);
        
        if (debeSerVerde(columna)) {
            result.setBackground(Color.green);
            this.coincidencias++;
        } else if (debeSerGris(columna)) {
            result.setBackground(Color.LIGHT_GRAY);
        } else {
            result.setBackground(Color.red);
            this.diferencias++;
        } 
        return result;
    }

    private boolean debeSerVerde(int columna) {
        boolean debe = false;
        
        DefaultTableModel modelo = (DefaultTableModel) super.getModel();
        if (modelo.getRowCount() > 1) {
            String archivo = modelo.getValueAt(0, columna).toString();
            String manual = modelo.getValueAt(1, columna).toString();

            debe = archivo.equals(manual);
        }
        
        return debe;
    }
    
    private boolean debeSerGris(int columna) {
        boolean debe;
        
        DefaultTableModel modelo = (DefaultTableModel) super.getModel();
        String archivo = modelo.getValueAt(0, columna).toString();
        
        debe = archivo.equals("Archivo");
        
        return debe;
    }

}
