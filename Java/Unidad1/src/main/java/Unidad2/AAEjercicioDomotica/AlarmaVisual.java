package main.java.Unidad2.AAEjercicioDomotica;

public class AlarmaVisual extends SistemaIluminacion {

    public AlarmaVisual(String codigoSerie) {
        super(codigoSerie, "#FFFFFF");
    }

    public void activarModoPanico() {
        setIntensidad(100);
        setColor("#FF0000");
        System.out.println("Alarma " + getCodigoSerie() + ": MODO PÁNICO ACTIVADO!");
    }
}
