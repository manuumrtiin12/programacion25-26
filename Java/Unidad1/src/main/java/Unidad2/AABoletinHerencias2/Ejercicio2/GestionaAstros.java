package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

public class GestionaAstros {

    public static void main(String[] args) {

        Planeta tierra = new Planeta(
                "Tierra",
                5.97e24,
                12742,
                24,
                8760,
                149600000
        );

        Planeta marte = new Planeta(
                "Marte",
                6.39e23,
                6779,
                24.6,
                16488,
                227900000
        );

        Satelite luna = new Satelite(
                "Luna",
                7.35e22,
                3474,
                655,
                655,
                384400,
                tierra
        );

        Satelite phobos = new Satelite(
                "Fobos",
                1.06e16,
                22.2,
                7.6,
                7.6,
                9376,
                marte
        );

        tierra.getSatelites().add(luna);
        marte.getSatelites().add(phobos);

        System.out.println(tierra);
        System.out.println(luna);

        tierra.muestraInformacion(tierra);
        luna.muestraInformacion(luna);

        Planeta tierraCopia = new Planeta(
                "Tierra",
                5.97e24,
                12742,
                24,
                8760,
                149600000
        );

        System.out.println(tierra.equals(tierraCopia));
        System.out.println(tierra.equals(marte));

        for (Satelite s : tierra.getSatelites()) {
            System.out.println(s);
        }
    }
}
