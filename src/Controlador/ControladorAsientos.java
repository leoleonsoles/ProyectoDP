package Controlador;

import Vista.frmAsientos;
import Vista.frmConfiteria;
import Vista.frmPelicula;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ControladorAsientos implements ActionListener {
    private frmAsientos vista;
    private frmConfiteria frmConfiteriaInstance;
    private frmPelicula frmPeliculaInstance;
    private frmPrincipal frmPrincipalInstance;

    public ControladorAsientos(frmAsientos vista, frmPrincipal frmPrincipal){
        this.vista = vista;
        this.frmPrincipalInstance = frmPrincipal;
        this.vista.btnSgtConfiteria.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnHorario1.addActionListener(this);
        this.vista.btnHorario2.addActionListener(this);
        this.vista.btnHorario3.addActionListener(this);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == vista.btnSgtConfiteria) {
        System.out.println("btnSgtConfiteria presionado");
        abrirYMostrarConfiteria();
    } else if (e.getSource() == vista.btnRegresar) {
        System.out.println("btnRegresar presionado");
        regresarYMostrarPelicula();
    }
}


    private void regresarYMostrarPelicula() {
        ocultarFormularioActual();

        JDesktopPane desktopPane = frmPrincipalInstance.vntnPrincipal;  // Acceso directo a vntnPrincipal

        for (JInternalFrame frame : desktopPane.getAllFrames()) {
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
        desktopPane.add(frmPeliculaInstance);
        new ControladorPelicula(frmPeliculaInstance);
        frmPeliculaInstance.setVisible(true);
    }

    private void abrirYMostrarConfiteria() {
        ocultarFormularioActual();

        JDesktopPane desktopPane = frmPrincipalInstance.vntnPrincipal;  // Acceso directo a vntnPrincipal

        if (frmConfiteriaInstance == null) {
            frmConfiteriaInstance = new frmConfiteria();
            frmConfiteriaInstance.setSize(1045, 645);
            frmConfiteriaInstance.setLocation(10, 10);
            desktopPane.add(frmConfiteriaInstance);
            new ControladorConfiteria(frmConfiteriaInstance);
        }
        frmConfiteriaInstance.setVisible(true);
        try {
            frmConfiteriaInstance.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    private void ocultarFormularioActual() {
        vista.setVisible(false);
        try {
            vista.dispose();  // Cambiar a dispose() en lugar de setClosed(true)
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
