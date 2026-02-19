package main.java.Unidad2.AAEjercicioDomotica;

public class BombillaRegulable extends SistemaIluminacion {

    public BombillaRegulable(String codigoSerie, String color) {
        super(codigoSerie, color);
    }

    @Override
    public void apagar() {
        System.out.println("Bombilla " + getCodigoSerie() + ": reduciendo intensidad gradualmente...");
        for (int i = getIntensidad(); i >= 0; i -= 20) {
            setIntensidad(i);
            System.out.println("Intensidad: " + getIntensidad() + "%");
        }
        setIntensidad(0);
    }

    public void cambiarAmbiente(String colorHex) {
        if (colorHex.matches("^#[0-9A-Fa-f]{6}$")) {
            setColor(colorHex);
            System.out.println("Bombilla " + getCodigoSerie() + ": color cambiado a " + colorHex);
        } else {
            System.out.println("Bombilla " + getCodigoSerie() + ": código hexadecimal inválido.");
        }
    }
}
