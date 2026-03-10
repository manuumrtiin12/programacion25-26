package main.java.Unidad2.AABoletinHerencias1;

import java.util.Arrays;

public class GestionaVehiculos {

    public static void main(String[] args) {

        Automovil autoEco = new Automovil("Manuel", 4, 1, "ECO");
        Automovil autoC = new Automovil("Manuel", 4, 1, "C");

        System.out.println("Automovil ECO - Madrid: "
                + autoEco.tieneLimitacionParaCircular("Madrid"));
        System.out.println("Automovil ECO - Sevilla: "
                + autoEco.tieneLimitacionParaCircular("Sevilla"));

        System.out.println("Automovil C - Madrid: "
                + autoC.tieneLimitacionParaCircular("Madrid"));
        System.out.println("Automovil C - Sevilla: "
                + autoC.tieneLimitacionParaCircular("Sevilla"));

        System.out.println("-----------------------------------");

        Camion camionLigero = new Camion("Manuel", 2, 1, 500, 2, 2);
        Camion camionMedio = new Camion("Manuel", 2, 1, 5000, 7, 3);

        System.out.println("Camion 500 kg licencias: "
                + Arrays.toString(camionLigero.getLicencias()));

        System.out.println("Camion 5000 kg, 7 pasajeros licencias: "
                + Arrays.toString(camionMedio.getLicencias()));
    }
}
