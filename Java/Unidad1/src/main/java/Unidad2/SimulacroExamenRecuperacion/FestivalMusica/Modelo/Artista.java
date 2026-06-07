package main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Modelo;

import java.util.Objects;

public class Artista implements Comparable<Artista> {

    private String nombre;
    private String GeneroMusical;
    private int cache;

    public Artista(String nombre, String generoMusical, int cache) {
        this.nombre = nombre;
        GeneroMusical = generoMusical;
        this.cache = cache;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroMusical() {
        return GeneroMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        GeneroMusical = generoMusical;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return cache == artista.cache && Objects.equals(nombre, artista.nombre) && Objects.equals(GeneroMusical, artista.GeneroMusical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, GeneroMusical, cache);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", GeneroMusical='" + GeneroMusical + '\'' +
                ", cache=" + cache +
                '}';
    }



    @Override
    public int compareTo(Artista o) {
        int cmp = this.getGeneroMusical().compareTo(o.GeneroMusical); // 1º género ASC
        if (cmp != 0) return cmp;
        return Double.compare(o.cache, this.cache); // 2º caché DESC
    }


}
