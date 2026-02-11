package main.java.Unidad2.AABoletinHerencias2.Ejercicio1;

public class GestionaJuego {

    public static void main(String[] args) {

        // Crear personajes
        Villano villano = new Villano("Villano Malvado", 5, 200);
        Caballero caballero = new Caballero("Sir Caballero", 10, 150);
        Arquero arquero = new Arquero("Robin", 8, 120);
        Mago mago = new Mago("Gandalf", 12, 100);

        // Mostrar armas
        System.out.println("=== Armas de los personajes ===");
        System.out.println(villano.getNombre() + " usa: " + villano.getArma());
        System.out.println(caballero.getNombre() + " usa: " + caballero.getArma());
        System.out.println(arquero.getNombre() + " usa: " + arquero.getArma());
        System.out.println(mago.getNombre() + " usa: " + mago.getArma());

        System.out.println("\n=== Pruebas de ataque SIN distancia ===");
        // Villano atacado por todos
        System.out.println("Villano atacado por Caballero: " + villano.esAtacado(caballero));
        System.out.println("Villano atacado por Arquero: " + villano.esAtacado(arquero));
        System.out.println("Villano atacado por Mago: " + villano.esAtacado(mago));

        // Caballero atacado por todos
        System.out.println("Caballero atacado por Arquero: " + caballero.esAtacado(arquero));
        System.out.println("Caballero atacado por Mago: " + caballero.esAtacado(mago));

        // Arquero atacado por todos
        System.out.println("Arquero atacado por Caballero: " + arquero.esAtacado(caballero));
        System.out.println("Arquero atacado por Mago: " + arquero.esAtacado(mago));

        // Mago atacado por todos
        System.out.println("Mago atacado por Caballero: " + mago.esAtacado(caballero));
        System.out.println("Mago atacado por Arquero: " + mago.esAtacado(arquero));
        System.out.println("Mago atacado por Villano: " + mago.esAtacado(villano));

        System.out.println("\n=== Pruebas de ataque CON distancia ===");
        int distancia1 = 30;   // distancia corta
        int distancia2 = 120;  // distancia larga

        // Caballero atacando Arquero
        System.out.println("Arquero atacado por Caballero a 30 mts: " + arquero.esAtacado(caballero, distancia1));
        System.out.println("Arquero atacado por Caballero a 120 mts: " + arquero.esAtacado(caballero, distancia2));

        // Arquero atacando Caballero
        System.out.println("Caballero atacado por Arquero a 30 mts: " + caballero.esAtacado(arquero, distancia1));
        System.out.println("Caballero atacado por Arquero a 120 mts: " + caballero.esAtacado(arquero, distancia2));
    }
}

