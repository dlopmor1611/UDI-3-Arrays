import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del primer array: ");
        int tamano1 = scanner.nextInt();

        int[] array1 = new int[tamano1];
        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < tamano1; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el tamaño del segundo array: ");
        int tamano2 = scanner.nextInt();

        int[] array2 = new int[tamano2];
        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < tamano2; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] arrayMaximos = new int[Math.max(tamano1, tamano2)];
        for (int i = 0; i < arrayMaximos.length; i++) {
            int valor1 = (i < tamano1) ? array1[i] : Integer.MIN_VALUE;
            int valor2 = (i < tamano2) ? array2[i] : Integer.MIN_VALUE;
            arrayMaximos[i] = Math.max(valor1, valor2);
        }

        System.out.print("Array con los valores máximos: ");
        for (int valor : arrayMaximos) {
            System.out.print(valor + " ");
        }
        scanner.close();
    }
}