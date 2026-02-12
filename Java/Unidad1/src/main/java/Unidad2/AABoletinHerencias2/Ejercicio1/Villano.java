package Unidad2.AABoletinHerencias2.Ejercicio1;

public class Villano extends Personaje {

    public Villano(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public String getArma() {
        return "";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return true;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        return true;
    }
}
