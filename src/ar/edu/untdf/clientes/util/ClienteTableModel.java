package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.ClientesApp;
import ar.edu.untdf.clientes.controller.ClienteJpaController;
import ar.edu.untdf.clientes.modelo.Cliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matias
 */
public class ClienteTableModel extends AbstractTableModel {

    ClienteJpaController clienteC;
    Object[] clientes;

    public ClienteTableModel() {
        super();
        clienteC = ClientesApp.getClienteC();
        this.clientes = clienteC.findClienteEntities().toArray();
    }

    @Override
    public int getRowCount() {
        return clienteC.getClienteCount();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:return ((Cliente)clientes[row]).getId();
            case 1:return ((Cliente)clientes[row]).getApellido();
            case 2:return ((Cliente)clientes[row]).getNombre();
            case 3:return ((Cliente)clientes[row]).getCuit();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0:return "ID";
            case 1:return "Apellido";
            case 2:return "Nombre";
            case 3:return "Cuit";
            default:return null;
        }
    }
}
