package Vista;
import Controlador.ControladorLogin;
import javax.swing.JFrame;
public class frmLogin extends javax.swing.JFrame{
    public frmLogin() { initComponents();
        new ControladorLogin(this); 
     setLocationRelativeTo(null);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpsPassword = new javax.swing.JPasswordField();
        jtxtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(96, 80, 101));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar2.0.png"))); // NOI18N
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 60, 50));

        btnRun.setBackground(new java.awt.Color(96, 80, 101));
        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/open2.0.png"))); // NOI18N
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silueta2.0.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, -1, -1));

        jpsPassword.setBackground(new java.awt.Color(0, 0, 102));
        jpsPassword.setForeground(new java.awt.Color(41, 246, 129));
        jpsPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 12), new java.awt.Color(41, 246, 129))); // NOI18N
        getContentPane().add(jpsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 120, 60));

        jtxtUsername.setBackground(new java.awt.Color(0, 0, 102));
        jtxtUsername.setForeground(new java.awt.Color(41, 246, 129));
        jtxtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 12), new java.awt.Color(41, 246, 129))); // NOI18N
        jtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login2.0.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRunActionPerformed

    private void jtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPasswordField jpsPassword;
    public javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables


    
}
