package main.java.Unidad2.AASimulacionExamen.Modelo;

public class Administrativo extends Empleado{

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

    public Administrativo(String dni, String nombre, int sueldo) {
        super(dni, nombre, sueldo = 1150);
    }

}
