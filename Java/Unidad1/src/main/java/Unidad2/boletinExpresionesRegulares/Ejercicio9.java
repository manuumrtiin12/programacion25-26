package Unidad2.boletinExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {

    public static void main(String[] args) {

        String texto = "En caso de incidencias técnicas urgentes, el correo adecuado es soporte.tecnico@empresa.com, adjuntando capturas de pantalla si es posible. "
                + "Para propuestas comerciales o alianzas estratégicas, las comunicaciones deben enviarse a negocios@empresa.com. "
                + "o, alternativamente, a alianzas@partner.org. "
                + "Finalmente, si necesitas hablar directamente con recursos humanos, puedes escribir a rrhh@empresa.com, indicando en el asunto el motivo de tu mensaje.";

        Pattern patron = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}");
        Matcher matcher = patron.matcher(texto);

        String[] emails = new String[10];
        int contador = 0;

        while (matcher.find()) {
            emails[contador] = matcher.group();
            contador++;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(emails[i]);
        }
    }
}
