package Unidad2;

import java.util.Scanner;

public class PruebasTransparencia {
    static void main(String[] args) {

        float y = 4.00F;
        float x = 3.00F;
        float resultado = y/x - y*x;

        System.out.println("El resultado es " + resultado);

        //

        float numero = 3.12123F;
        double decimalGrande = numero; //Casting Implicito por que NO pierde informacion
        numero = (float) decimalGrande;
        int entero = (int) numero; //Casting explicito ya que estamos conviertiendo algo mas grande en mas pequeño
                                    // y no cabe

        Scanner escaner = new Scanner(System.in);
        String cadena = escaner.next(); //Para un string

        System.out.println(cadena);


      }
}
