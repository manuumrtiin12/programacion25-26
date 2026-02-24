package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

public class Pintor extends Robot{

    @Override
    public void ejecutaTarea() {

        System.out.println("El robot se encuentra pintando");
    }

    @Override
    public boolean recargar() {

        boolean recarga = false;

        if (getEstado() == EstadoRobot.ENCENDIDO || getEstado() == EstadoRobot.APAGADO && getCombustible().equals("Electricidad")) {

            recarga = true;
            System.out.println("El robot esta cargando...");

        }

        return recarga;
    }

    public Pintor(int id, int contador, String modelo, int bateria, EstadoRobot estado, String combustible, String descripcion) {
        super(id, contador, modelo, bateria, estado, combustible, descripcion);
    }
}
