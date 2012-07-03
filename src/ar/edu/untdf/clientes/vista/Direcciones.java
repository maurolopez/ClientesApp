package ar.edu.untdf.clientes.vista;

import ar.edu.untdf.clientes.util.DireccionesTableListener;

/**
 *
 * @author Mauro
 */
public class Direcciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Direcciones
     */
    public Direcciones() {
        initComponents();
        DireccionesTableListener listener = new DireccionesTableListener(this);
        jtDirecciones.getSelectionModel().addListSelectionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsp = new javax.swing.JScrollPane();
        jtDirecciones = new javax.swing.JTable();
        jbNuevo = new javax.swing.JButton();
        jpDatos = new javax.swing.JPanel();
        jlCalle = new javax.swing.JLabel();
        jtfCalle = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        jtDirecciones.setModel(new ar.edu.untdf.clientes.util.DireccionTableModel());
        jsp.setViewportView(jtDirecciones);

        jbNuevo.setText("Nuevo");

        jlCalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlCalle.setText("Calle");

        jlNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlNumero.setText("Numero");

        jlTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlTipo.setText("Tipo");

        jlTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlTelefono.setText("Telefono");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addComponent(jlTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCalle)
                            .addComponent(jlNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jtfNumero))))
                .addContainerGap())
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCalle)
                    .addComponent(jtfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumero)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo)
                    .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbAceptar.setText("Aceptar");
        jbAceptar.setEnabled(false);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbAceptar)
                            .addGap(18, 18, 18)
                            .addComponent(jbCancelar))
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbNuevo)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAceptar)
                            .addComponent(jbCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JLabel jlCalle;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JTable jtDirecciones;
    private javax.swing.JTextField jtfCalle;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTextField jtfTipo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jbAceptar
     */
    public javax.swing.JButton getJbAceptar() {
        return jbAceptar;
    }

    /**
     * @param jbAceptar the jbAceptar to set
     */
    public void setJbAceptar(javax.swing.JButton jbAceptar) {
        this.jbAceptar = jbAceptar;
    }

    /**
     * @return the jbCancelar
     */
    public javax.swing.JButton getJbCancelar() {
        return jbCancelar;
    }

    /**
     * @param jbCancelar the jbCancelar to set
     */
    public void setJbCancelar(javax.swing.JButton jbCancelar) {
        this.jbCancelar = jbCancelar;
    }

    /**
     * @return the jbNuevo
     */
    public javax.swing.JButton getJbNuevo() {
        return jbNuevo;
    }

    /**
     * @param jbNuevo the jbNuevo to set
     */
    public void setJbNuevo(javax.swing.JButton jbNuevo) {
        this.jbNuevo = jbNuevo;
    }

    /**
     * @return the jlCalle
     */
    public javax.swing.JLabel getJlCalle() {
        return jlCalle;
    }

    /**
     * @param jlCalle the jlCalle to set
     */
    public void setJlCalle(javax.swing.JLabel jlCalle) {
        this.jlCalle = jlCalle;
    }

    /**
     * @return the jlNumero
     */
    public javax.swing.JLabel getJlNumero() {
        return jlNumero;
    }

    /**
     * @param jlNumero the jlNumero to set
     */
    public void setJlNumero(javax.swing.JLabel jlNumero) {
        this.jlNumero = jlNumero;
    }

    /**
     * @return the jlTelefono
     */
    public javax.swing.JLabel getJlTelefono() {
        return jlTelefono;
    }

    /**
     * @param jlTelefono the jlTelefono to set
     */
    public void setJlTelefono(javax.swing.JLabel jlTelefono) {
        this.jlTelefono = jlTelefono;
    }

    /**
     * @return the jlTipo
     */
    public javax.swing.JLabel getJlTipo() {
        return jlTipo;
    }

    /**
     * @param jlTipo the jlTipo to set
     */
    public void setJlTipo(javax.swing.JLabel jlTipo) {
        this.jlTipo = jlTipo;
    }

    /**
     * @return the jpDatos
     */
    public javax.swing.JPanel getJpDatos() {
        return jpDatos;
    }

    /**
     * @param jpDatos the jpDatos to set
     */
    public void setJpDatos(javax.swing.JPanel jpDatos) {
        this.jpDatos = jpDatos;
    }

    /**
     * @return the jsp
     */
    public javax.swing.JScrollPane getJsp() {
        return jsp;
    }

    /**
     * @param jsp the jsp to set
     */
    public void setJsp(javax.swing.JScrollPane jsp) {
        this.jsp = jsp;
    }

    /**
     * @return the jtDirecciones
     */
    public javax.swing.JTable getJtDirecciones() {
        return jtDirecciones;
    }

    /**
     * @param jtDirecciones the jtDirecciones to set
     */
    public void setJtDirecciones(javax.swing.JTable jtDirecciones) {
        this.jtDirecciones = jtDirecciones;
    }

    /**
     * @return the jtfCalle
     */
    public javax.swing.JTextField getJtfCalle() {
        return jtfCalle;
    }

    /**
     * @param jtfCalle the jtfCalle to set
     */
    public void setJtfCalle(javax.swing.JTextField jtfCalle) {
        this.jtfCalle = jtfCalle;
    }

    /**
     * @return the jtfNumero
     */
    public javax.swing.JTextField getJtfNumero() {
        return jtfNumero;
    }

    /**
     * @param jtfNumero the jtfNumero to set
     */
    public void setJtfNumero(javax.swing.JTextField jtfNumero) {
        this.jtfNumero = jtfNumero;
    }

    /**
     * @return the jtfTelefono
     */
    public javax.swing.JTextField getJtfTelefono() {
        return jtfTelefono;
    }

    /**
     * @param jtfTelefono the jtfTelefono to set
     */
    public void setJtfTelefono(javax.swing.JTextField jtfTelefono) {
        this.jtfTelefono = jtfTelefono;
    }

    /**
     * @return the jtfTipo
     */
    public javax.swing.JTextField getJtfTipo() {
        return jtfTipo;
    }

    /**
     * @param jtfTipo the jtfTipo to set
     */
    public void setJtfTipo(javax.swing.JTextField jtfTipo) {
        this.jtfTipo = jtfTipo;
    }
}