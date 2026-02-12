package Unidad2.AABoletinHerencias2.Ejercicio1;

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

        boolean atacado = false;

        if (atacante instanceof Mago) {
            atacado = true;
        }

        if (atacante instanceof Caballero) {
            atacado = false;
        }

        return atacado;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        boolean atacado = false;

        if (atacante instanceof Caballero && distancia < 50) {
            atacado = true;
        }

        if (atacante instanceof Mago) {
            atacado = true;
        }

        return atacado;
    }
}
