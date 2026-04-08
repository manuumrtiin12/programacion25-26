package main.java.Unidad2.AABoletinClone.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinClone.Ejercicio2.Modelo.Coche;
import main.java.Unidad2.AABoletinClone.Ejercicio2.Modelo.Motor;
import main.java.Unidad2.AABoletinClone.Ejercicio2.Modelo.TipoCombustible;

public class GestionaCoches {

    public void main(String[] args) {


        Motor m1 = new Motor(TipoCombustible.GASOLINA, 100, false);
        Motor m2 = null;

        Coche c1 = new Coche("7784BMY", "Ford Focus", 210000, m1);
        Coche c2 = null;

        try {
            m2 = (Motor) m1.clone();
            c2 = (Coche) c1.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Error al clonar");
        }

        m2.setCombustible(TipoCombustible.DIESEL);
        c2.getMotor().setCv(300);

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
