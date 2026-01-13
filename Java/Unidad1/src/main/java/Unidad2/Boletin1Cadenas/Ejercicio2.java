package Unidad2.Boletin1Cadenas;

public class Ejercicio2 {
    public static void main(String[] args) {

        String[] diasSemana = new String[7];

        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sabado";
        diasSemana[6] = "Domingo";

        for (int i = 0; i < diasSemana.length; i++) {

            if (diasSemana[i].equals("Sabado") || diasSemana[i].equals("Domingo")) {
                System.out.println("Festivo " + diasSemana[i]);
            }

            else {System.out.println("Laboral " + diasSemana[i]);}
        }
    }
}
