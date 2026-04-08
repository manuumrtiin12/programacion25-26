package main.java.Unidad2.AASimulacionExamenMapas.Controlador;

import main.java.Unidad2.AASimulacionExamenMapas.Modelo.Vehiculo;
import main.java.Unidad2.AASimulacionExamenMapas.Modelo.RepoVehiculo;

import java.time.LocalDate;
import java.util.List;

public class GestionaRematriculaciones {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo(
                "1HGCM82633A123456",
                "1234ABC",
                "Toyota",
                "Corolla",
                LocalDate.of(2018, 5, 10),
                "Juan Pérez"
        );

        Vehiculo v2 = new Vehiculo(
                "2HGCM82633A654321",
                "5678DEF",
                "Ford",
                "Focus",
                LocalDate.of(2020, 3, 22),
                "María López"
        );

        Vehiculo v3 = new Vehiculo(
                "1HGCM82633A123456",
                "9012GHI",
                "Volkswagen",
                "Golf",
                LocalDate.of(2017, 11, 5),
                "Carlos Ruiz"
        );

        Vehiculo v4 = new Vehiculo(
                "4HGCM82633A456789",
                "3456JKL",
                "BMW",
                "Serie 3",
                LocalDate.of(2021, 7, 18),
                "Ana García"
        );

        RepoVehiculo repo = new RepoVehiculo();

        repo.addVehiculo(v1);
        repo.addVehiculo(v2);
        repo.addVehiculo(v3);
        repo.addVehiculo(v4);

        System.out.println("=== Buscar por número de bastidor ===");
        List<Vehiculo> listaBastidor = repo.buscarNumeroBastidor(v1);
        for (Vehiculo v : listaBastidor) {
            System.out.println(v);
        }

        System.out.println("=== Vehículos de Juan Pérez ordenados por matrícula ===");
        List<Vehiculo> listaPropietario = repo.mostrarVehiculosPorPropietario("Juan Pérez");
        for (Vehiculo v : listaPropietario) {
            System.out.println(v);
        }

        System.out.println("=== Rematriculaciones del bastidor 1HGCM82633A123456 ===");
        List<Vehiculo> rematriculaciones = repo.mostrarRematriculacionesPorVehiculo("1HGCM82633A123456");
        for (Vehiculo v : rematriculaciones) {
            System.out.println(v);
        }
    }
}