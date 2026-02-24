package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

public class Ensamblador extends Robot{

    @Override
    public void ejecutaTarea() {

        System.out.println("El robot se encuentra pintando");
    }

    @Override
    public boolean recargar() {

        boolean recarga = false;

        if (getEstado() == EstadoRobot.APAGADO && getCombustible().equals("Gasolina")) {

            recarga = true;
            System.out.println("El robot esta cargando...");
        }

        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }

        return recarga;
    }

    public Ensamblador(int id, int contador, String modelo, int bateria, EstadoRobot estado, String combustible, String descripcion) {
        super(id, contador, modelo, bateria, estado, combustible, descripcion);
    }
}
