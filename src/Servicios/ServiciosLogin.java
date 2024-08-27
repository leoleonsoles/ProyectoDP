package servicios;

import Interfaces.IRepositorioUsuarios;
import Interfaces.IServicioLogin;
import Modelo.Usuarios;

public class ServiciosLogin implements IServicioLogin {
    private final IRepositorioUsuarios repositorioUsuarios;

    public ServiciosLogin(IRepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    @Override
    public boolean validarCredenciales(String nombreUsuario, String password) {
        Usuarios usuario = repositorioUsuarios.obtenerUsuarioPorNombre(nombreUsuario);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
