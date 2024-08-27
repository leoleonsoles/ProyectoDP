package Controlador;

import Vista.frmLogin;
import Vista.frmPelicula;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {
    private frmPrincipal vista;
    private frmPelicula frmPeliculaInstance = null;

    public ControladorPrincipal(frmPrincipal vista) {
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.btnCompleto.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCompleto) {
            mostrarFrmPelicula();
        } else if (e.getSource() == vista.btnCerrar) {
            cerrarYMostrarLogin();
        }
    }

    private void mostrarFrmPelicula() {
        for (javax.swing.JInternalFrame frame : vista.vntnPrincipal.getAllFrames()) {
            if (frame instanceof frmPelicula) {
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException ex) {
                    ex.printStackTrace();
                }
                return;
            }
        }
        frmPeliculaInstance = new frmPelicula();
        frmPeliculaInstance.setSize(1050, 690);
        frmPeliculaInstance.setLocation(10, 10);
        vista.vntnPrincipal.add(frmPeliculaInstance);
        new ControladorPelicula(frmPeliculaInstance);
        frmPeliculaInstance.setVisible(true);
    }

    private void cerrarYMostrarLogin() {
        vista.dispose();
        new frmLogin().setVisible(true);
    }
}
