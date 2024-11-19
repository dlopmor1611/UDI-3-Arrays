import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.print("Dame un numero y te pedire cadenas esa cantidad de veces:");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int numrep = Integer.parseInt(cadena);

        String[] primeraletra = new String[numrep];

        System.out.println("Ingresa los elementos del array (Sin Mayusculas):");
        for (int i = 0; i < numrep; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            primeraletra[i] = scanner.nextLine();
        }

        System.out.print("Ingresa un caracter (Sin Mayusculas): ");
        char caracter = scanner.nextLine().charAt(0);

        String cadenai = "";
        for (int i = 0; i < primeraletra.length; i++) {
            if (primeraletra[i].charAt(0) == caracter) {
                cadenai = primeraletra[i] + " " + cadenai;
            }
        }

        System.out.println("Las cadenas que empiezan por " + caracter + " son: " + cadenai);
        scanner.close();
    }
}