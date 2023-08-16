
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PorPrecio extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo2 = new DefaultTableModel(){
        public boolean isCellEditable(int f,int c){
            return false;
        }
    };
    public PorPrecio() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTPrecioMenor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTPrecioMayor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO POR PRECIO");

        jLabel2.setText("Ingrese valores de busqueda");

        jTPrecioMenor.setText("0");
        jTPrecioMenor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMenorKeyReleased(evt);
            }
        });

        jLabel3.setText("y");

        jTPrecioMayor.setText("0");
        jTPrecioMayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMayorKeyReleased(evt);
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
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTPrecioMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTPrecioMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTPrecioMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTPrecioMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // lectura de campo
    private void jTPrecioMenorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMenorKeyReleased
        borrarFilas();
        try {
        double busquedaMenor=0;
        double busquedaMayor=0;
        busquedaMenor = Double.parseDouble(jTPrecioMenor.getText());
        busquedaMayor = Double.parseDouble(jTPrecioMayor.getText());
       
        compararPrecio(busquedaMenor,busquedaMayor);
        } catch (NumberFormatException e) {}
    }//GEN-LAST:event_jTPrecioMenorKeyReleased

    // lectura de campo
    private void jTPrecioMayorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMayorKeyReleased
        borrarFilas();
        try {
        double busquedaMenor=0;
        double busquedaMayor=0;
        busquedaMenor = Double.parseDouble(jTPrecioMenor.getText());
        busquedaMayor = Double.parseDouble(jTPrecioMayor.getText());
       
        compararPrecio(busquedaMenor,busquedaMayor);
        } catch (NumberFormatException e) {}
    }//GEN-LAST:event_jTPrecioMayorKeyReleased
    
    // comparacion de precios
    private void compararPrecio(double Menor,double Mayor){
        for(DataBase prod:Menu.listaDataBase){
            if (prod.getPrecio() >= Menor && prod.getPrecio() <= Mayor) {
                modelo2.addRow(new Object[]{
                prod.getCodigo(),
                prod.getDescripcion(),
                prod.getPrecio(),
                prod.getStock()
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecioMayor;
    private javax.swing.JTextField jTPrecioMenor;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables

    // creacion de tabla
    private void armarCabecera(){
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Descripcion");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Stock");
        jTProductos.setModel(modelo2);
    }
    
    // limpieza de tabla
    private void borrarFilas(){
        int f=jTProductos.getRowCount()-1;
        for (; f >=0; f--) {
            modelo2.removeRow(f);
        }
    }
}

