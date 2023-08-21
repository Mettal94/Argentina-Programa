package agenda;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class GestionContactos extends javax.swing.JFrame {

    public DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public static ArrayList<Contacto> contactos = new ArrayList<>();

    public GestionContactos() {
        initComponents();
        cargarCabecera();
        agregamosContactos();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDescritorio = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAgenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAgregar = new javax.swing.JMenu();
        jmEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos");

        jtAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAgenda);

        jLabel2.setText("Buscar por nombre:");

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        JDescritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDescritorioLayout = new javax.swing.GroupLayout(JDescritorio);
        JDescritorio.setLayout(JDescritorioLayout);
        JDescritorioLayout.setHorizontalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDescritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDescritorioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbEliminar))
                    .addGroup(JDescritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JDescritorioLayout.setVerticalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDescritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmAgregar.setText("Agregar nuevo");
        jmAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAgregar);

        jmEditar.setText("Editar");
        jmEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDescritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDescritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarMouseClicked
        // Boton para agregar nuevo contacto
        Agregar ag = new Agregar();
        ag.setVisible(true);
        JDescritorio.add(ag);
        JDescritorio.moveToFront(ag);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jmAgregarMouseClicked

    private void jmEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmEditarMouseClicked
        // Boton para editar un contacto existente
        try {
            int fila = (jtAgenda.getSelectedRow());

            Editar ed = new Editar(fila);
            ed.setVisible(true);
            JDescritorio.add(ed);
            JDescritorio.moveToFront(ed);
            jbEliminar.setEnabled(false);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Tenés que seleccionar algún contacto de la tabla mamotret@ (-.-) ");
            jbEliminar.setEnabled(true);
        }

    }//GEN-LAST:event_jmEditarMouseClicked

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        // Éste es el buscador
        borrarFilas();
        String buscado = jtBuscar.getText();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().isEmpty()) {
                modelo.addRow(new Object[]{contacto.getNombre(), contacto.getApellido(), contacto.getEmail(), contacto.getTel()});
            } else if (contacto.getNombre().toLowerCase().startsWith(buscado.toLowerCase())) {

                modelo.addRow(new Object[]{contacto.getNombre(), contacto.getApellido(), contacto.getEmail(), contacto.getTel()});
            }
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Boton eliminar
        try{
            int eliminado = jtAgenda.getSelectedRow();
            String nombre = contactos.get(eliminado).getNombre();
            String apellido = contactos.get(eliminado).getApellido();
            int confirm = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar a: "+nombre+" "+apellido, "Eliminar", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
            contactos.remove(eliminado);
            }
            actualizarTabla();
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila a eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDescritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbEliminar;
    private javax.swing.JMenu jmAgregar;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JTable jtAgenda;
    private javax.swing.JTextField jtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("E-Mail");
        modelo.addColumn("Teléfono");
        jtAgenda.setModel(modelo);
    }

    //Agregamos algunos contactos
    private void agregamosContactos() {
        contactos.add(new Contacto("Pedro", "Sánchez", "pitersanguich@gmail.com", 123456));
        contactos.add(new Contacto("Rigoberto", "Pontracio", "rigorrini@gmail.com", 543210));
        contactos.add(new Contacto("Augusto", "Williams", "willybilly@gmail.com", 102030));

    }

    //Método para actualizar la tabla
    public void actualizarTabla() {
        modelo.setRowCount(0);
        Collections.sort(contactos);

        for (Contacto contacto : contactos) {
            modelo.addRow(new Object[]{contacto.getNombre(), contacto.getApellido(), contacto.getEmail(), contacto.getTel()});
        }
    }

    //Borrar filas
    private void borrarFilas() {
        int f = jtAgenda.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
