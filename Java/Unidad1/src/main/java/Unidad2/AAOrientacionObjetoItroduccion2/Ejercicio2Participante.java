package main.java.Unidad2.AAOrientacionObjetoItroduccion2;

public class Ejercicio2Participante {

    String nick;
    String nombre;
    int edad;
    int puntuacion;

    public Ejercicio2Participante(String nick, String nombre, int edad, int puntuacion) {
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nick='" + nick + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
