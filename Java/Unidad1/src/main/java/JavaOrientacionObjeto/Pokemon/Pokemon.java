package main.java.JavaOrientacionObjeto.Pokemon;

public class Pokemon {

    String nombre;
    String tipo;
    int vida;
    String evolucion;

    public Pokemon(String nombre, String tipo, int vida, String evoluciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.evolucion = evoluciones;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", evoluciones='" + evolucion + '\'' +
                '}';
    }

    public boolean luchar(Pokemon pokemon1, Pokemon pokemon2) {

        boolean resultado = false;

        if (pokemon1.vida > pokemon2.vida) {
            resultado = true;
        }

        return resultado;
    }

    public void evolucionar() {

        System.out.println(nombre + " esta evolucionando a " + evolucion);
    }
}
