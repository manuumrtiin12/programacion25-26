package Unidad2.Pruebas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpresionesRegulares {
    public void main(String[] args) {

        String frase = "hoy es 12/02/2025";
        String patron = "\\d{2}/\\d{2}/\\d{4}";

        if (frase.matches(patron)) {
            System.out.println("Contiene formato fecha");
        }

        String literalMonthRegexp = "\\d{1,2}/(?i)(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/\\d{4}";

        // Lo siguiente devuelve true
        System.out.println(Pattern.matches(literalMonthRegexp, "11/dic/2014"));

        // Los siguientes devuelven false
        System.out.println(Pattern.matches(literalMonthRegexp, "11/abc/2014"));       // abc no es un mes



        //validacion caso DNI
        String dni = "12345678W";
        String patron1 = "\\d{8}[a-zA-Z]";

        if (dni.matches(patron1)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }



        //validacion caso matriculas de coches
        String matricula = "Hola mi matricula es: 7784BMY";
        String patron2 = ".*\\d{4}[A-Z]{3}"; // .* es para que por delante lleve lo que quiera

        if (matricula.matches(patron2)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }



        //valida caso correo electronico
        String correo = "mmanumartin22@gmail.com";
        String patron3 = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$"; // .* es para que por delante lleve lo que quiera

        if (correo.matches(patron3)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }

    }
}
