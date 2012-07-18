package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.ClientesApp;
import ar.edu.untdf.clientes.controller.DireccionJpaController;
import ar.edu.untdf.clientes.controller.exceptions.NonexistentEntityException;
import ar.edu.untdf.clientes.modelo.Cliente;
import ar.edu.untdf.clientes.modelo.Direccion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro
 */
public class DireccionTableModel extends AbstractTableModel {

    DireccionJpaController direccionC;
    Direccion[] direcciones;

    public DireccionTableModel(Cliente c) {
        super();
        direccionC = ClientesApp.getDireccionC();
        this.direcciones = getDirecciones(c);
    }

    @Override
    public int getRowCount() {
        return direcciones.length;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:return direcciones[row].getId();
            case 1:return direcciones[row].getCalle();
            case 2:return direcciones[row].getNumero();
            case 3:return direcciones[row].getTipo();
            case 4:return direcciones[row].getTelefono();
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

    public Direccion[] getDirecciones(Cliente c) {
        return direccionC.buscarDireccionesDelCliente(c.getId());
    }

    public void eliminarDireccion(int id) {
        try {
            Long aux = (Long) getValueAt(id,0);
            direccionC.destroy(aux);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(DireccionTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
