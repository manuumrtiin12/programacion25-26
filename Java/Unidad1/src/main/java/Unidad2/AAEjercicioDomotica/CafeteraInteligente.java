package Unidad2.AAEjercicioDomotica;

public class CafeteraInteligente extends Electrodomestico {

    private double nivelAgua;

    public CafeteraInteligente(String codigoSerie, String marca, double consumoEnergetico, double nivelAgua) {
        super(codigoSerie, marca, consumoEnergetico);
        this.nivelAgua = nivelAgua;
    }

    public void prepararCafe() {
        if (!isConectado() || getEstado() != EstadoElectrodomestico.ENCENDIDO) {
            System.out.println("Cafetera " + getCodigoSerie() + ": no se puede preparar café (apagada o no conectada).");
        } else if (nivelAgua < 10) {
            System.out.println("Cafetera " + getCodigoSerie() + ": nivel de agua insuficiente. Alerta!");
        } else {
            System.out.println("Cafetera " + getCodigoSerie() + ": preparando café...");
        }
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }
}
