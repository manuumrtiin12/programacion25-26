package Unidad2.AABoletinHerencias2.Ejercicio1;

public class Personaje {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    // Se sobrescribe en las subclases
    public String getArma() {
        return "";
    }

    // Métodos sobrecargados (se sobrescriben)
    public boolean esAtacado(Personaje atacante) {
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return false;
    }
}
