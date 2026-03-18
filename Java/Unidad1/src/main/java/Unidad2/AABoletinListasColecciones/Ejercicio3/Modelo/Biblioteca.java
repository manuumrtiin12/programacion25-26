package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Exception.BibliotecaException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private RepoPrestamo repoPrestamos;

    public Biblioteca(ArrayList<Libro> libros, RepoPrestamo repoPrestamos) {
        this.libros = libros;
        this.repoPrestamos = repoPrestamos;
    }

    public Libro buscarLibro(String titulo) {

        Libro encontrado = null;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = libros.get(i);
            }
        }

        if (encontrado == null) {
            throw new BibliotecaException("Libro no encontrado.");
        }

        return encontrado;
    }

    public void prestarLibro(Libro libro, String usuario) {

        boolean existe = false;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).equals(libro)) {
                existe = true;
            }
        }

        if (!existe) {
            throw new BibliotecaException("El libro no está en la biblioteca.");
        }

        int id = repoPrestamos.getPrestamos().size() + 1;

        Prestamo nuevo = new Prestamo(libro, id, usuario, LocalDate.now());

        repoPrestamos.agregarPrestamo(nuevo);

        System.out.println("Préstamo realizado correctamente.");
    }

    public void devolverLibro(Libro libro) {

        Prestamo encontrado = null;

        for (Prestamo p : repoPrestamos.getPrestamos()) {

            if (p.getLibro().equals(libro)) {
                encontrado = p;
            }
        }

        if (encontrado == null) {
            throw new BibliotecaException("Ese libro no está prestado.");
        }

        repoPrestamos.getPrestamos().remove(encontrado);

        System.out.println("Libro devuelto correctamente.");
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public RepoPrestamo getRepoPrestamos() {
        return repoPrestamos;
    }

    public void setRepoPrestamos(RepoPrestamo repoPrestamos) {
        this.repoPrestamos = repoPrestamos;
    }
}