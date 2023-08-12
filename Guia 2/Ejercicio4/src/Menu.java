
import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {
   public static TreeSet<DataBase> listaDataBase = new TreeSet<>();
    public Menu() {
        initComponents();
        productosagregados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMPorRubro = new javax.swing.JMenuItem();
        jMPorPrecio = new javax.swing.JMenuItem();
        jMPorNombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jMProductos.setText("Productos");
        jMProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMPorRubro.setText("Por Rubro");
        jMenu2.add(jMPorRubro);

        jMPorPrecio.setText("Por Precio");
        jMPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMPorPrecio);

        jMPorNombre.setText("Por Nombre");
        jMPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPorNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMPorNombre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMProductosActionPerformed

    //evento desconocido
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PorNombre pn = new PorNombre();
        pn.setVisible(true);
        escritorio.add(pn);
        escritorio.moveToFront(pn);
    }//GEN-LAST:event_jMenu2ActionPerformed
    
    // apertura de "busqeuda por nombre"
    private void jMPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPorNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PorNombre pn = new PorNombre();
        pn.setVisible(true);
        escritorio.add(pn);
        escritorio.moveToFront(pn);
    }//GEN-LAST:event_jMPorNombreActionPerformed
    
    //apertura de "busqeda por precio"
    private void jMPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPorPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PorPrecio pp = new PorPrecio();
        pp.setVisible(true);
        escritorio.add(pp);
        escritorio.moveToFront(pp);
    }//GEN-LAST:event_jMPorPrecioActionPerformed

    
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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMPorNombre;
    private javax.swing.JMenuItem jMPorPrecio;
    private javax.swing.JMenuItem jMPorRubro;
    private javax.swing.JMenuItem jMProductos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void productosagregados(){
        listaDataBase.add(new DataBase(5,"Azucar",300,50,Categorias.COMESTIBLES));
        listaDataBase.add(new DataBase(8,"yerba",1000,50,Categorias.COMESTIBLES));
        listaDataBase.add(new DataBase(1,"lavandina",600,50,Categorias.LIMPIEZA));
        listaDataBase.add(new DataBase(11,"detergente",480,50,Categorias.LIMPIEZA));
        listaDataBase.add(new DataBase(556,"Perfune",1500,50,Categorias.PERFUMERIA));
        listaDataBase.add(new DataBase(353,"desodorante",750,50,Categorias.PERFUMERIA));
        
    }
}
