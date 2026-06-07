package main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Controlador;

import main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Modelo.Empleado;
import main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Repositorio.RepositorioEmpleados;

public class GestionaEmpleados {
    public static void main(String[] args) {
        RepositorioEmpleados repo = new RepositorioEmpleados();

        repo.agregarEmpleado(new Empleado("11A", "Ana",   "Ventas", 2500));
        repo.agregarEmpleado(new Empleado("22B", "Luis",  "Ventas", 3000));
        repo.agregarEmpleado(new Empleado("33C", "Marta", "IT",     4000));
        repo.agregarEmpleado(new Empleado("44D", "Pedro", "IT",     3500));
        repo.agregarEmpleado(new Empleado("55E", "Sofía", "Ventas", 2800));

        // Intento duplicado — mismo DNI "11A"
        repo.agregarEmpleado(new Empleado("11A", "Otra Ana", "Ventas", 9999));

        // Listar Ventas (debe salir Luis 3000€ primero, Sofía 2800, Ana 2500)
        repo.getEmpleadosPorDepartamento("Ventas")
                .forEach(System.out::println);

        // Salario medio
        repo.getSalarioMedioPorDepartamento()
                .forEach((d, m) -> System.out.println(d + ": " + m));
    }
}