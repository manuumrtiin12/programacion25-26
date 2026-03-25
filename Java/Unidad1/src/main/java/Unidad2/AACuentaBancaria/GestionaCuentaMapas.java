package main.java.Unidad2.AACuentaBancaria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionaCuentaMapas {

    static void main(String[] args) {


        Map<Persona, Double> map = new HashMap<Persona, Double>();

        Persona p1 = new Persona("77845673A", "Pepe", "Viruela", 20);
        Persona p2 = new Persona("77845673A", "Pepe", "Viruela", 20);
        Persona p3 = new Persona("74845673A", "Antonio", "De Paz", 20);


        map.put(p1, 2d);
        map.put(p2, 32d);
        map.put(p3, 4d);

        System.out.println(map.toString());
        System.out.println(map.size());

        Set<Persona> claves = map.keySet();
        System.out.println(claves);

        Collection<Double> valores = map.values();
        System.out.println(valores);

    }
}
