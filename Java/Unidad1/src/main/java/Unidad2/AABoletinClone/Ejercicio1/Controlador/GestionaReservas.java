package main.java.Unidad2.AABoletinClone.Ejercicio1;

import main.java.Unidad2.AABoletinClone.Ejercicio1.Modelo.*;

public class GestionaReservas {

    public static void main(String[] args) {

        RepositorioReserva repo = new RepositorioReserva();

        Reserva r1 = new Reserva("Carlos Ruiz", "Roma", "14A", 220);
        Reserva r2 = new Reserva("Carla Ruiz", "Roma", "14B", 220);

        repo.agregaReserva(r1);
        repo.agregaReserva(r2);

        System.out.println("=== LISTA INICIAL ===");
        repo.mostrarReservas();

        Reserva simulacion = repo.cambiarAsiento(2, "3D", false);
        System.out.println("Simulación de cambio de asiento a 3D:");
        System.out.println(simulacion);

        System.out.println("=== LISTA DESPUÉS DE SIMULACIÓN ===");
        repo.mostrarReservas();

        repo.cambiarAsiento(2, "3D", true);

        System.out.println("=== LISTA DESPUÉS DE CONFIRMAR CAMBIO ===");
        repo.mostrarReservas();

        Reserva reservaPrevia = repo.obtenerReserva(1);
        System.out.println("Reserva con ID 1:");
        System.out.println(reservaPrevia);
    }
}