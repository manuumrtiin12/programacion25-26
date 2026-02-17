package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

public class GestionaAstros {

    public static void main(String[] args) {

        Planeta tierra = new Planeta("Tierra", 5.97e24, 12742, 24, 8760, 149.6e6, 1);
        Planeta marte = new Planeta("Marte", 6.39e23, 6779, 24.6, 16488, 227.9e6, 2);

        Satelite luna = new Satelite("Luna", 7.35e22, 3474, 655, 655, 384400, tierra);
        Satelite fobos = new Satelite("Fobos", 1.07e16, 22, 7.6, 7.6, 9376, marte);
        Satelite deimos = new Satelite("Deimos", 1.48e15, 12, 30.3, 30.3, 23460, marte);

        tierra.setSatelite(luna, 0);
        marte.setSatelite(fobos, 0);
        marte.setSatelite(deimos, 1);

        Astro[] sistemaSolar = new Astro[5];
        sistemaSolar[0] = tierra;
        sistemaSolar[1] = marte;
        sistemaSolar[2] = luna;
        sistemaSolar[3] = fobos;
        sistemaSolar[4] = deimos;

        for (Astro astro : sistemaSolar) {
            System.out.println("---------------");
            astro.muestraInformacion();
        }

        System.out.println("---------------");
        System.out.println("¿Tierra es igual a Marte? " + tierra.equals(marte));
    }
}
