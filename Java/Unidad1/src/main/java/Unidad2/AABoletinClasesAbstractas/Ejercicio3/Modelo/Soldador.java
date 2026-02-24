package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

public class Soldador extends Robot{

    private int temperaturaTrabajo;
    private String especificacionesSeguridad;

    @Override
    public void ejecutaTarea() {
        System.out.println("Realizando la soldadura de precision");

    }

    @Override
    public boolean recargar() {

        boolean recarga = false;

        if (getEstado() == EstadoRobot.APAGADO && getCombustible().equals("Electricidad")) {

            recarga = true;
            System.out.println("El robot esta cargando...");

        }

        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }

        return recarga;
    }

    //CONSTRUCTOR
    public Soldador(int id, int contador, String modelo, int bateria, EstadoRobot estado, String combustible, String descripcion, int temperaturaTrabajo, String especificacionesSeguridad) {
        super(id, contador, modelo, bateria, estado, combustible, descripcion);
        this.temperaturaTrabajo = temperaturaTrabajo;
        this.especificacionesSeguridad = especificacionesSeguridad;
    }
}
