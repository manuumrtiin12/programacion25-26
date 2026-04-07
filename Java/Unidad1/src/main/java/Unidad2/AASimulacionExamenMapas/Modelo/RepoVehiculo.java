package main.java.Unidad2.AASimulacionExamenMapas.Modelo;

import java.util.*;

public class RepoVehiculo {

    Map<String, List<Vehiculo>> mapaVehiculos = new LinkedHashMap<>();

    public void addVehiculo(Vehiculo vehiculo) {

        List<Vehiculo> lista = new ArrayList<Vehiculo>();

        if (mapaVehiculos.containsKey(vehiculo.getNumeroBastidor())) {

            lista = mapaVehiculos.get(vehiculo.getNumeroBastidor());
            lista.add(vehiculo);
        }

        else {

            List<Vehiculo> listaVacia = new ArrayList<Vehiculo>();
            listaVacia.add(vehiculo);
            mapaVehiculos.put(vehiculo.getNumeroBastidor(), listaVacia);

        }
    }

    public List<Vehiculo> buscarNumeroBastidor(Vehiculo vehiculo) {

        return mapaVehiculos.get(vehiculo.getNumeroBastidor());
    }

    public List<Vehiculo> mostrarVehiculosPorPropietario() {

        

    }
}
