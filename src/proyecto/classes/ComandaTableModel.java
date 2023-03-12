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
public class ComandaTableModel extends AbstractTableModel {

    private ArrayList<String[]> comandesDelModel;
    private String[] titolsColumnes = {"Comanda","Taula","Tipus", "Plat", "Quantitat","Hora comanda"};

    @Override
    public int getRowCount() {
        return comandesDelModel.size();
    }

    @Override
    public int getColumnCount() {
        return titolsColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return comandesDelModel.get(rowIndex)[columnIndex];
    }

    public ComandaTableModel(ArrayList<String[]> comandesDelModel) {
        this.comandesDelModel = comandesDelModel;
    }


    @Override
    public String getColumnName(int column) {
        return titolsColumnes[column];
    }
    
}
