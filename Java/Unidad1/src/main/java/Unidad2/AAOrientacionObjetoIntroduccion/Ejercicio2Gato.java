package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

import java.util.Scanner;

public class Ejercicio2Gato {

    String color;
    String raza;
    char sexo;
    int edad;
    int peso;

    // Constructor
    public Ejercicio2Gato(String color, String raza, char sexo, int edad, int peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public void queHace(Scanner sc) {
        System.out.print("Que hace el gato?: ");
        String accion = sc.nextLine().toLowerCase();

        if (accion.equals("maulla")) {
            System.out.println("miauuuuuu");
        } else if (accion.equals("ronronea")) {
            System.out.println("rrrrrr");
        } else {
            System.out.println("El gato te mira con desprecio");
        }
    }

    public void come(Scanner sc) {
        System.out.print("Que come el gato?: ");
        String comida = sc.nextLine().toLowerCase();

        if (comida.equals("pescado")) {
            System.out.println("Yummy Yummy");
        } else {
            System.out.println("Buahhh, mejor no");
        }
    }

    public void pelear(Ejercicio2Gato otroGato) {
        if (this.sexo == otroGato.sexo) {
            System.out.println("Ven aqui que te vas a enterar");
        } else {
            System.out.println("La violencia nunca es la solucion");
        }
    }

    @Override
    public String toString() {
        return "Ejercicio2Gato{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}