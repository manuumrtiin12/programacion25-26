package main.java.Unidad2.AABoletinHerencias2.Ejercicio1;

public class Arquero extends Personaje {

    public Arquero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public String getArma() {
        return "Flecha";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        // El mago siempre puede
        if (atacante instanceof Mago) {
            return true;
        }

        // Caballero sin distancia NO puede
        if (atacante instanceof Caballero) {
            return false;
        }

        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        // Caballero solo si está a menos de 50 metros
        if (atacante instanceof Caballero && distancia < 50) {
            return true;
        }

        // Mago siempre puede
        if (atacante instanceof Mago) {
            return true;
        }

        return false;
    }
}
