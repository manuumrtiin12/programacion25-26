package main.java.Unidad2.AASimulacionExamen.Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {

    private String nombreDepartamento;
    private Empleado [] empleadosDepartamento;

    private boolean addEmpleado(Empleado empleado) {

        for (int i = 0; i < empleadosDepartamento.length; i++) {

            if (empleadosDepartamento[i] != null &&
                    empleadosDepartamento[i].equals(empleado)) {

                return false;
            }
        }

        for (int i = 0; i < empleadosDepartamento.length; i++) {

            if (empleadosDepartamento[i] == null) {
                empleadosDepartamento[i] = empleado;
                return true;
            }
        }

        return false;
    }

    private boolean addJefe(JefeDepartamento jefe) {

        for (int i = 0; i < empleadosDepartamento.length; i++) {

            if (empleadosDepartamento[i] != null &&
                    empleadosDepartamento[i].equals(jefe)) {

                return false;
            }
        }

        for (int i = 0; i < empleadosDepartamento.length; i++) {

            if (empleadosDepartamento[i] == null) {
                empleadosDepartamento[i] = jefe;
                return true;
            }
        }

        return false;
    }

    private int obtenerSueldo() {

        int suma = 0;

        for (int i = 0 ; i < empleadosDepartamento.length ; i++) {

            suma += empleadosDepartamento[i].getSueldo();
        }

        return suma;
    }

    @Override
    public String toString() {

        String resultado = "Departamento: " + nombreDepartamento;

        int contador = 0;
        for (int i = 0; i < empleadosDepartamento.length; i++) {
            if (empleadosDepartamento[i] != null) {
                contador++;
            }
        }

        Empleado[] aux = new Empleado[contador];
        int j = 0;

        for (int i = 0; i < empleadosDepartamento.length; i++) {
            if (empleadosDepartamento[i] != null) {
                aux[j] = empleadosDepartamento[i];
                j++;
            }
        }

        for (int i = 0; i < aux.length - 1; i++) {
            for (int k = i + 1; k < aux.length; k++) {
                if (aux[i].getNombre().compareTo(aux[k].getNombre()) > 0) {
                    Empleado temp = aux[i];
                    aux[i] = aux[k];
                    aux[k] = temp;
                }
            }
        }

        for (int i = 0; i < aux.length; i++) {
            resultado += aux[i].toString() + "\n";
        }

        return resultado;
    }


    public String toStringSueldo() {

        String resultado = "Departamento: " + nombreDepartamento + "\n";

        // 1️⃣ Contar empleados reales
        int contador = 0;
        for (int i = 0; i < empleadosDepartamento.length; i++) {
            if (empleadosDepartamento[i] != null) {
                contador++;
            }
        }

        Empleado[] aux = new Empleado[contador];
        int j = 0;

        for (int i = 0; i < empleadosDepartamento.length; i++) {
            if (empleadosDepartamento[i] != null) {
                aux[j] = empleadosDepartamento[i];
                j++;
            }
        }

        for (int i = 0; i < aux.length - 1; i++) {
            for (int k = i + 1; k < aux.length; k++) {

                if (aux[i].getSueldo() < aux[k].getSueldo()) {

                    Empleado temp = aux[i];
                    aux[i] = aux[k];
                    aux[k] = temp;
                }
            }
        }

        for (int i = 0; i < aux.length; i++) {
            resultado += aux[i].toString() + "\n";
        }

        return resultado;
    }

    public Departamento(String nombreDepartamento, Empleado[] empleadosDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.empleadosDepartamento = empleadosDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Empleado[] getEmpleadosDepartamento() {
        return empleadosDepartamento;
    }

    public void setEmpleadosDepartamento(Empleado[] empleadosDepartamento) {
        this.empleadosDepartamento = empleadosDepartamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nombreDepartamento, that.nombreDepartamento) && Objects.deepEquals(empleadosDepartamento, that.empleadosDepartamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDepartamento, Arrays.hashCode(empleadosDepartamento));
    }


}
