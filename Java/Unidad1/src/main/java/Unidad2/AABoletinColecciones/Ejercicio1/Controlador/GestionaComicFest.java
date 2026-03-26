package main.java.Unidad2.AABoletinColecciones.Ejercicio1.Controlador;

import main.java.Unidad2.AABoletinColecciones.Ejercicio1.Modelo.*;

import java.time.LocalDate;

public class GestionaComicFest {

    public static void main(String[] args) {

        RegistroEntrada registro = new RegistroEntrada();

        Influencer i1 = new Influencer("Ana", "anaYT", 10000, "YouTube");
        Influencer i2 = new Influencer("Luis", "luisIG", 8000, "Instagram");
        Influencer i3 = new Influencer("Marta", "martaTW", 9000, "Twitter");

        registro.añadirEntrada(i1, new entradaVIP(1, LocalDate.now(), TipoEntrada.PLATINIUM));
        registro.añadirEntrada(i2, new entradaVIP(2, LocalDate.now(), TipoEntrada.PLATINIUM));
        registro.añadirEntrada(i3, new entradaVIP(3, LocalDate.now(), TipoEntrada.PLATINIUM));

        Influencer i4 = new Influencer("Carlos", "carlosYT", 5000, "YouTube");
        Influencer i5 = new Influencer("Elena", "elenaIG", 6000, "Instagram");
        Influencer i6 = new Influencer("Pablo", "pabloTW", 5500, "Twitter");

        registro.añadirEntrada(i4, new entradaVIP(4, LocalDate.now(), TipoEntrada.GOLD));
        registro.añadirEntrada(i5, new entradaVIP(5, LocalDate.now(), TipoEntrada.GOLD));
        registro.añadirEntrada(i6, new entradaVIP(6, LocalDate.now(), TipoEntrada.GOLD));

        Influencer i7 = new Influencer("Sara", "saraYT", 2000, "YouTube");
        Influencer i8 = new Influencer("Mario", "marioIG", 2500, "Instagram");
        Influencer i9 = new Influencer("Lucia", "luciaTW", 3000, "Twitter");

        registro.añadirEntrada(i7, new entradaVIP(7, LocalDate.now(), TipoEntrada.SILVER));
        registro.añadirEntrada(i8, new entradaVIP(8, LocalDate.now(), TipoEntrada.SILVER));
        registro.añadirEntrada(i9, new entradaVIP(9, LocalDate.now(), TipoEntrada.SILVER));

        System.out.println("Buscar existente:");
        System.out.println(registro.buscarInfluencer("anaYT", "YouTube"));

        System.out.println("Buscar NO existente:");
        System.out.println(registro.buscarInfluencer("noExiste", "TikTok"));

        registro.confirmarAsistencia("anaYT", "YouTube");
        registro.confirmarAsistencia("carlosYT", "YouTube");
        registro.confirmarAsistencia("saraYT", "YouTube");   

        registro.cancelarAsistencia("elenaIG", "Instagram");

        System.out.println("Después de confirmar/cancelar:");

        System.out.println(registro.buscarInfluencer("anaYT", "YouTube"));
        System.out.println(registro.buscarInfluencer("carlosYT", "YouTube"));
        System.out.println(registro.buscarInfluencer("saraYT", "YouTube"));
        System.out.println(registro.buscarInfluencer("elenaIG", "Instagram"));
    }
}
