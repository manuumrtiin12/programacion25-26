package Unidad2.AABoletinHerencias2.Ejercicio1;

public class Mago extends Personaje {

    public Mago(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public String getArma() {
        return "Hechizo";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        return false;
    }
}

