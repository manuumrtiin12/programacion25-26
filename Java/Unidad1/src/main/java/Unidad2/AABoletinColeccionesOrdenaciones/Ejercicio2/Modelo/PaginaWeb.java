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
        } else {
            this.fecha = fecha;
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
        if (this == o) return true;
        if (!(o instanceof PaginaWeb)) return false;
        PaginaWeb that = (PaginaWeb) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(fecha, that.fecha);
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