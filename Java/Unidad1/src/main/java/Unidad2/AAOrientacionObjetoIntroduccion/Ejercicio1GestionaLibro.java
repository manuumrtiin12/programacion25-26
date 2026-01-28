package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio1GestionaLibro {

    public void main(String[] args) {

        Ejercicio1Libro libro1 = new Ejercicio1Libro(
                "9788467045560",
                "Don quijote de la Mancha",
                "Miguel de Cervantes",
                1334);

        System.out.println(libro1.toString());

        libro1.imprimeLibro();
    }
}
