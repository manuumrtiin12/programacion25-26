package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Exception.BibliotecaException;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;

    public Biblioteca(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro añadido correctamente.");
    }

    public void prestarLibro(String titulo) {
        boolean encontrado = false;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;

                if (listaLibros.get(i).getEstado() == EstadoLibro.PRESTADO) {
                    throw new BibliotecaException("El libro ya está prestado.");
                } else {
                    listaLibros.get(i).setEstado(EstadoLibro.PRESTADO);
                    System.out.println("Libro prestado correctamente.");
                }
            }
        }

        if (!encontrado) {
            throw new BibliotecaException("El libro no existe en la biblioteca.");
        }
    }

    public void devolverLibro(String titulo) {
        boolean encontrado = false;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;

                if (listaLibros.get(i).getEstado() == EstadoLibro.LIBRE) {
                    throw new BibliotecaException("El libro ya está disponible.");
                } else {
                    listaLibros.get(i).setEstado(EstadoLibro.LIBRE);
                    System.out.println("Libro devuelto correctamente.");
                }
            }
        }

        if (!encontrado) {
            throw new BibliotecaException("El libro no existe en la biblioteca.");
        }
    }

    public void mostrarLibros() {
        if (listaLibros.size() == 0) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (int i = 0; i < listaLibros.size(); i++) {
                System.out.println(listaLibros.get(i));
            }
        }
    }

    public void mostrarDetalleLibro(String titulo) {
        boolean encontrado = false;
        int disponibles = 0;
        int prestados = 0;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;

                if (listaLibros.get(i).getEstado() == EstadoLibro.LIBRE) {
                    disponibles++;
                } else {
                    prestados++;
                }

                System.out.println("Título: " + listaLibros.get(i).getTitulo());
                System.out.println("Autor: " + listaLibros.get(i).getAutor());
                System.out.println("Género: " + listaLibros.get(i).getGenero());
                System.out.println("Año: " + listaLibros.get(i).getAñoPublicacion());
            }
        }

        if (!encontrado) {
            throw new BibliotecaException("El libro no existe.");
        }

        System.out.println("Ejemplares disponibles: " + disponibles);
        System.out.println("Ejemplares prestados: " + prestados);
    }

    public void buscarLibro(String texto) {
        boolean encontrado = false;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(texto) ||
                    listaLibros.get(i).getAutor().equalsIgnoreCase(texto)) {

                System.out.println(listaLibros.get(i));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros.");
        }
    }
}