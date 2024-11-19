import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.print("Dame el numero de alumnos y te pedire sus notas:");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int numalum = Integer.parseInt(cadena);

        int[] notas = new int[numalum];

        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < numalum; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        int sumanotas = 0;
        for (int i = 0; i < notas.length; i++) {

            sumanotas += notas[i];
        }
        double media = sumanotas / notas.length;
        System.out.println("La media de las notas es: " + media);

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {

                System.out.println("Nota superior a la media " + (i + 1) + ": " + notas[i]);
            }
        }

        scanner.close();
    }
}