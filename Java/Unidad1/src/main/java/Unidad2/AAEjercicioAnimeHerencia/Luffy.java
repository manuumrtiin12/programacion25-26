package Unidad2.AAEjercicioAnimeHerencia;

import java.util.Objects;

public class Luffy extends PersonajeAnime{

    private String fruta;
    private boolean estaEnAgua;

    void reir() {
        System.out.println(getNombre() + " se esta riendo a carcajadas");

    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public boolean isEstaEnAgua() {
        return estaEnAgua;
    }

    public void setEstaEnAgua(boolean estaEnAgua) {
        this.estaEnAgua = estaEnAgua;
    }

    public Luffy(String nombre, String fruta, boolean estaEnAgua) {
        super(nombre);
        this.fruta = fruta;
        this.estaEnAgua = estaEnAgua;
    }

    @Override
    public String toString() {
        return "Luffy{" +
                "fruta='" + getFruta() + '\'' +
                ", estaEnAgua=" + isEstaEnAgua() +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", edad=" + getEdad() +
                ", transformacion=" + getTransformacion() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Luffy luffy = (Luffy) o;
        return estaEnAgua == luffy.estaEnAgua && Objects.equals(fruta, luffy.fruta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fruta, estaEnAgua);
    }
}
