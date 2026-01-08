package Unidad2.Pruebas;

public class VueltaNavidad {
    public static void main(String[] args) {

        int numero1 = 8;
        int numero2 = 4;

        if (numero1 > 10 && numero2 > 10)
        {
            System.out.println("Ambos numeros mayores que 10");
        }

        else {
            if (numero1 > numero2)
            {
                System.out.println("El numero 1 es mayor que el numero 2");
            }

            else if (numero2 > numero1)
            {
                System.out.println("El numero 2 es mayor que el numero 1");
            }

            else {
                System.out.println("Son iguales");
            }
        }


    }
}
