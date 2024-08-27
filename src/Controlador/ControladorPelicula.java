package Controlador;

import Vista.frmPelicula;
import Vista.frmAsientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPelicula implements ActionListener {
    private frmPelicula vista;
    private frmAsientos frmAsientosInstance;

    public ControladorPelicula(frmPelicula vista) {
        this.vista = vista;
        this.vista.btnPelicula1.addActionListener(this);
        this.vista.btnPelicula2.addActionListener(this);
        this.vista.btnPelicula3.addActionListener(this);
        this.vista.btnPelicula4.addActionListener(this);
        this.vista.btnPelicula5.addActionListener(this);
        this.vista.btnPelicula6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnPelicula1 || 
            e.getSource() == vista.btnPelicula2 || 
            e.getSource() == vista.btnPelicula3 || 
            e.getSource() == vista.btnPelicula4 || 
            e.getSource() == vista.btnPelicula5 || 
            e.getSource() == vista.btnPelicula6) {
            
            mostrarFrmAsientos();
        }
    }

    private void mostrarFrmAsientos() {
        if (frmAsientosInstance == null) {
            frmAsientosInstance = new frmAsientos();
            frmAsientosInstance.setSize(1050, 690);
            frmAsientosInstance.setLocation(10, 10);
            vista.getParent().add(frmAsientosInstance);
        }
        frmAsientosInstance.setVisible(true);
        try {
            frmAsientosInstance.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }
}
