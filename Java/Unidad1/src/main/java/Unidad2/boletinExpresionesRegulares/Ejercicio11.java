package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejercicio11 {
    public static void main(String[] args) {

        String texto = "El servidor principal fue configurado con la dirección 192.168.1.10, "
                + "mientras que el servidor de respaldo utiliza 192.168.1.20 para garantizar la continuidad del servicio. "
                + "Durante las pruebas de red realizadas el 10/01/2025, se detectó tráfico inusual proveniente de 10.0.0.45, "
                + "lo que llevó a una revisión inmediata de las reglas de firewall. "
                + "El balanceador de carga distribuye las solicitudes entre 172.16.0.5 y 172.16.0.6, "
                + "optimizando el rendimiento del sistema. "
                + "Además, el acceso administrativo solo está permitido desde la IP 203.0.113.8, "
                + "registrada como punto de conexión autorizado. "
                + "Finalmente, los registros del sistema mostraron conexiones fallidas repetidas desde 198.51.100.23, "
                + "las cuales fueron bloqueadas automáticamente por motivos de seguridad.";

        String regexIPv4 = "\\b(?:(?:25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                + "(?:25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\b";

        Pattern pattern = Pattern.compile(regexIPv4);
        Matcher matcher = pattern.matcher(texto);

        String resultado = matcher.replaceAll("[IPv4]");

        System.out.println(resultado);
    }
}
