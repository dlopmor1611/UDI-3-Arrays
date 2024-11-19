import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.print("Dame un numero y te pedire numeros esa cantidad de veces:");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int numrep = Integer.parseInt(cadena);

        int[] repeticiones = new int[numrep];

        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < numrep; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            repeticiones[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el valor a buscar: ");
        int valor = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i] == valor) {
                resultado++;
            }
        }

        System.out.println("El valor " + valor + " aparece " + resultado + " veces en el array.");

        scanner.close();
    }
}