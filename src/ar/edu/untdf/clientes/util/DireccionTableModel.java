package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.ClientesApp;
import ar.edu.untdf.clientes.controller.DireccionJpaController;
import ar.edu.untdf.clientes.modelo.Cliente;
import ar.edu.untdf.clientes.modelo.Direccion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro
 */
public class DireccionTableModel extends AbstractTableModel {

    DireccionJpaController direccionC;
    Object[] direcciones;

    public DireccionTableModel(Cliente c) {
        super();
        direccionC = ClientesApp.getDireccionC();
        Object[] dir = direccionC.findDireccionEntities().toArray();
        int j = 0;
        for (int i = 0;i < dir.length;i++) {
            Direccion dAux = (Direccion) dir[i];
            if(dAux.getCliente().getId() == c.getId()) {
                this.direcciones[j] = dAux;
                j++;
            }
        }
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
            case 0:return ((Direccion)direcciones[row]).getId();
            case 1:return ((Direccion)direcciones[row]).getCalle();
            case 2:return ((Direccion)direcciones[row]).getNumero();
            case 3:return ((Direccion)direcciones[row]).getTipo();
            case 4:return ((Direccion)direcciones[row]).getTelefono();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0:return "ID";
            case 1:return "Calle";
            case 2:return "Numero";
            case 3:return "Tipo";
            case 4:return "Telefono";
            default:return null;
        }
    }
}
