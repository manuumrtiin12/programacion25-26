package main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Repositorio;

import main.java.Unidad2.SimulacroExamenRecuperacion.GestionEmpleados.Modelo.Empleado;

import java.util.*;

public class RepositorioEmpleados {

    // Map<departamento, conjunto de empleados de ese dpto>
    private Map<String, Set<Empleado>> empleados = new HashMap<>();

    public void agregarEmpleado(Empleado e) {
        String dpto = e.getDepartamento();
        if (!empleados.containsKey(dpto)) {
            empleados.put(dpto, new HashSet<>());
        }
        empleados.get(dpto).add(e); // ignorará duplicados por DNI
    }

    public List<Empleado> getEmpleadosPorDepartamento(String dpto) {
        if (!empleados.containsKey(dpto))
            return new ArrayList<>();

        List<Empleado> lista = new ArrayList<>(empleados.get(dpto));
        Collections.sort(lista); // usa compareTo de Empleado
        return lista;
    }

    public Map<String, Double> getSalarioMedioPorDepartamento() {
        Map<String, Double> medias = new HashMap<>();
        for (Map.Entry<String, Set<Empleado>> entry : empleados.entrySet()) {
            double suma = 0;
            for (Empleado e : entry.getValue())
                suma += e.getSalario();
            medias.put(entry.getKey(), suma / entry.getValue().size());
        }
        return medias;
    }
}