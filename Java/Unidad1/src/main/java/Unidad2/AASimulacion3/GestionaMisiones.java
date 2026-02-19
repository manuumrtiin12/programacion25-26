package Unidad2.AASimulacion3;

import java.time.LocalDate;

public class GestionaMisiones {

    public void main(String[] args) {

        Nave nave1 = new Nave("N1", "Falcon", 1200);
        Nave nave2 = new Nave("N2", "Orion", 800);

        MisionExploracion exploracion1 = new MisionExploracion("M1", "Ares", LocalDate.now().plusDays(7), "Falcon", EstadoMision.PLANIFICADA);
        exploracion1.setDestino("marte");
        exploracion1.setTamañoTripulacion(6);

        MisionExploracion exploracion2 = new MisionExploracion("M2", "LunaX", LocalDate.now().plusDays(20), "Orion", EstadoMision.PLANIFICADA);
        exploracion2.setDestino("luna");
        exploracion2.setTamañoTripulacion(3);

        MisionLogistica logistica1 = new MisionLogistica("M3", "CargoAlpha", LocalDate.now().plusDays(3), "Falcon", EstadoMision.PLANIFICADA, 60);
        MisionLogistica logistica2 = new MisionLogistica("M4", "CargoBeta", LocalDate.now().plusDays(10), "Orion", EstadoMision.PLANIFICADA, 30);

        System.out.println(exploracion1);
        System.out.println("Riesgo: " + exploracion1.misionDeRiesgo());
        System.out.println("Fecha válida: " + exploracion1.verificaFecha());

        System.out.println(exploracion2);
        System.out.println("Riesgo: " + exploracion2.misionDeRiesgo());
        System.out.println("Fecha válida: " + exploracion2.verificaFecha());

        System.out.println(logistica1);
        System.out.println("Riesgo: " + logistica1.misionDeRiesgo());
        System.out.println("Fecha válida: " + logistica1.verificaFecha());

        System.out.println(logistica2);
        System.out.println("Riesgo: " + logistica2.misionDeRiesgo());
        System.out.println("Fecha válida: " + logistica2.verificaFecha());
    }
}
