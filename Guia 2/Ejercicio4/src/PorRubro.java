
import javax.swing.table.DefaultTableModel;

public class PorRubro extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo3 = new DefaultTableModel(){
        public boolean isCellEditable(int f,int c){
            return false;
        }
    };
    public PorRubro() {
        initComponents();
        //cargarCombo();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO POR CATEGORIA");

        jLabel2.setText("Indique una categoria");

        jcCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "COMESTIBLES", "PERFUMERIA", "LIMPIEZA" }));
        jcCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriasActionPerformed(evt);
            }
        });

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriasActionPerformed
        borrarFilas();
        for (DataBase prod:Menu.listaDataBase) {
            if (prod.getRubro().equals(jcCategorias.getSelectedItem())) {
                modelo3.addRow(new Object[]{
                prod.getCodigo(),
                prod.getDescripcion(),
                prod.getPrecio(),
                prod.getStock()
                });
            }     
        }
    }//GEN-LAST:event_jcCategoriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductos;
    private javax.swing.JComboBox<String> jcCategorias;
    // End of variables declaration//GEN-END:variables

    //creacion de tabla
    private void armarCabecera(){
        modelo3.addColumn("Codigo");
        modelo3.addColumn("Descripcion");
        modelo3.addColumn("Precio");
        modelo3.addColumn("Stock");
        jTProductos.setModel(modelo3);
    }
    
    //limpieza de tabla
    private void borrarFilas(){
        int f=jTProductos.getRowCount()-1;
        for (; f >=0; f--) {
            modelo3.removeRow(f);
        }
    }
    /*
    private void cargarCombo(){
        jcCategorias.addItem(Categorias.COMESTIBLES);
        jcCategorias.addItem(Categorias.LIMPIEZA);
        jcCategorias.addItem(Categorias.PERFUMERIA);
    }
*/
}
