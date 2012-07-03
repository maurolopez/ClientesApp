package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.ClientesApp;
import ar.edu.untdf.clientes.controller.DireccionJpaController;
import ar.edu.untdf.clientes.modelo.Direccion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro
 */
public class DireccionTableModel extends AbstractTableModel {

    DireccionJpaController direccionC;
    Object[] direcciones;

    public DireccionTableModel() {
        super();
        direccionC = ClientesApp.getDireccionC();
        this.direcciones = direccionC.findDireccionEntities().toArray();
    }

    @Override
    public int getRowCount() {
        return direccionC.getDireccionCount();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 1:return ((Direccion)direcciones[row]).getId();
            case 2:return ((Direccion)direcciones[row]).getCalle();
            case 3:return ((Direccion)direcciones[row]).getNumero();
            case 4:return ((Direccion)direcciones[row]).getTipo();
            case 5:return ((Direccion)direcciones[row]).getTelefono();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 1:return "id";
            case 2:return "calle";
            case 3:return "numero";
            case 4:return "tipo";
            case 5:return "telefono";
            default:return null;
        }
    }
}
