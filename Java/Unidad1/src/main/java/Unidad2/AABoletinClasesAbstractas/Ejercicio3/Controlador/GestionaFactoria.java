package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Controlador;

import main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo.*;

public class GestionaFactoria {

    private Robot[] inventarioRobots = new Robot[20];
    private int contador = 0;

    public void agregarRobot(Robot robot) {
        if (contador < inventarioRobots.length) {
            inventarioRobots[contador] = robot;
            contador++;
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public static void main(String[] args) {

        GestionaFactoria factoria = new GestionaFactoria();

        Soldador soldador = new Soldador(1, 0, "S-100", 50, EstadoRobot.APAGADO, "Electricidad", "Robot de soldadura", 1500, "Uso obligatorio de gafas");
        Pintor pintor = new Pintor(2, 0, "P-200", 8, EstadoRobot.ENCENDIDO, "Electricidad", "Robot de pintura");
        Ensamblador ensamblador = new Ensamblador(3, 0, "E-300", 30, EstadoRobot.APAGADO, "Gasolina", "Robot de ensamblaje");

        soldador.ejecutaTarea();
        soldador.recargar();

        pintor.ejecutaTarea();
        pintor.recargar();

        ensamblador.ejecutaTarea();
        ensamblador.recargar();

        factoria.agregarRobot(soldador);
        factoria.agregarRobot(pintor);
        factoria.agregarRobot(ensamblador);

        for (int i = 0; i < factoria.contador; i++) {
            System.out.println(factoria.inventarioRobots[i]);
        }
    }
}