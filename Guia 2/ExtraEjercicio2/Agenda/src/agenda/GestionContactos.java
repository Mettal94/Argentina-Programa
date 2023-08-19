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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAgenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Contactos");

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

        jLabel2.setText("Buscar:");

        jbEliminar.setText("Eliminar");

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar nuevo");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        JDescritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jbEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDescritorio.setLayer(jbAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDescritorioLayout = new javax.swing.GroupLayout(JDescritorio);
        JDescritorio.setLayout(JDescritorioLayout);
        JDescritorioLayout.setHorizontalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDescritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDescritorioLayout.createSequentialGroup()
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar))
                    .addGroup(JDescritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAgregar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDescritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
        );
        JDescritorioLayout.setVerticalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDescritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

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

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // Boton para agregar nuevo contacto
        Agregar ag = new Agregar();
        ag.setVisible(true);
        JDescritorio.add(ag);
        JDescritorio.moveToFront(ag);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // Boton para editar un contacto existente
        try {
            int fila = (jtAgenda.getSelectedRow());

            Editar ed = new Editar(fila);
            ed.setVisible(true);
            JDescritorio.add(ed);
            JDescritorio.moveToFront(ed);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Tenés que seleccionar algún contacto de la tabla mamotret@ (-.-) ");
        }
    }//GEN-LAST:event_jbEditarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbAgregar;
    public javax.swing.JButton jbEditar;
    public javax.swing.JButton jbEliminar;
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

    //Método para actualizar la tabla cuando se agregue un contacto nuevo
    public void actualizarTabla() {
        modelo.setRowCount(0);
        Collections.sort(contactos);

        for (Contacto contacto : contactos) {
            modelo.addRow(new Object[]{contacto.getNombre(), contacto.getApellido(), contacto.getEmail(), contacto.getTel()});
        }
    }
}
