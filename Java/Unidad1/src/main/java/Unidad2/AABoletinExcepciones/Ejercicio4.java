package main.java.Unidad2.AABoletinExcepciones;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {

        int contador = 0;
        double[] listaNumeros = new double[20];
        Random random = new Random();

        while (contador <= 20) {
            try {

                double numero1 = random.nextInt(11);
                double numero2 = random.nextInt(11);

                double resultado = numero1 / numero2;

                listaNumeros[contador] = resultado;

                contador++;

            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Intentando guardar en la posición 10");
                contador = 21;

            }

        }

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Numero " + i + ": " + listaNumeros[i]);
        }
    }
}
