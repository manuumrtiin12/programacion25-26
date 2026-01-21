package Unidad2.boletinMatrices;

public class Ejercicio1 {

    public void detectaAgotados(int[][] inventario) {

        for (int i = 0 ; i < inventario.length ; i++) {
            int[] fila = inventario[i];

            for (int j = 0 ; j < fila.length ; j++) {
                if (fila[j] == 0) {
                    System.out.println("Producto vacio en fila: " + i + " posicion: " + j);
                }
            }
        }
    }

    public int contabilizaAgotados (int [][] inventario) {

        int productosAgotados = 0;

        for (int i = 0 ; i < inventario.length ; i++) {
            int[] fila = inventario[i];

            for (int j = 0 ; j < fila.length ; j++) {
                if (fila[j] == 0) {
                    productosAgotados++;
                }
            }
        }

        return productosAgotados;
    }

    public void main(String[] args) {

        Ejercicio1 r = new Ejercicio1();

        int[][] inventario = {
                {5, 0, 8},  // Estante 0 (Arriba)
                {2, 10, 0}, // Estante 1 (Medio)
                {0, 4, 1}   // Estante 2 (Abajo)
        };

        r.detectaAgotados(inventario);
        int productosAgotados = r.contabilizaAgotados(inventario);
        System.out.println("La cantidad de productos agotados es: " + productosAgotados);




    }
}
