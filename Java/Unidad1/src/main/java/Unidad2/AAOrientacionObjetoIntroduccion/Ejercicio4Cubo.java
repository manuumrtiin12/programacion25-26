package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio4Cubo {

    double lado;
    double litrosActuales;

    double calcularArea() {

        double area = 6 * (this.lado * this.lado);
        return area;
    }

    double calcularVolumen() {

        double volumen = this.lado * this.lado * this.lado;

        return volumen;
    }

    boolean rellenar(double litros) {

        if (litros <= 0) {
            return false;
        }

        double capacidadMaxima = calcularVolumen();
        double espacioDisponible = capacidadMaxima - litrosActuales;

        if (litros <= espacioDisponible) {
            litrosActuales += litros;
            return true;
        } else {
            litrosActuales = capacidadMaxima;
            return false;
        }
    }

    boolean vaciar(double litros) {

        if (litros <= 0) {
            return false;
        }

        if (litros <= litrosActuales) {
            litrosActuales -= litros;
            return true;
        } else {
            litrosActuales = 0;
            return false;
        }
    }


    public Ejercicio4Cubo(double lado, double litrosActuales) {
        this.lado = lado;
        this.litrosActuales = litrosActuales;
    }

    @Override
    public String toString() {
        return "Ejercicio4Cubo{" +
                "lado=" + lado +
                ", litrosActuales=" + litrosActuales +
                '}';
    }
}
