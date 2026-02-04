package main.java.Unidad2.AABoletinEnumerados.Ejercicio3;

public class GestionaRobots {
    public static void main(String[] args) {

        Habitacion h1 = new Habitacion("Salón", 25, 10, EstadoHabitacion.LIBRE);
        Habitacion h2 = new Habitacion("Cocina", 15, 40, EstadoHabitacion.LIBRE);
        Habitacion h3 = new Habitacion("Dormitorio", 20, 5, EstadoHabitacion.LIBRE);

        Robot r1 = new Robot(1, 0, ModoFuncionamiento.AUTO, 50, null);
        Robot r2 = new Robot(2, 20, ModoFuncionamiento.MANUAL, 100, null);

        System.out.println("ESTADO INICIAL:");
        System.out.println(r1);
        System.out.println(r2);

        r1.asignarHabitacion(h1);

        h2.estado = EstadoHabitacion.BLOQUEADA;
        r1.recargar();
        r1.vaciarDeposito();

        System.out.println("INTENTO ASIGNACIÓN NO AUTO:");
        r2.asignarHabitacion(h3);

        System.out.println("ESTADO FINAL:");
        System.out.println(r1);
        System.out.println(h1);
        System.out.println(h2);
    }
}