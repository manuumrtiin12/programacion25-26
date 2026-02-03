package Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio3GestionAlumnos {

    public static void main(String[] args) {

        // Crear alumnos
        Ejercicio3Alumno lucia = new Ejercicio3Alumno("Lucía");
        Ejercicio3Alumno andres = new Ejercicio3Alumno("Andrés");
        Ejercicio3Alumno vicente = new Ejercicio3Alumno("Vicente");

        // Crear notas de Lucía
        Ejercicio3Notas progLucia = new Ejercicio3Notas("Programación", 5, 7, 7);
        Ejercicio3Notas bdLucia = new Ejercicio3Notas("Base de Datos", 6, 6, 7);

        // Crear notas de Andrés
        Ejercicio3Notas progAndres = new Ejercicio3Notas("Programación", 4, 4, 6);
        Ejercicio3Notas bdAndres = new Ejercicio3Notas("Base de Datos", 9, 8, 8);

        // Crear notas de Vicente
        Ejercicio3Notas progVicente = new Ejercicio3Notas("Programación", 2, 2, 3);
        Ejercicio3Notas bdVicente = new Ejercicio3Notas("Base de Datos", 6, 6, 7);

        // Asignar notas a los alumnos
        lucia.notaProgramacion = progLucia;
        lucia.notaBaseDatos = bdLucia;

        andres.notaProgramacion = progAndres;
        andres.notaBaseDatos = bdAndres;

        vicente.notaProgramacion = progVicente;
        vicente.notaBaseDatos = bdVicente;

        // Imprimir la nota media de Vicente (Programación)
        System.out.println("Nota media de Vicente en Programación: " +
                vicente.notaProgramacion.notaMedia());

        // Ejecutar imprimeSiHaAprobado
        vicente.imprimeSiHaAprobado(vicente.notaProgramacion);
        lucia.imprimeSiHaAprobado(lucia.notaProgramacion);
    }
}