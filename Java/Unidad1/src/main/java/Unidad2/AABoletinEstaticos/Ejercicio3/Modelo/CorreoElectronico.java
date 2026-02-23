package main.java.Unidad2.AABoletinEstaticos.Ejercicio3.Modelo;

public class CorreoElectronico {

    private String nombre;
    private String dominio;

    public CorreoElectronico(String correo) {
        int arroba = correo.indexOf("@");
        nombre = correo.substring(0, arroba);
        dominio = correo.substring(arroba + 1);
    }

    public static boolean esCorreoValido(String correo) {
        boolean valido = false;

        if (correo != null) {
            String regex = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
            valido = correo.matches(regex);
        }

        return valido;
    }

    @Override
    public String toString() {
        return nombre + "@" + dominio;
    }
}