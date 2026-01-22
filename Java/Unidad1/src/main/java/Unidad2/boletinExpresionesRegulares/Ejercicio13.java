package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.regex.Pattern;

public class Ejercicio13 {

    // DNI: 8 números y una letra
    public static boolean validarDNI(String dni) {
        String regex = "^\\d{8}[A-Za-z]$";
        return Pattern.matches(regex, dni);
    }

    // FEC: fecha formato dd/mm/aaaa
    public static boolean validarFecha(String fecha) {
        String regex = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return Pattern.matches(regex, fecha);
    }

    // MAT: matrícula 0000XXX
    public static boolean validarMatricula(String matricula) {
        String regex = "^\\d{4}[A-Z]{3}$";
        return Pattern.matches(regex, matricula);
    }

    // NOM: nombre simple o compuesto (solo letras y espacios)
    public static boolean validarNombre(String nombre) {
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        return Pattern.matches(regex, nombre);
    }

    // Pruebas
    public static void main(String[] args) {
        System.out.println(validarDNI("12345678A"));        // true
        System.out.println(validarFecha("10/01/2025"));     // true
        System.out.println(validarMatricula("1234ABC"));   // true
        System.out.println(validarNombre("Juan Carlos"));  // true
    }
}
