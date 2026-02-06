package Unidad2.AAMiniSimulacionSinHerencia;

public class GestionaCoches {
    public static void main(String[] args) {
        Conductor dueno = new Conductor("Alfonso Machaca", 10);
        Conductor intruso = new Conductor("Pepe Viruela", 1);

        Sensor sensores = new Sensor(100.0, 0.0);
        Coche miCoche = new Coche("Tesla", "Model 3", "1234-ABC", dueno, sensores);

        System.out.println(miCoche.toString());

        miCoche.arrancar(intruso);

        miCoche.arrancar(dueno);
        System.out.println("Estado actual: " + miCoche.getEstado());

        sensores.setDistanciaObstaculo(30.0);
        miCoche.verificarSiDebeParar(sensores);

        System.out.println("Estado tras sensor: " + miCoche.getEstado());
        System.out.println(miCoche.toString());
    }
}