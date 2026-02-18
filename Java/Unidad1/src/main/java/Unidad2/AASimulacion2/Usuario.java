package Unidad2.AASimulacion2;

import java.util.Objects;

public class Usuario {

    private String dni;
    private String nombre;
    private String departamento;

    public Usuario(String dni, String nombre, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ")";
    }
}
