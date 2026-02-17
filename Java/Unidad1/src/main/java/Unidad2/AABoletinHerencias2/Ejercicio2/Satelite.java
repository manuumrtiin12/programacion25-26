package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

public class Satelite extends Astro {

    private Planeta planetaOrbita;

    public Satelite(String nombre, double masa, double diametro,
                    double periodoRotacion, double periodoTraslacion,
                    double distanciaMedia, Planeta planetaOrbita) {

        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planetaOrbita = planetaOrbita;
    }

    public Planeta getPlanetaOrbita() {
        return planetaOrbita;
    }

    public void setPlanetaOrbita(Planeta planetaOrbita) {
        this.planetaOrbita = planetaOrbita;
    }

    @Override
    public String toString() {
        return "Satelite: " + getNombre() +
                " | Masa: " + getMasa() +
                " | Diámetro: " + getDiametro();
    }
}
