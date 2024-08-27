package Modelo;

public class Usuarios {
    private String nombreUsuario;
    private String password;

    public Usuarios(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }
}
