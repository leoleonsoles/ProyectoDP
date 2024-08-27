package Vista;


public class frmConfiteria extends javax.swing.JInternalFrame {

  
    public frmConfiteria() {
        initComponents();
        setClosable(true);
        setMaximizable(false);
        setIconifiable(false);
        setResizable(false);
        setBorder(null); 
        setTitle("Confiteria");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDescripcion = new javax.swing.JTable();
        lblNombreTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnCombo1 = new javax.swing.JButton();
        btnCombo2 = new javax.swing.JButton();
        btnCombo3 = new javax.swing.JButton();
        btnCombo4 = new javax.swing.JButton();
        btnCombo5 = new javax.swing.JButton();
        btnCombo6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDescripcion.setBackground(new java.awt.Color(204, 255, 204));
        tblDescripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Cantidad", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(tblDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1030, 220));

        lblNombreTotal.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lblNombreTotal.setForeground(new java.awt.Color(0, 253, 18));
        lblNombreTotal.setText("Total : ");
        jPanel1.add(lblNombreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 70, 40));

        lblTotal.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(29, 255, 44));
        lblTotal.setText("0.0");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 90, 40));

        btnPagar.setText("Pagar");
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 643, 90, 30));

        btnCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo1.0.png"))); // NOI18N
        btnCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 160));

        btnCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo2.0.png"))); // NOI18N
        jPanel1.add(btnCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, 160));

        btnCombo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png"))); // NOI18N
        btnCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 130, 160));

        btnCombo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo4.0.png"))); // NOI18N
        btnCombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCombo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 160));

        btnCombo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo6.0.png"))); // NOI18N
        jPanel1.add(btnCombo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 130, 160));

        btnCombo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo0.0.png"))); // NOI18N
        btnCombo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCombo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 160));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 18), new java.awt.Color(16, 255, 16))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 90, 50));

        btnEliminar.setText("Eliminar");
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 170, 90, 50));

        btnAgregar.setText("Agregar");
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 170, 90, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 350, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.0.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1039, 689));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo1ActionPerformed

    private void btnCombo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo4ActionPerformed

    private void btnCombo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo6ActionPerformed

    private void btnCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCombo1;
    public javax.swing.JButton btnCombo2;
    public javax.swing.JButton btnCombo3;
    public javax.swing.JButton btnCombo4;
    public javax.swing.JButton btnCombo5;
    public javax.swing.JButton btnCombo6;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnPagar;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblNombreTotal;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JTable tblDescripcion;
    public javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

  
   
   
}
