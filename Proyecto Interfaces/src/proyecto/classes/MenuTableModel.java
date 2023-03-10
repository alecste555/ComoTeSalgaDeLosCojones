/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iceyclizz
 */
public class MenuTableModel extends AbstractTableModel {

    private ArrayList<String[]> menuDelModel;
    private String[] titolsColumnes = {"Tipus", "Plat", "Carn", "Peix", "Làctic", "Gluten", "Ou", "Preu", "Quantitat"};

    @Override
    public int getRowCount() {
        return menuDelModel.size();
    }

    @Override
    public int getColumnCount() {
        return titolsColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return menuDelModel.get(rowIndex)[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        int cantidad;
        try {
            if (columnIndex == 8) {
                cantidad = Integer.parseInt((String) aValue);
                menuDelModel.get(rowIndex)[columnIndex] = Integer.toString(cantidad);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 8) {
            return true;
        }
        return false;
    }

    public MenuTableModel(ArrayList<String[]> menuDelModel) {
        this.menuDelModel = menuDelModel;
    }

    @Override
    public String getColumnName(int column) {
        return titolsColumnes[column];
    }

}
