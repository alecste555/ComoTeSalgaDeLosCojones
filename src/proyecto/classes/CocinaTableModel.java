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
public class CocinaTableModel extends AbstractTableModel{
    
    private ArrayList<String[]> datosTablaCocina;
    private String[] titolsColumnes = {"Comanda","Taula", "Plat", "Quantitat","Hora comanda","Hecho"};

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

    public CocinaTableModel(ArrayList<String[]> datosTablaCocina) {
        this.datosTablaCocina = datosTablaCocina;
    }


    @Override
    public String getColumnName(int column) {
        return titolsColumnes[column];
    }
}
