
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GestionProductos extends javax.swing.JInternalFrame {

    public GestionProductos() {
        initComponents();
        jcRubro.setModel(new DefaultComboBoxModel<>(Categorias.values()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcRubro = new javax.swing.JComboBox<>();
        jtStock = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DE PRODUCTOS");

        jLabel2.setText("CODIGO");

        jLabel3.setText("DESCRIPCION");

        jLabel4.setText("PRECIO");

        jLabel5.setText("RUBRO");

        jLabel6.setText("STOCK");

        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCodigoKeyReleased(evt);
            }
        });

        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalir)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtPrecio)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                                    .addComponent(jtStock, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // Boton nuevo
        int codigo = Integer.parseInt(jtCodigo.getText());
        int stock = Integer.parseInt(jtStock.getText());
        Double precio = Double.parseDouble(jtPrecio.getText());
        String descripcion = jtDescripcion.getText();
        boolean coincidencia = false;
       
        for (DataBase prod : Menu.listaDataBase) {
            if (prod.getCodigo() == codigo) {
                prod.setStock(prod.getStock() + stock);
                JOptionPane.showMessageDialog(this, "Se actualizó el stock de: " + prod.getDescripcion());
                coincidencia = true;
            }
        }
        if (coincidencia == false) {
            switch (jcRubro.getSelectedIndex()) {
                case 0:
                    Menu.listaDataBase.add(new DataBase(codigo, descripcion, precio, stock, Categorias.COMESTIBLES));
                    break;
                case 1:
                    Menu.listaDataBase.add(new DataBase(codigo, descripcion, precio, stock, Categorias.LIMPIEZA));
                    break;
                case 2:
                    Menu.listaDataBase.add(new DataBase(codigo, descripcion, precio, stock, Categorias.PERFUMERIA));
                    break;
            }
            JOptionPane.showMessageDialog(this, "Se agregó correctamente el producto: " + descripcion);
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // Boton Buscar
        try{
            int codigo = Integer.parseInt(jtCodigo.getText());
            for (DataBase prod : Menu.listaDataBase) {
                if (prod.getCodigo() == codigo) {
                    jtDescripcion.setText(prod.getDescripcion());
                    jtPrecio.setText(prod.getPrecio() + "");
                    jtStock.setText(prod.getStock() + "");
                    
                    jcRubro.setSelectedItem(prod.getRubro());
                    /*
                    if (prod.getRubro().toString().equalsIgnoreCase("Comestibles")) {
                        jcRubro.setSelectedIndex(1);
                    } else if (prod.getRubro().toString().equalsIgnoreCase("Limpieza")) {
                        jcRubro.setSelectedIndex(2);
                    } else {
                        jcRubro.setSelectedIndex(3);
                    }
                    */
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El código ingresado no es válido");
        }   
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        for (DataBase prod : Menu.listaDataBase){
            if (prod.getCodigo()== Integer.parseInt(jtCodigo.getText())){
                prod.setDescripcion(jtDescripcion.getText());
                prod.setPrecio(Double.parseDouble(jtPrecio.getText()));
                prod.setStock(Integer.parseInt(jtStock.getText()));
                prod.setRubro((Categorias)jcRubro.getSelectedItem());
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // boton eliminar
        DataBase producto = null;
        for (Iterator<DataBase> it = Menu.listaDataBase.iterator(); it.hasNext();) {
                producto = it.next();
                if (producto.getCodigo()==Integer.parseInt(jtCodigo.getText())) {
                    int confirmResult = JOptionPane.showInternalConfirmDialog(this, "¿Está seguro que desea eliminar el producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (confirmResult == JOptionPane.YES_OPTION) {
                        Menu.listaDataBase.remove(producto);
                    }
                    jtDescripcion.setText("");
                    jtPrecio.setText("");
                    jtStock.setText("");
                    jtCodigo.setText("");
                    break;
                   }  
                }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // botn salir
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Categorias> jcRubro;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
