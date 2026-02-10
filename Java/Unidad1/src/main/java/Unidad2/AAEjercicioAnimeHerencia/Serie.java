package Unidad2.AAEjercicioAnimeHerencia;

import java.util.Objects;

public class Serie {

    private String nombre;
    private String autor;
    private int numTemporadas;
    private int numCapitulos;

    public Serie(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;

    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", numCapitulos=" + numCapitulos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nombre, serie.nombre) && Objects.equals(autor, serie.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }
}
