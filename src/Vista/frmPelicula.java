package Vista;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class frmPelicula extends JInternalFrame {

    public frmPelicula() {
        initComponents();
        setClosable(true);
        setMaximizable(false);
        setIconifiable(false);
        setResizable(false);
        setBorder(null); 
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
        setTitle("Película");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPelicula1 = new javax.swing.JButton();
        btnPelicula2 = new javax.swing.JButton();
        btnPelicula3 = new javax.swing.JButton();
        btnPelicula4 = new javax.swing.JButton();
        btnPelicula5 = new javax.swing.JButton();
        btnPelicula6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPelicula1.setForeground(new java.awt.Color(0, 51, 255));
        btnPelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula1.png"))); // NOI18N
        btnPelicula1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelicula1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, 230));

        btnPelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula2.png"))); // NOI18N
        btnPelicula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelicula2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 200, 230));

        btnPelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula3.png"))); // NOI18N
        btnPelicula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelicula3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPelicula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 200, 230));

        btnPelicula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula4.png"))); // NOI18N
        btnPelicula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelicula4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPelicula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 200, 230));

        btnPelicula5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula5.png"))); // NOI18N
        jPanel1.add(btnPelicula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 200, 230));

        btnPelicula6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula6.png"))); // NOI18N
        btnPelicula6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelicula6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPelicula6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 200, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Titulo1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo4.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo5.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo6.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 160, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.0.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPelicula6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelicula6ActionPerformed
    }//GEN-LAST:event_btnPelicula6ActionPerformed

    private void btnPelicula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelicula2ActionPerformed
    }//GEN-LAST:event_btnPelicula2ActionPerformed

    private void btnPelicula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelicula3ActionPerformed
    }//GEN-LAST:event_btnPelicula3ActionPerformed

    private void btnPelicula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelicula4ActionPerformed
    }//GEN-LAST:event_btnPelicula4ActionPerformed

    private void btnPelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelicula1ActionPerformed
    }//GEN-LAST:event_btnPelicula1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPelicula1;
    public javax.swing.JButton btnPelicula2;
    public javax.swing.JButton btnPelicula3;
    public javax.swing.JButton btnPelicula4;
    public javax.swing.JButton btnPelicula5;
    public javax.swing.JButton btnPelicula6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
