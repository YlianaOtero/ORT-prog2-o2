/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ylian
 */

public class JTableRowHeaders extends JFrame {
    public JTableRowHeaders() {
        super("RHE");
        setSize(400,200);
        
        ListModel lm = new AbstractListModel() {
            String[] headers = {"De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            @Override
            public int getSize() {
                return headers.length;
            }

            @Override
            public Object getElementAt(int index) {
                return headers[index];
            }
        };
        
        DefaultTableModel dm = new DefaultTableModel(lm.getSize(),10);
        JTable table = new JTable(dm);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        JList rowHeader = new JList(lm);
        rowHeader.setFixedCellWidth(50);
        rowHeader.setFixedCellHeight(table.getRowHeight());
        
        rowHeader.setCellRenderer(new RowRenderer(table));
        
        JScrollPane pane = new JScrollPane(table);
        pane.setRowHeaderView(rowHeader);
        getContentPane().add(pane,BorderLayout.CENTER);
    }
}
class RowRenderer extends JLabel implements ListCellRenderer {
    
    public RowRenderer(JTable table) {
        JTableHeader header = table.getTableHeader();
        setOpaque(true);
        setBorder(UIManager.getBorder("TableHeader.cellBorder"));
        //setHorizonalAlignment(CENTER);
        setForeground(header.getForeground());
        setBackground(header.getBackground());
        setFont(header.getFont());
        
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        return null;
    }
}
