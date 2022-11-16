package Interfaz;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Color;

public class MyTable extends JTable {
    private int coincidencias;
    public int getCoincidencias() {
        return coincidencias;
    }



    public int getDiferencias() {
        return diferencias;
    }

    private int diferencias;

    public MyTable() {
        this.coincidencias = 0;
        this.diferencias = 0;
    }

    

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int columna) {
        Component result = super.prepareRenderer(renderer, row, columna);
        if (columna > 0) {
            if (debeSerVerde(columna)) {
                result.setBackground(Color.green);
                this.coincidencias++;
            } else {
                result.setBackground(Color.red);
                this.diferencias++;
            } 
        }
        
        return result;
    }

    private boolean debeSerVerde(int columna) {
        boolean debe = false;

        if (columna > 0) {
            DefaultTableModel modelo = (DefaultTableModel) super.getModel();
            String archivo = modelo.getValueAt(0, columna).toString();
            String manual = modelo.getValueAt(1, columna).toString();

            debe = archivo.equals(manual);
        }
        
        return debe;
    }

}
