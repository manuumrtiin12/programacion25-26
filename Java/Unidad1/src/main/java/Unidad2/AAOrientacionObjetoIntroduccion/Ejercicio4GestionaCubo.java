package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio4GestionaCubo {
    public void main(String[] args) {

        Ejercicio4Cubo c = new Ejercicio4Cubo(4,1);

        double area = c.calcularArea();
        double volumen = c.calcularVolumen();

        System.out.println("Area: " + area + " Volumen: " + volumen);

        System.out.println("Litros actuales: " + c.litrosActuales);
        c.rellenar(6);
        System.out.println("Litros actuales: " + c.litrosActuales);
        c.vaciar(4);
        System.out.println("Litros actuales: " + c.litrosActuales);
        c.vaciar(4);
        System.out.println("Litros actuales: " + c.litrosActuales);
        c.rellenar(16);
        System.out.println("Litros actuales: " + c.litrosActuales);

    }
}
