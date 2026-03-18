package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Controlador;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo.*;
import main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Exception.BibliotecaException;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionaBiblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(lista);

        int opcion = -1;

        while (opcion != 7) {

            System.out.println("--- MENÚ BIBLIOTECA ---");
            System.out.println("1. Agregar un nuevo libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Mostrar detalle de un libro");
            System.out.println("6. Buscar libro");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Error: debes introducir un número.");
                sc.nextLine();
                opcion = -1;
            }

            try {

                if (opcion == 1) {
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    System.out.print("Año: ");
                    int año = sc.nextInt();
                    sc.nextLine();

                    Libro libro = new Libro(titulo, autor, genero, año, EstadoLibro.LIBRE);
                    biblioteca.agregarLibro(libro);

                } else if (opcion == 2) {
                    System.out.print("Título del libro a prestar: ");
                    String titulo = sc.nextLine();

                    biblioteca.prestarLibro(titulo);

                } else if (opcion == 3) {
                    System.out.print("Título del libro a devolver: ");
                    String titulo = sc.nextLine();

                    biblioteca.devolverLibro(titulo);

                } else if (opcion == 4) {
                    biblioteca.mostrarLibros();

                } else if (opcion == 5) {
                    System.out.print("Título del libro: ");
                    String titulo = sc.nextLine();

                    biblioteca.mostrarDetalleLibro(titulo);

                } else if (opcion == 6) {
                    System.out.print("Introduce título o autor: ");
                    String texto = sc.nextLine();

                    biblioteca.buscarLibro(texto);

                } else if (opcion == 7) {
                    System.out.println("Saliendo del programa...");

                } else {
                    System.out.println("Opción inválida.");
                }

            } catch (BibliotecaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}