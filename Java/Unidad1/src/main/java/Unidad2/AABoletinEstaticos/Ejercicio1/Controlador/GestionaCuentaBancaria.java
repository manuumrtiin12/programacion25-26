package Unidad2.AABoletinEstaticos.Ejercicio1.Controlador;

import Unidad2.AABoletinEstaticos.Ejercicio1.Modelo.CuentaBancaria;
import Unidad2.AABoletinEstaticos.Ejercicio1.Modelo.Cliente;

import java.time.LocalDate;

public class GestionaCuentaBancaria {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana", "García", "12345678A");
        Cliente cliente2 = new Cliente("Luis", "Martínez", "87654321B");
        Cliente cliente3 = new Cliente("Carlos", "López", "11223344C");

        CuentaBancaria c1 = new CuentaBancaria(1000, LocalDate.of(2020, 5, 10), "ES1111111111", cliente1);
        CuentaBancaria c2 = new CuentaBancaria(2000, LocalDate.of(2021, 3, 15), "ES2222222222", cliente2);
        CuentaBancaria c3 = new CuentaBancaria(3000, LocalDate.of(2022, 7, 20), "ES3333333333", cliente3);

        System.out.println("Cuenta 1 ID: " + c1.getId());
        System.out.println("Cuenta 2 ID: " + c2.getId());
        System.out.println("Cuenta 3 ID: " + c3.getId());

        System.out.println("Total cuentas creadas: " + CuentaBancaria.getContador());
    }
}