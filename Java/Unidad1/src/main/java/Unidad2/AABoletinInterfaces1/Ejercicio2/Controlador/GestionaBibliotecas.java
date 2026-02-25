package main.java.Unidad2.AABoletinInterfaces1.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinInterfaces1.Ejercicio2.Modelo.*;

public class GestionaBibliotecas {

    public static void main(String[] args) {
        RecursosPrestar[] inventario = new RecursosPrestar[3];

        inventario[0] = new Libro("Cervantes", "Anaya", "Novela", 2);
        inventario[1] = new ContenidoMultimedia("Inception", "Sci-Fi", "pelicula", 1);
        inventario[2] = new ContenidoMultimedia("Elden Ring", "RPG", "juego", 5);

        for (int i = 0; i < inventario.length; i++) {
            imprimirEstado(inventario[i]);
        }

        realizarPrestamo(inventario[0]);
        realizarPrestamo(inventario[0]);
        realizarPrestamo(inventario[0]);

        realizarPrestamo(inventario[1]);

        System.out.println("--- ESTADO FINAL ---");
        for (RecursosPrestar recurso : inventario) {
            System.out.println(recurso.toString() + " | Días préstamo: " + recurso.getDevuelveDiasPrestamo());
        }
    }

    public static void realizarPrestamo(RecursosPrestar r) {
        if (r.estaDisponible()) {
            r.setUnidadesPrestadas(r.getUnidadesPrestadas() + 1);
            System.out.println("Éxito: Préstamo concedido.");
        } else {
            System.out.println("Error: No hay stock disponible.");
        }
    }

    public static void imprimirEstado(RecursosPrestar r) {
        String tipo = (r instanceof Libro) ? "Libro" : "Multimedia";
        System.out.println(tipo + " disponible: " + r.estaDisponible());
    }
}