package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Modelo;

import main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Exception.HistorialException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {

    private ArrayList<PaginaWeb> paginas;

    public void agregarPaginaWeb(PaginaWeb p) {

        if (p.getFecha().isAfter(LocalDate.now())) {

            throw new HistorialException("La fecha es despues del registro actual");
        }

        else {
            paginas.add(p);
        }
    }

    public void consultarHistorial() {

        for (PaginaWeb pagina : paginas) {
            System.out.println(pagina.toString());
        }

    }

    


}
