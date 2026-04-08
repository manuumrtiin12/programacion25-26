package main.java.Unidad2.AASimulacionColecciones.Modelo;


import java.util.Objects;

public class Usuario {

    private int idUsuario;
    private  static int contador = 0;
    private String nombreCompleto;
    private String email;

    public Usuario(String nombreCompleto, String email) {
        contador++;
        this.idUsuario = contador;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + idUsuario +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
