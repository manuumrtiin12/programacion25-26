package main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Modelo;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Exception.DeportivosException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

    private String nombre;
    private List<Alumno> alumnos;

    public void agregarAlumno(Alumno alumno) throws DeportivosException{

        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
        }

        else {
            throw new DeportivosException("El alumno ya esta en la lista");
        }
    }

    public void borrarAlumno(Alumno alumno) {

        if (alumnos.contains(alumno)) {
            alumnos.remove(alumno);
        }

        else {
            throw new DeportivosException("El alumno no esta en la lista");
        }
    }

    public Alumno buscarAlumno(Alumno alumno) {

        Alumno alumnoEncontrado = null;
        int posicion = 0;

        if (alumnos.contains(alumno)) {

            posicion = alumnos.indexOf(alumno);
            alumnoEncontrado = alumnos.get(posicion);
        }

        return alumnoEncontrado;
    }

    public void mostrarAlumnos() {

        for (Alumno a: this.alumnos) {
            System.out.println(a.toString());
        }
    }

    public Equipo unionEquipo(Equipo e) {

        List<Alumno> nuevaLista = new ArrayList<>();
        Equipo nuevoEquipo = new Equipo(this.nombre + "-" + e.nombre, nuevaLista);

        for (Alumno a : this.alumnos) {
            try {
                nuevoEquipo.agregarAlumno(a);
            } catch (DeportivosException ex) {
                System.out.println(ex.getMessage());
            }
        }

        for (Alumno a : e.alumnos) {
            try {
                nuevoEquipo.agregarAlumno(a);
            } catch (DeportivosException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return nuevoEquipo;
    }

    public Equipo interseccionEquipo(Equipo e) {

        List<Alumno> nuevaLista = new ArrayList<>();
        Equipo nuevoEquipo = new Equipo(this.nombre + "-" + e.nombre, nuevaLista);

        for (Alumno a : this.alumnos) {
            if (e.alumnos.contains(a)) {
                try {
                    nuevoEquipo.agregarAlumno(a);
                } catch (DeportivosException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        return nuevoEquipo;
    }

    public Equipo(String nombre, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre) && Objects.equals(alumnos, equipo.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, alumnos);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + getNombre() + '\'' +
                ", alumnos=" + getAlumnos() +
                '}';
    }
}
