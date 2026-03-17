package main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo.Estudiante;
import main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Modelo.Alumno;
import main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Modelo.Equipo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class GestionaEquipo {

    public static void main(String[] args) {

        /*

        Alumno a1 = new Alumno("Juan", "111A");
        Alumno a2 = new Alumno("Pedro", "222B");
        Alumno a3 = new Alumno("Ana", "333C");
        Alumno a4 = new Alumno("Lucia", "444D");

        List<Alumno> lista1 = new ArrayList<>();
        List<Alumno> lista2 = new ArrayList<>();


        Equipo equipo1 = new Equipo("Equipo1", lista1);
        Equipo equipo2 = new Equipo("Equipo2", lista2);

        equipo1.agregarAlumno(a1);
        equipo1.agregarAlumno(a2);
        equipo1.agregarAlumno(a3);

        equipo2.agregarAlumno(a3);
        equipo2.agregarAlumno(a4);
        equipo2.agregarAlumno(a1);

        System.out.println("Alumnos del Equipo 1:");
        equipo1.mostrarAlumnos();

        System.out.println("Alumnos del Equipo 2:");
        equipo2.mostrarAlumnos();

        Equipo union = equipo1.unionEquipo(equipo2);
        System.out.println("Union de equipos:");
        union.mostrarAlumnos();

        Equipo interseccion = equipo1.interseccionEquipo(equipo2);
        System.out.println("Interseccion de equipos:");
        interseccion.mostrarAlumnos();

         */

        Alumno a1 = new Alumno("Juan", "111A");
        Alumno a2 = new Alumno("Pedro", "222B");
        Alumno a3 = new Alumno("Ana", "333C");

        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);

        Collections.sort(listaAlumnos);

        for (Alumno e : listaAlumnos) {
            System.out.println(e);
        } 
    }
}