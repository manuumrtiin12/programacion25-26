package main.java.Unidad2.AASimulacionExamen.Modelo;

import java.util.Objects;

public class JefeDepartamento extends Empleado {

    private int anyosAntiguedad;

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

    public JefeDepartamento(String dni, String nombre, int sueldo) {
        super(dni, nombre, sueldo);
    }

    public int getAnyosAntiguedad() {
        return anyosAntiguedad;
    }

    public void setAnyosAntiguedad(int anyosAntiguedad) {
        this.anyosAntiguedad = anyosAntiguedad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JefeDepartamento that = (JefeDepartamento) o;
        return anyosAntiguedad == that.anyosAntiguedad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), anyosAntiguedad);
    }

    @Override
    public String toString() {
        return "JefeDepartamento{" +
                "anyosAntiguedad=" + anyosAntiguedad +
                '}';
    }


}
