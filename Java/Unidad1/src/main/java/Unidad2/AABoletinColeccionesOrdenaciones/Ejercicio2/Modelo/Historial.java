package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Modelo;

import main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Exception.HistorialException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {

    private ArrayList<PaginaWeb> paginas;

    public Historial() {
        paginas = new ArrayList<>();
    }

    public void agregarPaginaWeb(PaginaWeb p) {

        if (p.getFecha().isAfter(LocalDate.now())) {
            throw new HistorialException("No se permiten fechas futuras");
        }

        paginas.add(p);

        paginas.sort((p1, p2) -> p1.getFecha().compareTo(p2.getFecha()));
    }

    public void consultarHistorial() {
        for (PaginaWeb pagina : paginas) {
            System.out.println(pagina);
        }
    }

<<<<<<< HEAD
    public void historialPorDia(LocalDate fecha) {
        for (PaginaWeb p : paginas) {
            if (p.getFecha().equals(fecha)) {
                System.out.println(p);
            }
        }
    }
=======

>>>>>>> 4f5f9b845fe96fc176fb955f58a6447e874ba17e

    public void buscarPorUrl(String url) {
        for (PaginaWeb p : paginas) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                System.out.println(p);
            }
        }
    }

    public void borrarPorUrl(String url) {
        paginas.removeIf(p -> p.getUrl().equalsIgnoreCase(url));
    }
}