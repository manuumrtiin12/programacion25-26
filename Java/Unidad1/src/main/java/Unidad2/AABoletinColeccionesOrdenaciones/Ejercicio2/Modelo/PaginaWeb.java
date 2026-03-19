package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio2.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class PaginaWeb {

    private String url;
    private LocalDate fecha;

    public PaginaWeb(String url, LocalDate fecha) {
        this.url = url;

        if (fecha == null) {
            this.fecha = LocalDate.now();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaginaWeb paginaWeb = (PaginaWeb) o;
        return Objects.equals(url, paginaWeb.url) && Objects.equals(fecha, paginaWeb.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, fecha);
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "url='" + url + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
