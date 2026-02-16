package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Satelite satelite = (Satelite) o;
        return Objects.equals(planetaOrbita, satelite.planetaOrbita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planetaOrbita);
    }
}
