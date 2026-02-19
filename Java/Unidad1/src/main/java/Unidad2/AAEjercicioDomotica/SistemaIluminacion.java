package main.java.Unidad2.AAEjercicioDomotica;

public abstract class SistemaIluminacion implements Inteligente {

    private String codigoSerie;
    private int intensidad;
    private String color;
    private boolean conectado;

    public SistemaIluminacion(String codigoSerie, String color) {
        this.codigoSerie = codigoSerie;
        this.color = color;
        this.intensidad = 0;
        this.conectado = false;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public String getColor() {
        return color;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100) {
            this.intensidad = intensidad;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Sistema de iluminación " + codigoSerie + " conectado al WiFi.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Sistema de iluminación " + codigoSerie + " desconectado del WiFi.");
    }

    @Override
    public void encender() {
        intensidad = 100;
        System.out.println("Sistema de iluminación " + codigoSerie + " encendido.");
    }

    @Override
    public void apagar() {
        intensidad = 0;
        System.out.println("Sistema de iluminación " + codigoSerie + " apagado.");
    }
}
