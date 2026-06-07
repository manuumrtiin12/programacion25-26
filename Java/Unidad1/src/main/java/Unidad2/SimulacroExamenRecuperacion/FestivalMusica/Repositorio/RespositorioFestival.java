package main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Repositorio;

import main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Modelo.Actuacion;

import java.util.*;

public class RespositorioFestival {

    private List<Actuacion> actuaciones = new ArrayList<>();

    public void agregarActuacion(Actuacion a) {

        actuaciones.add(a);

    }

    public List<Actuacion> getActuacionesPorEscenario(String escenario) {
        List<Actuacion> resultado = new ArrayList<>();
        for (Actuacion a : actuaciones) {
            if (a.getEscenario().equals(escenario))
                resultado.add(a);
        }
        Collections.sort(resultado, new Comparator<Actuacion>() {
            public int compare(Actuacion o1, Actuacion o2) {
                return o1.getHoraInicio().compareTo(o2.getHoraInicio());
            }
        });

        return resultado;
    }

    public Set<String> getGenerosUnicos() {
        Set<String> generos = new TreeSet<>();
        for (Actuacion a : actuaciones) {
            generos.add(a.getArtistaActuacion().getGeneroMusical());
        }
        return generos;
    }

    public Map<String, Double> getCostePorEscenario() {
        Map<String, Double> costes = new HashMap<>();
        for (Actuacion a : actuaciones) {
            String esc    = a.getEscenario();
            double cache   = a.getArtistaActuacion().getCache();
            costes.put(esc, costes.getOrDefault(esc, 0.0) + cache);
        }
        return costes;
    }

}
