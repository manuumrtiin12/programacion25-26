package main.java.Unidad2.AABoletinListasColecciones.Ejercicio3.Modelo;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int añoPublicacion;
    private EstadoLibro estado;

    public Libro(String titulo, String autor, String genero, int añoPublicacion, EstadoLibro estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return añoPublicacion == libro.añoPublicacion && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(genero, libro.genero) && estado == libro.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, genero, añoPublicacion, estado);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", estado=" + estado +
                '}';
    }
}
