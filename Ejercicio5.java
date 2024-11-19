import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sumaPositivos = 0, sumaNegativos = 0, numPositivos = 0, numNegativos = 0;

        for (int num : array) {
            if (num > 0) {
                sumaPositivos += num;
                numPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                numNegativos++;
            }
        }

        if (numPositivos > 0) {
            System.out.println("La media de los números positivos es: " + (double) sumaPositivos / numPositivos);
        } else {
            System.out.println("No hay números positivos en el array.");
        }

        if (numNegativos > 0) {
            System.out.println("La media de los números negativos es: " + (double) sumaNegativos / numNegativos);
        } else {
            System.out.println("No hay números negativos en el array.");
        }

        scanner.close();
    }
}