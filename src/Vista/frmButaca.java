package Vista;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class frmButaca extends JInternalFrame {

    public frmButaca() {
        initComponents();
        setClosable(true);
        setMaximizable(false);
        setIconifiable(false);
        setResizable(false);
        setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setTitle("Butacas");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnButaca1 = new javax.swing.JButton();
        btnButaca2 = new javax.swing.JButton();
        btnButaca3 = new javax.swing.JButton();
        btnButaca4 = new javax.swing.JButton();
        btnButaca5 = new javax.swing.JButton();
        btnButaca6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnButaca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        jPanel1.add(btnButaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 140));

        btnButaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        jPanel1.add(btnButaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 140));

        btnButaca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        jPanel1.add(btnButaca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 140, 140));

        btnButaca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        btnButaca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButaca4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnButaca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, 140));

        btnButaca5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        jPanel1.add(btnButaca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 140, 140));

        btnButaca6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/butaca2.0.png"))); // NOI18N
        jPanel1.add(btnButaca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 140, 140));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 380, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1045, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnButaca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnButaca4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnButaca4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnButaca1;
    public javax.swing.JButton btnButaca2;
    public javax.swing.JButton btnButaca3;
    public javax.swing.JButton btnButaca4;
    public javax.swing.JButton btnButaca5;
    public javax.swing.JButton btnButaca6;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
