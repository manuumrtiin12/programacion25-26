package main.java.Unidad2.AAEjercicioDomotica;

public abstract class Electrodomestico implements Inteligente {

    private String codigoSerie;
    private String marca;
    protected double consumoEnergetico;
    private EstadoElectrodomestico estado;
    private boolean conectado;

    public Electrodomestico(String codigoSerie, String marca, double consumoEnergetico) {
        this.codigoSerie = codigoSerie;
        this.marca = marca;
        setConsumoEnergetico(consumoEnergetico);
        this.estado = EstadoElectrodomestico.APAGADO;
        this.conectado = false;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public String getMarca() {
        return marca;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public boolean isConectado() {
        return conectado;
    }

    public EstadoElectrodomestico getEstado() {
        return estado;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Electrodoméstico " + codigoSerie + " conectado al WiFi.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Electrodoméstico " + codigoSerie + " desconectado del WiFi.");
    }

    @Override
    public void encender() {
        estado = EstadoElectrodomestico.ENCENDIDO;
        System.out.println("Electrodoméstico " + codigoSerie + " encendido.");
    }

    @Override
    public void apagar() {
        estado = EstadoElectrodomestico.APAGADO;
        System.out.println("Electrodoméstico " + codigoSerie + " apagado.");
    }

    protected void setConsumoEnergetico(double consumoEnergetico) {
        if (consumoEnergetico < 0) {
            this.consumoEnergetico = 0;
        } else {
            this.consumoEnergetico = consumoEnergetico;
        }
    }
}

