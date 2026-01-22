package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        // Regex: palabra que empieza por vocal (mayúscula o minúscula)
        String regex = "\\b[aeiouAEIOUáéíóúÁÉÍÓÚ]\\w*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(frase);

        int contador = 0;
        while (matcher.find()) {
            contador++;
        }

        System.out.println("Palabras que empiezan por vocal: " + contador);
    }
}
