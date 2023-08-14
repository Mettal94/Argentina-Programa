/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_javaapp_ejercicio3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class LIstaDeProductos extends javax.swing.JFrame {
private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form LIstaDeProductos
     */
    public LIstaDeProductos() {
        initComponents();
        cargarCombo();
        cargarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelLista = new javax.swing.JLabel();
        JCcategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaDeProductos = new javax.swing.JTable();
        JLabelSeleccion = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        JTprecio = new javax.swing.JTextField();
        JLabelNombre = new javax.swing.JLabel();
        JLabelPrecio = new javax.swing.JLabel();
        JBotonAgregar = new javax.swing.JButton();
        JBotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabelLista.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JLabelLista.setForeground(new java.awt.Color(0, 0, 0));
        JLabelLista.setText("Lista de productos");

        JCcategorias.setSelectedIndex(-1);
        JCcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCcategoriasActionPerformed(evt);
            }
        });

        JTablaDeProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTablaDeProductos);

        JLabelSeleccion.setText("Seleccione la categoría del producto a agregar");

        JLabelNombre.setText("Nombre del producto:");

        JLabelPrecio.setText("Precio:");

        JBotonAgregar.setText("Agregar");
        JBotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonAgregarActionPerformed(evt);
            }
        });

        JBotonEliminar.setText("Eliminar");
        JBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabelSeleccion)
                        .addGap(18, 18, 18)
                        .addComponent(JCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(JLabelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(JLabelPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(JLabelNombre)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(JTprecio))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBotonEliminar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBotonAgregar)
                        .addGap(211, 211, 211))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelLista)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelSeleccion)
                    .addComponent(JCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelPrecio))
                .addGap(18, 18, 18)
                .addComponent(JBotonAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBotonEliminar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCcategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCcategoriasActionPerformed

    private void JBotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonAgregarActionPerformed
        // Boton de agregar producto
        try{
            if(JTnombre.getText().isEmpty()||JTprecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.");
                return;
            }
            String nombre = JTnombre.getText();
            Double precio = Double.parseDouble(JTprecio.getText());
            String categoria =(String)JCcategorias.getSelectedItem();
            Producto p = new Producto(nombre, precio,categoria);
            cargarDatos(p);
            JTnombre.setText("");
            JTprecio.setText("");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "En el precio tenés que ingresar un número, mamertit@.");
        }
    }//GEN-LAST:event_JBotonAgregarActionPerformed

    private void JBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonEliminarActionPerformed
        // Boton eliminar
        int filas = JTablaDeProductos.getSelectedRow();
        if(filas!=-1){
            modelo.removeRow(filas);
        }else{
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila a borrar.");
        }
    }//GEN-LAST:event_JBotonEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LIstaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIstaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIstaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIstaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LIstaDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBotonAgregar;
    private javax.swing.JButton JBotonEliminar;
    private javax.swing.JComboBox<String> JCcategorias;
    private javax.swing.JLabel JLabelLista;
    private javax.swing.JLabel JLabelNombre;
    private javax.swing.JLabel JLabelPrecio;
    private javax.swing.JLabel JLabelSeleccion;
    private javax.swing.JTable JTablaDeProductos;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTprecio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        JCcategorias.addItem("Ropa");
        JCcategorias.addItem("Electrodomésticos");
        JCcategorias.addItem("Perfumería");
    }
    
    private void cargarCabecera(){
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoría");
        JTablaDeProductos.setModel(modelo);
    }
    
    private void cargarDatos(Producto producto){
        modelo.addRow(new Object[]{producto.getNombre(), (producto.getPrecio()+"$"), producto.getCategoria()});
    }

}

