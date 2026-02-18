package main.java.Unidad2.AASimulacion2;

public class GestionaIncidenciasEquipo {

    private Incidencia[] incidencias;
    private int numIncidencias;

    public GestionaIncidenciasEquipo() {
        incidencias = new Incidencia[10];
        numIncidencias = 0;
    }

    public void agregarIncidencia(Incidencia incidencia) {
        if (numIncidencias < incidencias.length) {
            incidencias[numIncidencias] = incidencia;
            numIncidencias++;
        }
    }

    public void mostrarTodasLasIncidencias() {
        for (int i = 0; i < numIncidencias; i++) {
            System.out.println(incidencias[i]);
        }
    }

    public void mostrarIncidenciasUrgentes() {
        for (int i = 0; i < numIncidencias; i++) {
            if (incidencias[i].getCriticidad() == CriticidadIncidencia.CRITICA) {
                System.out.println(incidencias[i]);
                incidencias[i].esUrgente();
            }
        }
    }

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("12345678A", "Carlos López", "Informática");
        Usuario usuario2 = new Usuario("87654321B", "Ana Martín", "Marketing");
        Usuario usuario3 = new Usuario("11223344C", "Luis Pérez", "Administración");
        Usuario usuario4 = new Usuario("99887766D", "Marta Ruiz", "Almacén");

        Equipo equipo1 = new Equipo("PC-Oficina", "AA:BB:CC:DD:01", "Windows", 0, usuario1);
        Equipo equipo2 = new Equipo("Portátil-Marketing", "AA:BB:CC:DD:02", "Linux", 0, usuario2);
        Equipo equipo3 = new Equipo("Servidor", "AA:BB:CC:DD:03", "Linux", 0, usuario3);
        Equipo equipo4 = new Equipo("PC-Almacén", "AA:BB:CC:DD:04", "Windows", 0, usuario4);

        Incidencia incidencia1 = new Incidencia(1, "Error arranque", "El equipo no arranca", null, null, EstadoIncidencia.REGISTRADA, CriticidadIncidencia.CRITICA, equipo1);
        Incidencia incidencia2 = new Incidencia(2, "Pantalla azul", "Fallo del sistema", null, null, EstadoIncidencia.ANALIZADA, CriticidadIncidencia.GRAVE, equipo1);
        Incidencia incidencia3 = new Incidencia(3, "Sin conexión", "No hay acceso a red", null, null, EstadoIncidencia.REGISTRADA, CriticidadIncidencia.MEDIA, equipo2);
        Incidencia incidencia4 = new Incidencia(4, "Actualización", "Sistema desactualizado", null, null, EstadoIncidencia.REGISTRADA, CriticidadIncidencia.LEVE, equipo3);

        GestionaIncidenciasEquipo gestor = new GestionaIncidenciasEquipo();
        gestor.agregarIncidencia(incidencia1);
        gestor.agregarIncidencia(incidencia2);
        gestor.agregarIncidencia(incidencia3);
        gestor.agregarIncidencia(incidencia4);

        System.out.println("TODAS LAS INCIDENCIAS");
        gestor.mostrarTodasLasIncidencias();

        System.out.println("INCIDENCIAS URGENTES");
        gestor.mostrarIncidenciasUrgentes();

        System.out.println("EQUIPOS Y USUARIOS:");
        System.out.println(equipo1);
        System.out.println(equipo2);
        System.out.println(equipo3);
        System.out.println(equipo4);
    }
}
