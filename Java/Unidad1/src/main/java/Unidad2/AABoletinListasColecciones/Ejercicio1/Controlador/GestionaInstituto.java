package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Controlador;

import main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo.*;
import main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Exception.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionaInstituto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Instituto instituto = new Instituto(new ArrayList<>());

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. Agregar estudiante a grupo");
            System.out.println("2. Agregar grupo al instituto");
            System.out.println("3. Mostrar estudiantes por grupo");
            System.out.println("4. Mostrar informacion de grupo");
            System.out.println("5. Calcular promedio de estudiante");
            System.out.println("6. Calcular promedio de grupo");
            System.out.println("7. Salir");

            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Descripcion del grupo: ");
                    String descGrupo = sc.nextLine();

                    Grupo grupo = null;
                    int i = 0;

                    while (grupo == null && i < instituto.getGrupos().size()) {

                        if (instituto.getGrupos().get(i).getDescripcion().equalsIgnoreCase(descGrupo)) {
                            grupo = instituto.getGrupos().get(i);
                        }

                        i++;
                    }

                    if (grupo != null) {

                        System.out.print("Nombre estudiante: ");
                        String nombre = sc.nextLine();

                        System.out.print("ID estudiante: ");
                        String id = sc.nextLine();

                        Estudiante estudiante = new Estudiante(nombre, id);

                        System.out.print("Numero de notas: ");
                        int n = sc.nextInt();

                        int j = 0;

                        while (j < n) {

                            System.out.print("Nota: ");
                            double nota = sc.nextDouble();
                            estudiante.agregarNota(nota);

                            j++;
                        }

                        sc.nextLine();

                        grupo.agregarEstudiante(estudiante);
                        System.out.println("Estudiante agregado.");

                    } else {
                        System.out.println("Grupo no encontrado.");
                    }

                    break;

                case 2:

                    System.out.print("ID grupo: ");
                    int idGrupo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Descripcion: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Tutor: ");
                    String tutor = sc.nextLine();

                    System.out.print("Aula: ");
                    String aula = sc.nextLine();

                    Grupo nuevoGrupo = new Grupo(
                            idGrupo,
                            descripcion,
                            tutor,
                            aula,
                            new ArrayList<>(),
                            new Horario()
                    );

                    instituto.agregarGrupo(nuevoGrupo);

                    System.out.println("Grupo agregado.");

                    break;

                case 3:

                    System.out.print("Descripcion del grupo: ");
                    String grupoMostrar = sc.nextLine();

                    instituto.mostrarEstudiantesPorGrupo(grupoMostrar);

                    break;

                case 4:

                    System.out.print("Descripcion del grupo: ");
                    String grupoInfo = sc.nextLine();

                    instituto.mostrarInfoGrupo(grupoInfo);

                    break;

                case 5:

                    try {

                        System.out.print("ID estudiante: ");
                        String idBuscar = sc.nextLine();

                        Estudiante estudiante = null;
                        int iEst = 0;

                        while (estudiante == null && iEst < instituto.getGrupos().size()) {

                            Grupo g = instituto.getGrupos().get(iEst);

                            int jEst = 0;

                            while (estudiante == null && jEst < g.getEstudiantes().size()) {

                                if (g.getEstudiantes().get(jEst).getId().equalsIgnoreCase(idBuscar)) {
                                    estudiante = g.getEstudiantes().get(jEst);
                                }

                                jEst++;
                            }

                            iEst++;
                        }

                        if (estudiante == null) {
                            throw new EstudianteNoEncontradoException("El estudiante no existe.");
                        }

                        System.out.println("Promedio: " + estudiante.calcularPromedio());

                    } catch (EstudianteNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 6:

                    try {

                        System.out.print("Descripcion grupo: ");
                        String desc = sc.nextLine();

                        double promedio = instituto.calcularPromedioGrupo(desc);

                        if (promedio == 0 && instituto.getGrupos().stream()
                                .noneMatch(g -> g.getDescripcion().equalsIgnoreCase(desc))) {

                            throw new GrupoNoEncontradoException("Grupo no encontrado.");
                        }

                        System.out.println("Promedio grupo: " + promedio);

                    } catch (GrupoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 7:

                    System.out.println("Fin del programa.");

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }
        }
    }
}