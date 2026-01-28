package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio4Cubo {

    private double lado;              // en decímetros
    private double litrosActuales;     // litros dentro del cubo

    public Ejercicio4Cubo(double lado) {
        this.lado = lado;
        this.litrosActuales = 0;
    }

    public double calcularArea() {
        return 6 * lado * lado;
    }

    public double calcularVolumen() {
        return lado * lado * lado;
    }

    public boolean rellenar(double litros) {
        if (litrosActuales + litros <= calcularVolumen()) {
            litrosActuales += litros;
            return true;
        }
        return false;
    }

    public boolean vaciar(double litros) {
        if (litrosActuales - litros >= 0) {
            litrosActuales -= litros;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cubo [lado=" + lado +
                ", litrosActuales=" + litrosActuales +
                ", capacidadMaxima=" + calcularVolumen() + "]";
    }
}
