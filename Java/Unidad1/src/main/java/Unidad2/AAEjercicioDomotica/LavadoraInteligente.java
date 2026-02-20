package Unidad2.AAEjercicioDomotica;

public class LavadoraInteligente extends Electrodomestico {

    public LavadoraInteligente(String codigoSerie, String marca, double consumoEnergetico) {
        super(codigoSerie, marca, consumoEnergetico);
    }

    public void iniciarCicloLavado() {
        if (isConectado() && getEstado() == EstadoElectrodomestico.ENCENDIDO) {
            System.out.println("Lavadora " + getCodigoSerie() + ": iniciando ciclo de lavado.");
            System.out.println("Tiempo estimado: 90 minutos.");
        } else {
            System.out.println("Lavadora " + getCodigoSerie() + ": no se puede iniciar el ciclo (apagada o no conectada).");
        }
    }
}
