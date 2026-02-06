package Unidad2.AACuentaBancaria;

public class GestinaCuenta {

    public void main(String[] args) {

        Persona persona1 = new Persona("12345678A", "Pedro", "Sanchez", 1995);
        Persona persona2 = new Persona("12345678A", "Pedro", "Sanchez", 1995);

        System.out.println(persona1 == persona2);

        System.out.println(persona1.equals(persona2));
    }
}
