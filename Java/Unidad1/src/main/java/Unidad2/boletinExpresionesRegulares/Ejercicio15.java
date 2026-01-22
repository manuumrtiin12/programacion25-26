package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "a_ b_ c_ D_ e_";

        String regex = "[a-z]_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Coincidencia: " + matcher.group());
        }
    }
}
