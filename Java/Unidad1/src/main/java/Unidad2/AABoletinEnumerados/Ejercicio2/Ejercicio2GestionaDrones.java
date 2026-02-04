package main.java.Unidad2.AABoletinEnumerados.Ejercicio2;

public class Ejercicio2GestionaDrones {
    public static void main(String[] args) {


        Ejercicio2Ruta ruta1 = new Ejercicio2Ruta("Calle Mayor 1", "Avenida Libertad 10", 2.5);
        Ejercicio2Ruta ruta2 = new Ejercicio2Ruta("Plaza España 5", "Calle Luna 12", 1.2);
        Ejercicio2Ruta ruta3 = new Ejercicio2Ruta("Polígono Ind. 4", "Calle Sol 3", 5.0);


        Ejercicio2Dron dron1 = new Ejercicio2Dron(101, 5000, Ejercicio2Estado.EN_REPOSO, 80, 10, "Ninguna");
        Ejercicio2Dron dron2 = new Ejercicio2Dron(102, 5000, Ejercicio2Estado.EN_REPOSO, 100, 10, "Ninguna");

        System.out.println("--- Estado Inicial ---");
        System.out.println(dron1);
        System.out.println(dron2);

        System.out.println("--- Asignando Rutas ---");
        dron1.asignarRuta(ruta1);
        dron2.asignarRuta(ruta2);

        ruta1.estadoPaquete = Ejercicio2EstadoPaquete.RETRASADO;
        ruta2.estadoPaquete = Ejercicio2EstadoPaquete.CANCELADO;

        System.out.println("Paquete 1: " + ruta1.estadoPaquete);
        System.out.println("Paquete 2: " + ruta2.estadoPaquete);

        System.out.println("--- Intento de asignación a dron ocupado ---");
        dron1.asignarRuta(ruta3);

        System.out.println("--- Prueba de carga de batería ---");
        dron1.cargarBateria();
    }
}