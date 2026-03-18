package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo;

import java.util.LinkedHashSet;
import java.util.Objects;

public class RepoPrestamo {

    private LinkedHashSet<Prestamo> prestamos;


    public void agregarPrestamo(Prestamo p) {

        if (!prestamos.contains(p)) {
            prestamos.add(p);
        }
    }

    public void listarPrestamo(String titulo, String autor) {

        Prestamo p1 = null;

        for (Prestamo p : prestamos) {
            if (p.getLibro().getTitulo().equals(titulo) && p.getLibro().getAutor().equals(autor)) {
                p1 = p;
            }
        }
    }

    public void mostrarPrestamos() {

        int contador = 1;

        for (Prestamo p :prestamos) {
            System.out.println("Prestamo " + contador + " " + contador);
        }
    }


    public RepoPrestamo(LinkedHashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public LinkedHashSet<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedHashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RepoPrestamo that = (RepoPrestamo) o;
        return Objects.equals(prestamos, that.prestamos);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(prestamos);
    }

    @Override
    public String toString() {
        return "RepoPrestamo{" +
                "prestamos=" + prestamos +
                '}';
    }
}
