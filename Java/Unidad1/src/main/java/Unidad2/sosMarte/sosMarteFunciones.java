package main.java.Unidad2.sosMarte;

import java.util.Scanner;

public class sosMarteFunciones {

    public static void entradas(int numEntradas, String[] tablaRecursos,
                                int[] tablaCantidades, int[] tablaNivelAlerta) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numEntradas; i++) {

            System.out.print("Nombre del recurso " + (i + 1) + ": ");
            tablaRecursos[i] = sc.nextLine();

            System.out.print("Cantidad del recurso " + (i + 1) + ": ");
            tablaCantidades[i] = sc.nextInt();

            System.out.print("Nivel crítico del recurso " + (i + 1) + ": ");
            tablaNivelAlerta[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public static int leeBaseDatos(String mensaje, String[] tablaRecursos) {

        String[] partesMensajeError = mensaje.split("::");
        String palabraBuscada = partesMensajeError[1];

        for (int i = 0; i < tablaRecursos.length; i++) {

            if (tablaRecursos[i] != null && tablaRecursos[i].equals(palabraBuscada)) {
                return i;
            }
        }
        return -1;
    }

    public static String extraerDatos(String[] tablaRecursos,
                                      int[] tablaCantidades,
                                      int[] tablaNivelAlerta) {

        String resultado = "";

        for (int posicion = 0; posicion < tablaRecursos.length; posicion++) {

            if (tablaRecursos[posicion] != null) {

                resultado += "Recurso: " + tablaRecursos[posicion]
                        + " | Cantidad: " + tablaCantidades[posicion]
                        + " | Nivel crítico: " + tablaNivelAlerta[posicion]
                        + "\n";
            }
        }
        return resultado;
    }

    public static int extraerValorMensaje(String mensaje) {

        String[] partes = mensaje.split("::");
        String parteValor = partes[2];        // "-15++FIN"
        String valorTexto = parteValor.split("\\+\\+")[0];

        return Integer.parseInt(valorTexto);
    }

    public static void actualizar_y_revisar(String mensaje,
                                            String[] tablaRecursos,
                                            int[] tablaCantidades,
                                            int[] tablaNivelAlerta) {

        int posicion = leeBaseDatos(mensaje, tablaRecursos);

        if (posicion == -1) {
            System.out.println("Recurso no encontrado en la base de datos");
            return;
        }

        int valorMensaje = extraerValorMensaje(mensaje);
        int limiteCritico = tablaNivelAlerta[posicion];

        if (valorMensaje < limiteCritico) {
            System.out.println("¡ALERTA CRÍTICA EN " + tablaRecursos[posicion] + "!");
        } else {
            System.out.println("VALIDADO EL RECURSO " + tablaRecursos[posicion]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tablaRecursos = new String[100];
        int[] tablaCantidades = new int[100];
        int[] tablaNivelAlerta = new int[100];

        System.out.print("¿Cuantos recursos quieres registrar?: ");
        int numEntradas = sc.nextInt();
        sc.nextLine();

        entradas(numEntradas, tablaRecursos, tablaCantidades, tablaNivelAlerta);

        String mensaje = "ERR_SISTEMA::Agua::-15++FIN";
        System.out.println(mensaje);

        int metodoBaseDatos = leeBaseDatos(mensaje, tablaRecursos);
        System.out.println(metodoBaseDatos);

        String metodoExtraerDatos = extraerDatos(tablaRecursos, tablaCantidades, tablaNivelAlerta);
        System.out.println(metodoExtraerDatos);

        actualizar_y_revisar(mensaje, tablaRecursos, tablaCantidades, tablaNivelAlerta);
    }
}