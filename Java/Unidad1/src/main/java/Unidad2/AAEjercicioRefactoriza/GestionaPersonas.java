package main.java.Unidad2.AAEjercicioRefactoriza;

public class GestionaPersonas {
    static void main(String[] args) {

        PersonaRefactoriza p = new PersonaRefactoriza("Maria");

        Empleado e = new Empleado("Pepe");

        Cliente c = new Cliente("Alfonso");

        Estudiante es = new Estudiante("Marcos");

        EstudianteEmpleado ee = new EstudianteEmpleado("Carme");

        Artista a = new Artista("Pablo");

        PersonaRefactoriza[] personas = new PersonaRefactoriza[10];
        personas[0] = p;
        personas[1] = e;
        personas[2] = c;
        personas[3] = es;
        personas[4] = ee;
        personas[5] = a;

        e.trabajar();
        e.identificarse();
        System.out.println(" ");

        c.comprar();
        c.identificarse();
        System.out.println(" ");

        es.estudiar();
        es.identificarse();
        System.out.println(" ");

        ee.trabajar();
        ee.estudiar();
        ee.identificarse();
        System.out.println(" ");

        a.pintar();
        a.identificarse();
        System.out.println(" ");

        for (int i = 0; i < personas.length ; i++) {

            if (personas[i] != null) {
            System.out.println(personas[i].nombre);

            }
        }

        for (int i = 0; i < personas.length ; i++) {

            if (personas[i] != null) {
                personas[i].identificarse();
            }
        }
    }
}
