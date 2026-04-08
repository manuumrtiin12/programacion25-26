package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Modelo.Historial;
import main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Modelo.PaginaWeb;
import main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Exception.HistorialException;

import java.time.LocalDate;
import java.util.Scanner;

public class GestionaHistorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Historial historial = new Historial();
        int opcion;

        do {
            System.out.println("1. Agregar página al historial");
            System.out.println("2. Mostrar historial completo de todos los días");
            System.out.println("3. Calcular historial de un día");
            System.out.println("4. Mostrar registros del historial para una url");
            System.out.println("5. Borrar visitas a una página");
            System.out.println("6. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Introduce la url: ");
                        String url = sc.nextLine();

                        System.out.print("Introduce fecha (YYYY-MM-DD) o vacío: ");
                        String fechaTexto = sc.nextLine();

                        LocalDate fecha = null;

                        if (!fechaTexto.isEmpty()) {
                            fecha = LocalDate.parse(fechaTexto);
                        }

                        PaginaWeb p = new PaginaWeb(url, fecha);
                        historial.agregarPaginaWeb(p);
                        break;

                    case 2:
                        historial.consultarHistorial();
                        break;

                    case 3:
                        System.out.print("Introduce fecha (YYYY-MM-DD): ");
                        LocalDate fechaBusqueda = LocalDate.parse(sc.nextLine());
                        historial.historialPorDia(fechaBusqueda);
                        break;

                    case 4:
                        System.out.print("Introduce la url: ");
                        String urlBusqueda = sc.nextLine();
                        historial.buscarPorUrl(urlBusqueda);
                        break;

                    case 5:
                        System.out.print("Introduce la url: ");
                        String urlBorrar = sc.nextLine();
                        historial.borrarPorUrl(urlBorrar);
                        break;
                }

            } catch (HistorialException e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 6);
    }
}