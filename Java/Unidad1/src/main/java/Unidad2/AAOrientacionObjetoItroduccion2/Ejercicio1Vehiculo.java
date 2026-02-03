package main.java.Unidad2.AAOrientacionObjetoItroduccion2;

import java.util.Date;

public class Ejercicio1Vehiculo {

    String marca;
    String modelo;
    Date anyoFabricacion;
    String tipoCombustible;
    int capacidadTanque;

    public double calcularConsumo(double kilometros, double consumoMedio) {
        double litrosNecesarios = (kilometros * consumoMedio) / 100;

        if (litrosNecesarios > capacidadTanque) {
            System.out.println("No hay combustible suficiente en el tanque");
        }

        return litrosNecesarios;
    }

    public boolean alertaCombustible(double combustibleActual) {

        boolean porcentaje = combustibleActual < (this.capacidadTanque * 0.20);

        return porcentaje;

    }

    public Ejercicio1Vehiculo(String marca, String modelo, Date anyoFabricacion, String tipoCombustible, int capacidadTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return "Ejercicio1Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
