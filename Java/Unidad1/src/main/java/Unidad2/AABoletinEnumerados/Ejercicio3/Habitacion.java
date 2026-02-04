package main.java.Unidad2.AABoletinEnumerados.Ejercicio3;

public class Habitacion {

    String nombre;
    int tamañoM2;
    int nivelSuciedad;
    EstadoHabitacion estado;

    public Habitacion(String nombre, int tamañoM2, int nivelSuciedad, EstadoHabitacion estado) {
        this.nombre = nombre;
        this.tamañoM2 = tamañoM2;
        this.nivelSuciedad = nivelSuciedad;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", tamañoM2=" + tamañoM2 +
                ", nivelSuciedad=" + nivelSuciedad +
                ", estado=" + estado +
                '}';
    }
}
