package Vista;
import Controlador.ControladorPrincipal;

public class frmPrincipal extends javax.swing.JFrame {
    public frmPrincipal() {
        initComponents();
        new ControladorPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vntnPrincipal = new javax.swing.JDesktopPane();
        btnCerrar = new javax.swing.JButton();
        btnCompleto = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vntnPrincipal.setBackground(new java.awt.Color(102, 102, 255));
        vntnPrincipal.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout vntnPrincipalLayout = new javax.swing.GroupLayout(vntnPrincipal);
        vntnPrincipal.setLayout(vntnPrincipalLayout);
        vntnPrincipalLayout.setHorizontalGroup(
            vntnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        vntnPrincipalLayout.setVerticalGroup(
            vntnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(vntnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1060, 700));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar2.0.png"))); // NOI18N
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        btnCompleto.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnCompleto.setForeground(new java.awt.Color(0, 0, 204));
        btnCompleto.setText("GO");
        getContentPane().add(btnCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 8, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnCompleto;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JDesktopPane vntnPrincipal;
    // End of variables declaration//GEN-END:variables

}
