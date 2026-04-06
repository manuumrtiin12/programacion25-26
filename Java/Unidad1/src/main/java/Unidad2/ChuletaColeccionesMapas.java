package main.java.Unidad2;

import java.util.*;

/**
 * CHULETA DEFINITIVA: ESTRUCTURAS DE ALMACENAMIENTO EN JAVA
 * Temario: Colecciones (List, Set) y Mapas.
 */
public class ChuletaColeccionesMapas {

    public static void main(String[] args) {

        /* =========================================================================
         * 1. LISTAS (Interfaz List)
         * =========================================================================
         * - ¿Qué son?: Agrupación dinámica de elementos cuyo tamaño no es constante.
         * - ¿Aceptan duplicados?: SÍ.
         * - ¿Orden?: Mantienen el orden de INSERCIÓN de manera estricta.
         * - Acceso: Los elementos tienen un índice (posición 0, 1, 2...), por lo que se puede usar get(i).
         */

        System.out.println("--- LISTAS ---");

        // -> ArrayList: Guarda los datos de manera consecutiva, como un array tradicional pero expansible.
        // Uso ideal: Cuando necesitas consultar elementos frecuentemente por su posición (rápido acceso).
        // Desventaja: Muy lento si insertas o eliminas elementos en el medio, ya que tiene que desplazar el resto.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Pera");
        arrayList.add("Manzana"); // Permite duplicados sin problema.

        // -> LinkedList: Lista enlazada donde cada elemento (nodo) enlaza a su anterior y a su siguiente.
        // Uso ideal: Cuando vas a añadir o eliminar elementos en medio de la lista muy a menudo.
        // Desventaja: El acceso directo a una posición es muy lento; hay que recorrerla preferiblemente con un iterador.
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Coche");
        linkedList.add("Moto");


        /* =========================================================================
         * 2. CONJUNTOS (Interfaz Set)
         * =========================================================================
         * - ¿Qué son?: Estructuras que tratan los datos como conjuntos matemáticos.
         * - ¿Aceptan duplicados?: NO. Si intentas hacer add() de algo que ya existe, devuelve false y lo ignora.
         * - Acceso: NO se puede acceder a los elementos por índice directamente (no hay get(i)), necesitas iterar.
         */

        System.out.println("\n--- CONJUNTOS ---");

        // -> HashSet: Usa una tabla hash internamente.
        // Uso ideal: Evitar duplicados cuando NO importa en absoluto el orden. Tiene el mejor rendimiento en búsquedas.
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Rojo");
        hashSet.add("Verde");
        hashSet.add("Rojo"); // No dará error, simplemente no se añade al conjunto.

        // -> LinkedHashSet: Como el HashSet, pero mantiene el orden de inserción.
        // Uso ideal: Evitar duplicados pero recordando el orden en el que fueron introducidos (inserta por el final).
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Lunes");
        linkedHashSet.add("Martes");

        // -> TreeSet: No solo es único, sino que los elementos se guardan ORDENADOS automáticamente en un árbol.
        // Uso ideal: Mantener una lista sin duplicados que siempre esté ordenada.
        // Criterio de orden: Usa el orden natural (Comparable) o el Comparator que le pases.
        // Desventaja: Las inserciones son más lentas porque debe reordenar el árbol.
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(6);
        treeSet.add(20); // Se guardará automáticamente como: [6, 15, 20].


        /* =========================================================================
         * 3. MAPAS / DICCIONARIOS (Interfaz Map)
         * =========================================================================
         * - ¿Qué son?: Guardan datos asociando una CLAVE única con un VALOR (pares clave/valor). Ojo: ¡No implementan Collection!.
         * - ¿Aceptan duplicados?: Las CLAVES no pueden estar duplicadas. Los VALORES sí.
         * - Modificación: Si haces put() con una clave que ya existe, se sobrescribe el valor.
         */

        System.out.println("\n--- MAPAS ---");

        // -> HashMap: Guarda los pares sin ningún tipo de orden. Es la implementación más eficiente.
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Casillas");
        hashMap.put(3, "Pique"); // Estarán desordenados internamente.

        // -> LinkedHashMap: Guarda los pares manteniendo el orden en el que se han insertado.
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Messi");
        // Si lo iteramos, siempre saldrá el 10 primero.

        // -> TreeMap: Guarda los pares ORDENADOS automáticamente según el valor de la CLAVE.
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(15, "Ramos");
        treeMap.put(1, "Casillas");
        // Se iterará automáticamente en orden numérico de clave: 1, luego 15.

        // ¿Cómo iterar un mapa? Los mapas no tienen iterador directo, hay que sacar una "vista" de entradas (Map.Entry).
        for (Map.Entry<Integer, String> entrada : hashMap.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue()); //
        }
    }
}

/* =========================================================================
 * 4. ORDENACIÓN AUTOMÁTICA Y CRITERIOS
 * =========================================================================
 */

class Persona implements Comparable<Persona> {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public int compareTo(Persona otra) {
        return this.dni.compareTo(otra.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona otra = (Persona) obj;
        return Objects.equals(dni, otra.dni);
    }
}

class ComparadorPorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}

/* =========================================================================
 * 5. GUÍA RÁPIDA PARA IDENTIFICAR EN EL ENUNCIADO (NUEVO)
 * =========================================================================
 * Lee el problema y busca estas frases clave:
 *
 * A) "¿Quieres guardar elementos y que NO se repitan?" -> USA UN SET.
 * - "...y que se ordenen solos al meterlos": TreeSet.
 * - "...y que aparezcan en el mismo orden que los metí": LinkedHashSet.
 * - "...y no me importa el orden, solo que sea rápido": HashSet.
 *
 * B) "¿Quieres asociar una información con otra (ej: DNI con Alumno)?" -> USA UN MAP.
 * - "...y quiero buscar por la clave rápidamente": HashMap.
 * - "...y quiero que las claves estén ordenadas": TreeMap.
 *
 * C) "¿Necesitas guardar duplicados o importa mucho la posición (índice)?" -> USA UNA LIST.
 * - "...y voy a estar leyendo datos todo el rato": ArrayList.
 * - "...y voy a estar borrando e insertando en medio": LinkedList.
 *
 * EJEMPLO DE ENUNCIADO 1:
 * "Crea una estructura para guardar los DNIs de los asistentes a un evento,
 * sabiendo que un asistente no puede entrar dos veces y queremos ver la lista alfabéticamente."
 * -> SOLUCIÓN: TreeSet<String> (porque no hay duplicados y requiere orden automático).
 *
 * EJEMPLO DE ENUNCIADO 2:
 * "Almacena los productos de un carrito de la compra, permitiendo que haya varios del mismo tipo
 * y respetando el orden en el que el cliente los eligió."
 * -> SOLUCIÓN: ArrayList<Producto> (porque permite duplicados y mantiene el orden de inserción).
 *
 * EJEMPLO DE ENUNCIADO 3:
 * "Guarda los nombres de los empleados usando su número de seguridad social para encontrarlos rápido."
 * -> SOLUCIÓN: HashMap<Long, String> (porque asocias una clave única a un valor).
 */