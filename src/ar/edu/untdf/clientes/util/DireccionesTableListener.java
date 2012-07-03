package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.vista.Direcciones;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Mauro
 */
public class DireccionesTableListener implements ListSelectionListener {

    Direcciones form;
    int rowSelected = 0;

    // It is necessary to keep the table since it is not possible
    // to determine the table from the event's source
    public DireccionesTableListener(Direcciones form) {
        this.form = form;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // If cell selection is enabled, both row and column change events are fired
        if ( this.rowSelected!=form.getJtDirecciones().getSelectedRow() && form.getJtDirecciones().getSelectedRow()>0) { 
            System.out.println(form.getJtDirecciones().getSelectedRow());
            this.rowSelected=form.getJtDirecciones().getSelectedRow();
        }
 
        if (e.getValueIsAdjusting()) {
            // The mouse button has not yet been released
        }
    }
}
