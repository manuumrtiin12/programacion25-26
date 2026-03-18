package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {

    private Libro libro;
    private int idPrestamo;
    private String usuario;
    private LocalDate fechaPrestamo;

    public Prestamo(Libro libro, int idPrestamo, String usuario, LocalDate fechaPrestamo) {
        this.libro = libro;
        this.idPrestamo = idPrestamo;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return idPrestamo == prestamo.idPrestamo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPrestamo);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + getLibro() +  
                ", idPrestamo=" + getIdPrestamo() +
                ", usuario='" + getUsuario() + '\'' +
                ", fechaPrestamo=" + getFechaPrestamo() +
                '}';
    }
}
