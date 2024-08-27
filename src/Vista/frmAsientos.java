package Vista;

import javax.swing.JInternalFrame;

public class frmAsientos extends JInternalFrame  {

    
    public frmAsientos() {
         initComponents();
        setClosable(true);
        setMaximizable(false);
        setIconifiable(false);
        setResizable(false);
        setBorder(null); 
        setTitle("Asientos");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vntnButaca = new javax.swing.JDesktopPane();
        btnHorario1 = new javax.swing.JButton();
        btnHorario2 = new javax.swing.JButton();
        btnHorario3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnSgtConfiteria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout vntnButacaLayout = new javax.swing.GroupLayout(vntnButaca);
        vntnButaca.setLayout(vntnButacaLayout);
        vntnButacaLayout.setHorizontalGroup(
            vntnButacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        vntnButacaLayout.setVerticalGroup(
            vntnButacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(vntnButaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1050, 450));

        btnHorario1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnHorario1.setForeground(new java.awt.Color(0, 0, 204));
        btnHorario1.setText("12:30 - 3:15");
        btnHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 170, 40));

        btnHorario2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnHorario2.setForeground(new java.awt.Color(0, 0, 204));
        btnHorario2.setText("4:00 - 7:00");
        jPanel1.add(btnHorario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 140, 40));

        btnHorario3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnHorario3.setForeground(new java.awt.Color(0, 0, 204));
        btnHorario3.setText("7:30 - 10:00");
        jPanel1.add(btnHorario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 160, 40));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 10, 150, 40));

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 255));
        btnRegresar.setText("Volver");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 150, 50));

        btnSgtConfiteria.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnSgtConfiteria.setForeground(new java.awt.Color(255, 0, 51));
        btnSgtConfiteria.setText("Pagar");
        jPanel1.add(btnSgtConfiteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silueta2.0.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHorario1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnHorario1;
    public javax.swing.JButton btnHorario2;
    public javax.swing.JButton btnHorario3;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnSgtConfiteria;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JDesktopPane vntnButaca;
    // End of variables declaration//GEN-END:variables

    

    
}
