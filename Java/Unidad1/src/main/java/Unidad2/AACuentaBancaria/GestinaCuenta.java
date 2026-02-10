package Unidad2.AACuentaBancaria;

public class GestinaCuenta {

    public static void main(String[] args) {
        Persona titular = new Persona("12345678A", "Juan", "Pérez", 1990);
        Persona autorizado = new Persona("87654321B", "Maria", "García", 2010); // Menor de edad en 2026

        System.out.println("--- PRUEBAS CLASE PERSONA ---");
        System.out.println("¿Es Juan mayor de edad?: " + titular.esMayorDeEdad());
        System.out.println("¿Es Maria mayor de edad?: " + autorizado.esMayorDeEdad());
        System.out.println(titular.toString());

        CuentaBancaria cuenta = new CuentaBancaria(1000.0, "ES123456789", titular);

        System.out.println("\n--- PRUEBAS CLASE CUENTABANCARIA ---");
        System.out.println("Estado inicial: " + cuenta.toString());

        double ingreso = 500.0;
        if (cuenta.importeEsPositivo(ingreso)) {
            cuenta.ingresarDinero(ingreso);
            System.out.println("Después de ingresar " + ingreso + "€, el saldo es: " + cuenta.getSaldo());
        }

        double retiro = 200.0;
        cuenta.retirarDinero(retiro);
        System.out.println("Después de retirar " + retiro + "€, el saldo es: " + cuenta.getSaldo());

        System.out.println("\n--- GESTIÓN DE AUTORIZADOS ---");
        System.out.println("¿Tiene autorizado inicial?: " + cuenta.validarTieneAutorizado());

        cuenta.setAutorizado(autorizado);
        System.out.println("Autorizado añadido: " + cuenta.getAutorizado().getNombre());
        System.out.println("¿Tiene autorizado ahora?: " + cuenta.validarTieneAutorizado());

        cuenta.eliminarAutorizado();
        System.out.println("Autorizado eliminado. ¿Tiene autorizado?: " + cuenta.validarTieneAutorizado());

        System.out.println("\n--- ESTADO FINAL DE LA CUENTA ---");
        System.out.println(cuenta.toString());
    }
}