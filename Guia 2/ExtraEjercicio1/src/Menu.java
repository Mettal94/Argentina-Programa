
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f,int c){
            return false;
        }
    };
    public static ArrayList<Tareas> listaTareas = new ArrayList<>();
    public Menu() {
        initComponents();
        armarCabecera();
        prueba();
        reescribir();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbAgregarTarea = new javax.swing.JButton();
        jbEliminarTarea = new javax.swing.JButton();
        jbCambiarEstado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,  new Boolean(false)},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tarea", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        jbAgregarTarea.setText("Agregar Tarea");
        jbAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarTareaActionPerformed(evt);
            }
        });

        jbEliminarTarea.setText("Eliminar Tarea");
        jbEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarTareaActionPerformed(evt);
            }
        });

        jbCambiarEstado.setText("Cambiar Estado");
        jbCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCambiarEstadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE TAREAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAgregarTarea)
                    .addComponent(jbEliminarTarea)
                    .addComponent(jbCambiarEstado))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregarTarea)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminarTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCambiarEstado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarTareaActionPerformed
        // Boton Agregar Tarea
        String texto = JOptionPane.showInputDialog(this,"Ingrese una nueva tarea");
        listaTareas.add(new Tareas (texto,false));
        reescribir();
        
    }//GEN-LAST:event_jbAgregarTareaActionPerformed

    private void jbEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarTareaActionPerformed
        // Boton Borrar Tarea
        int seleccionado = jTable1.getSelectedRow();
        listaTareas.remove(seleccionado);
        reescribir();
    }//GEN-LAST:event_jbEliminarTareaActionPerformed

    private void jbCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCambiarEstadoActionPerformed
        // Boton Cambiar estado
        int seleccionado = jTable1.getSelectedRow();
        Tareas modificado = listaTareas.get(seleccionado);
        modificado.setEstado(!modificado.isEstado());
        reescribir();
    }//GEN-LAST:event_jbCambiarEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgregarTarea;
    private javax.swing.JButton jbCambiarEstado;
    private javax.swing.JButton jbEliminarTarea;
    // End of variables declaration//GEN-END:variables
    
        private void armarCabecera(){
        modelo.addColumn("Descripcion");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }
    
    private void prueba(){
        listaTareas.add(new Tareas ("medico",false));
        listaTareas.add(new Tareas ("escuela",false));
        listaTareas.add(new Tareas ("dolarizar",false));
        listaTareas.add(new Tareas ("escuchar MetallicA",false));
        listaTareas.add(new Tareas ("llorar a la tarde",false));
        
        
    }
    private void reescribir(){
        int f=jTable1.getRowCount()-1;
        for (; f >=0; f--) {
            modelo.removeRow(f);
        }
        for(Tareas tar:Menu.listaTareas){
                modelo.addRow(new Object[]{tar.getDescripcion(),tar.isEstado()});
        }
    }

}
