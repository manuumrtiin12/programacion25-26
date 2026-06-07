package main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Modelo;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {

    private String DNI;
    private String nombre;
    private String departamento;
    private int salario;

    public Empleado(String DNI, String nombre, String departamento, int salario) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(DNI, empleado.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Empleado o) {

        int cmp = this.departamento.compareTo(o.departamento);
        if (cmp != 0) return cmp;
        return Double.compare(o.salario, this.salario);
    }

}
