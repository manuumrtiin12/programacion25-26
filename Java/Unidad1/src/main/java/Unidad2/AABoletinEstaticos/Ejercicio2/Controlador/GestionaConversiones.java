package main.java.Unidad2.AABoletinEstaticos.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinEstaticos.Ejercicio2.Modelo.Conversor;

import java.util.Scanner;

public class GestionaConversiones {

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dolares quieres cambiar?");
        double dolares = sc.nextDouble();

        double resultado = Conversor.conversor(dolares);

        System.out.println("El resultado es: " + resultado);
    }
}
