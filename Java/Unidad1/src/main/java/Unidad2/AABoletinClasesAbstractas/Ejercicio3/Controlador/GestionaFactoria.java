package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Controlador;

import main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo.*;
import java.time.LocalDate;

public class GestionaFactoria {

    private Robot[] inventarioRobots = new Robot[20];
    private int contadorRobots = 0;

    private DispositivoWifi[] inventarioDispositivos = new DispositivoWifi[40];
    private int contadorDispositivos = 0;

    public void agregarRobot(Robot robot) {
        if (contadorRobots < inventarioRobots.length) {
            inventarioRobots[contadorRobots++] = robot;
        } else {
            System.out.println("Inventario de robots lleno");
        }
    }

    public void agregarDispositivo(DispositivoWifi dispositivo) {
        if (contadorDispositivos < inventarioDispositivos.length) {
            inventarioDispositivos[contadorDispositivos++] = dispositivo;
        } else {
            System.out.println("Inventario de dispositivos lleno");
        }
    }

    public static void main(String[] args) {

        GestionaFactoria factoria = new GestionaFactoria();

        Soldador soldador = new Soldador(1, 0, "S-100", 50, EstadoRobot.APAGADO, "Electricidad", "Robot de soldadura", 1500, "Uso obligatorio de gafas");
        Pintor pintor = new Pintor(2, 0, "P-200", 8, EstadoRobot.ENCENDIDO, "Electricidad", "Robot de pintura");
        Ensamblador ensamblador = new Ensamblador(3, 0, "E-300", 30, EstadoRobot.APAGADO, "Gasolina", "Robot de ensamblaje");
        SensorTemperatura sensor = new SensorTemperatura(1, "AA:BB:CC:DD:01", EstadoDispositivo.ON_SINWIFI, LocalDate.now().minusMonths(4), 23.5);
        CamaraSeguridad camara = new CamaraSeguridad(2, "AA:BB:CC:DD:02", EstadoDispositivo.ON_SINWIFI, LocalDate.now().minusWeeks(3));
        PuertaAutomatica puerta = new PuertaAutomatica(3, "AA:BB:CC:DD:03", EstadoDispositivo.ON_SINWIFI, LocalDate.now().minusMonths(2));

        soldador.ejecutaTarea();
        soldador.recargar();
        pintor.ejecutaTarea();
        pintor.recargar();
        ensamblador.ejecutaTarea();
        ensamblador.recargar();

        sensor.conectarInternet();
        camara.conectarInternet();
        puerta.conectarInternet();

        factoria.agregarRobot(soldador);
        factoria.agregarRobot(pintor);
        factoria.agregarRobot(ensamblador);

        factoria.agregarDispositivo(sensor);
        factoria.agregarDispositivo(camara);
        factoria.agregarDispositivo(puerta);

        for (int i = 0; i < factoria.contadorRobots; i++) {
            System.out.println(factoria.inventarioRobots[i]);
        }

        for (int i = 0; i < factoria.contadorDispositivos; i++) {
            System.out.println(factoria.inventarioDispositivos[i]);
        }
    }
}