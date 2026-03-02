package main.java.Unidad2.AASimulacionExamen.Modelo;

public class Contable extends Empleado{

    @Override
    public void ActualizarSueldo(int porcentaje) {

        if (porcentaje >= 0 && porcentaje <= 20){
            int plus = (getSueldo() * porcentaje) / 100;
            setSueldo(getSueldo() + plus);

        }

        else {
            System.out.println("Porcentaje fueera de rango");
        }
    }

    public Contable(String dni, String nombre, int sueldo) {
        super(dni, nombre, sueldo = 1350);
    }
}
