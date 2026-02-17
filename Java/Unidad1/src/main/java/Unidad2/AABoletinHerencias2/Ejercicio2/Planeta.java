package Unidad2.AABoletinHerencias2.Ejercicio2;

public class Planeta extends Astro {

    private Satelite[] satelites;

    public Planeta(String nombre, double masa, double diametro,
                   double periodoRotacion, double periodoTraslacion,
                   double distanciaMedia, int numSatelites) {

        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new Satelite[numSatelites];
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    public void setSatelite(Satelite satelite, int posicion) {
        if (posicion >= 0 && posicion < satelites.length) {
            satelites[posicion] = satelite;
        }
    }

    @Override
    public String toString() {
        return "Planeta: " + getNombre() +
                " | Masa: " + getMasa() +
                " | Diámetro: " + getDiametro();
    }

    @Override
    public void muestraInformacion() {
        super.muestraInformacion();

        if (satelites != null) {
            for (Satelite s : satelites) {
                if (s != null) {
                    System.out.println("  -> " + s.toString());
                }
            }
        }
    }
}
