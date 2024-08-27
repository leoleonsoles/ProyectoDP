package repositorio;

import Interfaces.IRepositorioUsuarios;
import Modelo.Usuarios;

import java.util.HashMap;

public class RepositorioUsuarios implements IRepositorioUsuarios {
    private HashMap<String, Usuarios> usuarios;

    public RepositorioUsuarios() {
        usuarios = new HashMap<>();
        usuarios.put("admin1", new Usuarios("admin1", "1234"));
        usuarios.put("admin2", new Usuarios("admin2", "5678"));
    }

    @Override
    public Usuarios obtenerUsuarioPorNombre(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }
}
