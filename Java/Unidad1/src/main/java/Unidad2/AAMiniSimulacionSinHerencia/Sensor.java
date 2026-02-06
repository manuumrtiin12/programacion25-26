package Unidad2.AAMiniSimulacionSinHerencia;

public class Sensor {
    private double distanciaObstaculo;
    private double velocidad;

    public boolean alertaObstaculo() {

        boolean obstaculo = false;

        if (this.distanciaObstaculo <= 50.0) {

            obstaculo = true;
        }

        return obstaculo;
    }

    public boolean alertaVelocidad() {

        boolean velocidad = false;

        if (this.velocidad >= 120.0) {
            velocidad = true;
        }

        return velocidad;
    }

    public Sensor(double distanciaObstaculo, double velocidad) {
        this.distanciaObstaculo = distanciaObstaculo;
        this.velocidad = velocidad;
    }

    public double getDistanciaObstaculo() {
        return distanciaObstaculo;
    }

    public void setDistanciaObstaculo(double distanciaObstaculo) {
        this.distanciaObstaculo = distanciaObstaculo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Sensor{" + "distanciaObstaculo=" + distanciaObstaculo + ", velocidad=" + velocidad + "}";
    }
}