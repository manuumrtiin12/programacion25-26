package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio4GestionaCubo {

    public static void main(String[] args) {

        Ejercicio4Cubo cubo = new Ejercicio4Cubo(4);

        System.out.println("Área del cubo: " + cubo.calcularArea());
        System.out.println("Volumen del cubo: " + cubo.calcularVolumen());

        System.out.println("Rellenar 6 litros: " + cubo.rellenar(6));
        System.out.println("Vaciar 4 litros: " + cubo.vaciar(4));
        System.out.println("Vaciar 3 litros: " + cubo.vaciar(3));
        System.out.println("Rellenar 16 litros: " + cubo.rellenar(16));

        System.out.println(cubo);
    }
}
