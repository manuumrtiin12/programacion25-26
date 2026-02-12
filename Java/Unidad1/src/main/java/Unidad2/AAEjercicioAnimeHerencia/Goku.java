package Unidad2.AAEjercicioAnimeHerencia;

import java.util.Objects;

public class Goku extends PersonajeAnime{

    private boolean estaVivo;

    public void volar() {

        System.out.println(getNombre() + " esta volando");
    }

    public void obtenerEnergiaVital() {

        System.out.println(getNombre() + " obteniendo energia vital");
    }

    public void teletransportarse() {

        System.out.println(getNombre() + " se esta teletransportando");
    }

    public Goku(String nombre, boolean estaVivo) {
        super(nombre);
        this.estaVivo = estaVivo;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Goku goku = (Goku) o;
        return estaVivo == goku.estaVivo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), estaVivo);
    }


    public String  bntoString() {
        return "Goku{" +
                "estaVivo=" + isEstaVivo() +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", edad=" + getEdad() +
                ", transformacion=" + getTransformacion() +
                '}';
    }
}
