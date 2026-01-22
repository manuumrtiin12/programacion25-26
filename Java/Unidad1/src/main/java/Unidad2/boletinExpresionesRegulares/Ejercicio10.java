package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio10 {
    public static void main(String[] args) {

        String texto =
                        "El proyecto dio inicio oficialmente el 15/03/2024, tras la aprobación del " +
                        "presupuesto el 28/02/2024. Durante la primera fase, que se extendió" +
                        " hasta el 30/04/2024, se realizaron los análisis técnicos iniciales. " +
                        "La segunda etapa comenzó el 05/05/2024 y finalizó el 20/07/2024, fecha en " +
                        "la que se entregó el primer informe de resultados. Posteriormente, el 01/08/2024, " +
                        "se llevó a cabo la reunión de revisión con el cliente, acordando los ajustes que debían " +
                        "implementarse antes del 15/09/2024. Finalmente, el cierre del proyecto quedó programado para el " +
                        "31/10/2024, con una evaluación final prevista el 10/11/2024.";

        Pattern patron = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}");
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

}
