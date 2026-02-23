package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Controlador;

import main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo.*;
import java.time.LocalDate;

public class GestionaTiendaDeAnimales {

    private Mascotas[] tienda = new Mascotas[10];
    private int numAnimales = 0;

    public static void main(String[] args) {
        GestionaTiendaDeAnimales gestion = new GestionaTiendaDeAnimales();

        Perro perro1 = new Perro("Pequi", 4, "Vivo", LocalDate.of(2020, 6, 1), "Pequinés", true);
        Loro loro1 = new Loro("Marruecos", 3, "Vivo", LocalDate.of(2021, 4, 10), "Corto", true, "Marruecos", true);
        Serpiente serpiente1 = new Serpiente("Slytherin", 2, "Viva", LocalDate.of(2022, 8, 5), 3, 6, 5.5, "Pitón");

        gestion.agregarAnimal(perro1);
        gestion.agregarAnimal(loro1);
        gestion.agregarAnimal(serpiente1);

        System.out.println("---- LISTA DE ANIMALES ----");
        gestion.mostrarListaAnimales();

        System.out.println("\n---- INFORMACIÓN DE UN ANIMAL (OBJETO) ----");
        gestion.mostrarAnimal(perro1);

        System.out.println("\n---- INFORMACIÓN DE UN ANIMAL (POR DATOS) ----");
        gestion.mostrarAnimal("Slytherin", 5.5, "Pitón");

        System.out.println("\n---- ELIMINAR ANIMAL POR OBJETO ----");
        gestion.eliminarAnimal(loro1);
        gestion.mostrarListaAnimales();

        System.out.println("\n---- ELIMINAR ANIMAL POR DATOS ----");
        gestion.eliminarAnimal("Pequi", "Pequinés", 0);
        gestion.mostrarListaAnimales();

        System.out.println("\n---- ANIMAL MÁS PESADO ----");
        Mascotas masPesado = gestion.animalMasPesado();
        if (masPesado != null) {
            masPesado.muestra();
        }
    }

    public void agregarAnimal(Mascotas m) {
        if (numAnimales < tienda.length) {
            tienda[numAnimales] = m;
            numAnimales++;
        }
    }

    public void mostrarListaAnimales() {
        for (int i = 0; i < numAnimales; i++) {
            System.out.println(tienda[i].toString());
        }
    }

    public void mostrarAnimal(Mascotas m) {
        m.muestra();
    }

    public void mostrarAnimal(String nombre, double peso, String especie) {
        for (int i = 0; i < numAnimales; i++) {
            if (tienda[i] instanceof Serpiente) {
                Serpiente s = (Serpiente) tienda[i];
                if (s.getNombre().equals(nombre) && s.getPeso() == peso && s.getEspecie().equals(especie)) {
                    s.muestra();
                }
            }
        }
    }

    public void eliminarAnimal(Mascotas m) {
        for (int i = 0; i < numAnimales; i++) {
            if (tienda[i] == m) {
                for (int j = i; j < numAnimales - 1; j++) {
                    tienda[j] = tienda[j + 1];
                }
                tienda[numAnimales - 1] = null;
                numAnimales--;
                break;
            }
        }
    }

    public void eliminarAnimal(String nombre, String raza, double peso) {
        for (int i = 0; i < numAnimales; i++) {
            if (tienda[i] instanceof Perro) {
                Perro p = (Perro) tienda[i];
                if (p.getNombre().equals(nombre) && p.getRaza().equals(raza)) {
                    eliminarAnimal(p);
                    break;
                }
            }
            if (tienda[i] instanceof Serpiente) {
                Serpiente s = (Serpiente) tienda[i];
                if (s.getNombre().equals(nombre) && s.getEspecie().equals(raza) && s.getPeso() == peso) {
                    eliminarAnimal(s);
                    break;
                }
            }
        }
    }

    public Mascotas animalMasPesado() {
        if (numAnimales == 0) return null;
        Mascotas max = tienda[0];
        double pesoMax = 0;
        for (int i = 0; i < numAnimales; i++) {
            double peso = 0;
            if (tienda[i] instanceof Reptil) {
                peso = ((Reptil) tienda[i]).getPeso();
            } else if (tienda[i] instanceof Perro) {
                peso = 5.0;
            } else if (tienda[i] instanceof Gato) {
                peso = 4.0;
            } else if (tienda[i] instanceof Aves) {
                peso = 1.0;
            }
            if (peso > pesoMax) {
                pesoMax = peso;
                max = tienda[i];
            }
        }
        return max;
    }
}