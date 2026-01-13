package Unidad2.Boletin1Cadenas;

public class Ejercicio1 {
    public static void main(String[] args) {

        String[] diasSemana = new String[7];

        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miércoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
    }
}
