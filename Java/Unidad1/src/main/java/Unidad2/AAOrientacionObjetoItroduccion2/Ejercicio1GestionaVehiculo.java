package main.java.Unidad2.AAOrientacionObjetoItroduccion2;

import java.util.Date;

public class Ejercicio1GestionaVehiculo {

    public static void main(String[] args) {

        Ejercicio1Vehiculo coche1 = new Ejercicio1Vehiculo("Toyota", "Corolla", new Date(), "Gasolina", 50);
        Ejercicio1Vehiculo coche2 = new Ejercicio1Vehiculo("Tesla", "Model 3", new Date(), "Eléctrico", 75);

        double consumoCoche1 = coche1.calcularConsumo(200, 6.5);
        System.out.println("Consumo coche 1: " + consumoCoche1 + " litros");

        double consumoCoche2 = coche2.calcularConsumo(150, 5.0);
        System.out.println("Consumo coche 2: " + consumoCoche2 + " litros");

        if (coche1.alertaCombustible(8)) {
            System.out.println("El coche 1 necesita repostar");
        } else {
            System.out.println("El coche 1 no necesita repostar");
        }

        if (coche2.alertaCombustible(20)) {
            System.out.println("El coche 2 necesita repostar");
        } else {
            System.out.println("El coche 2 no necesita repostar");
        }
    }
}
