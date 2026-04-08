package main.java.Unidad2.AASimulacionExamenMapas.Modelo;

import java.util.*;

public class RepoVehiculo{

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

<<<<<<< HEAD
    //public List<Vehiculo> mostrarVehiculosPorPropietario() {}



}
=======
    public List<Vehiculo> mostrarVehiculosPorPropietario(String propietario) {

        List<Vehiculo> resultado = new ArrayList<>();

        for (List<Vehiculo> lista : mapaVehiculos.values()) {

            for (Vehiculo v : lista) {

                if (v.getPropietarioActual().equals(propietario)) {
                    resultado.add(v);
                }
            }
        }

        Collections.sort(resultado, new Comparator<Vehiculo>() {
            public int compare(Vehiculo v1, Vehiculo v2) {
                return v1.getNumeroMatricula().compareTo(v2.getNumeroMatricula());
            }
        });

        return resultado;
    }

    public List<Vehiculo> mostrarRematriculacionesPorVehiculo(String numeroBastidor) {

        List<Vehiculo> lista = mapaVehiculos.get(numeroBastidor);

        if (lista == null) {
            return new ArrayList<>();
        }

        List<Vehiculo> resultado = new ArrayList<>(lista);

        Collections.sort(resultado, new Comparator<Vehiculo>() {
            public int compare(Vehiculo v1, Vehiculo v2) {
                return v1.getFechaMatriculacion().compareTo(v2.getFechaMatriculacion());
            }
        });

        return resultado;
    }}
>>>>>>> 87dbe9b6d6bb25990deace1d055f418b52ab1d98
