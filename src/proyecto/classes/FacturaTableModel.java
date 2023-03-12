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
public class FacturaTableModel extends AbstractTableModel{
    
    private ArrayList<String[]> datosTablaFactura;
    private String[] titolsColumnes = {"Plat","Cantidad","Precio"};

    @Override
    public int getRowCount() {
        return datosTablaFactura.size();
    }

    @Override
    public int getColumnCount() {
        return titolsColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datosTablaFactura.get(rowIndex)[columnIndex];
    }

    public FacturaTableModel(ArrayList<String[]> datosTablaFactura) {
        this.datosTablaFactura = datosTablaFactura;
    }


    @Override
    public String getColumnName(int column) {
        return titolsColumnes[column];
    }
}
