package Unidad2.AABoletinHerencias2.Ejercicio1;

public class Caballero extends Personaje {

    public Caballero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public String getArma() {
        return "Espada";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        // Arquero sin distancia -> sí puede
        if (atacante instanceof Arquero) {
            return true;
        }

        // Mago siempre puede
        if (atacante instanceof Mago) {
            return true;
        }

        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        // Arquero solo si está a más de 100 metros
        if (atacante instanceof Arquero && distancia > 100) {
            return true;
        }

        // Mago siempre puede
        if (atacante instanceof Mago) {
            return true;
        }

        return false;
    }
}

