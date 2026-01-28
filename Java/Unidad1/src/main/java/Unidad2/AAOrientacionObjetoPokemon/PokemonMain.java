package main.java.Unidad2.AAOrientacionObjetoPokemon;

public class PokemonMain {
    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 100, "Raichu");
        Pokemon chimchar = new Pokemon("Chimchar", "Fuego", 110, "Monferno");

        pikachu.evolucionar();
        chimchar.evolucionar();

        if (chimchar.luchar(chimchar, pikachu) == true) {
            System.out.println(chimchar.nombre + " es el vencedor");
        }

    }
}
