/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author KAOS
 */
public class CocinaTableModel extends AbstractTableModel {

    private ArrayList<Object[]> datosTablaCocina;
    private String[] titolsColumnes = {"Comanda", "Taula", "Plat", "Quantitat", "Hora comanda", "Hecho","Marca"};

    @Override
    public int getRowCount() {
        return datosTablaCocina.size();
    }

    @Override
    public int getColumnCount() {
        return titolsColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            return datosTablaCocina.get(rowIndex)[columnIndex];
    }

    public CocinaTableModel(ArrayList<Object[]> datosTablaCocina) {
        this.datosTablaCocina = new ArrayList<Object[]>(datosTablaCocina);
    }

    @Override
    public String getColumnName(int column) {
        return titolsColumnes[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 6) {
            datosTablaCocina.get(rowIndex)[columnIndex] = (boolean) aValue;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 6 && datosTablaCocina.get(rowIndex)[5].equals("X")) {
            return true;
        }
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==6)
            return Boolean.class;
        else
        return super.getColumnClass(columnIndex); 
    }
    
    
}
