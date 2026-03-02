package main.java.Unidad2.AASimulacionExamen.Controlador;

public class EmpleadoException extends Exception {

    public EmpleadoException(String mensaje) {
        super(mensaje);
    }

    public EmpleadoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}