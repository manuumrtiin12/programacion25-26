package Unidad2.AASimulacion2;

import java.util.Objects;

public class Equipo {

    private String nombre;
    private String MAC;
    private String sistemaOperativo;
    private int problemasPendientes = 0;
    private Usuario usuario;

    public Equipo(String nombre, String MAC, String sistemaOperativo, int problemasPendientes, Usuario usuario) {
        this.nombre = nombre;
        this.MAC = MAC;
        this.sistemaOperativo = sistemaOperativo;
        this.problemasPendientes = problemasPendientes;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getProblemasPendientes() {
        return problemasPendientes;
    }

    public void setProblemasPendientes(int problemasPendientes) {
        this.problemasPendientes = problemasPendientes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(MAC, equipo.MAC);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(MAC);
    }

    @Override
    public String toString() {
        return getNombre() + " - " + getMAC() + " - " + getProblemasPendientes()
                + " - Usuario: " + usuario.getNombre();
    }
}
