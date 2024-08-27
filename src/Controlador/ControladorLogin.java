package Controlador;

import Vista.frmLogin;
import Vista.frmPrincipal;
import Interfaces.IServicioLogin;
import repositorio.RepositorioUsuarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import servicios.ServiciosLogin;

public class ControladorLogin implements ActionListener {
    private frmLogin vista;
    private IServicioLogin servicioLogin;

    public ControladorLogin(frmLogin vista) {
        this.vista = vista;
        this.servicioLogin = new ServiciosLogin(new RepositorioUsuarios());
        this.vista.btnRun.addActionListener(this);
        this.vista.btnClose.addActionListener(this);
        this.vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRun) {
            String usuario = vista.jtxtUsername.getText();
            String password = new String(vista.jpsPassword.getPassword());

            if (servicioLogin.validarCredenciales(usuario, password)) {
                JOptionPane.showMessageDialog(vista, "Login exitoso!", "Información", JOptionPane.INFORMATION_MESSAGE);
                AbrirMenu();
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == vista.btnClose) {
            System.exit(0);
        }
    }

    private void AbrirMenu() {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        new ControladorPrincipal(vistaPrincipal);
        vistaPrincipal.setVisible(true);
        vista.dispose();
    }
}
