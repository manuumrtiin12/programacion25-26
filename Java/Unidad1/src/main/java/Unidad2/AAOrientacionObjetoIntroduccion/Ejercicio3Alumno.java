package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio3Alumno {

     String nombre;
     String apellidos;
     String email;
     Ejercicio3Notas notaProgramacion;
     Ejercicio3Notas notaBaseDatos;

    public void imprimeSiHaAprobado(Ejercicio3Notas asignatura) {
        if (asignatura.notaMedia() >= 5) {
            System.out.println("El alumno " + nombre +
                    " ha aprobado la asignatura " + asignatura.nombreAsignatura);
        } else {
            System.out.println("El alumno " + nombre +
                    " NO ha aprobado la asignatura " + asignatura.nombreAsignatura);
        }
    }



    public Ejercicio3Alumno(String nombre) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ejercicio3Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", programacion=" + notaProgramacion +
                ", baseDatos=" + notaBaseDatos +
                '}';
    }
}
