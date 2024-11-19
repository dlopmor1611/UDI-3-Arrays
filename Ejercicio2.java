import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.print("Dame un numero y te pedire cadenas esa cantidad de veces:");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int numrep = Integer.parseInt(cadena);

        String[] longitud = new String[numrep];

        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < numrep; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            longitud[i] = scanner.nextLine();
        }

        String cadenai = "";
        for (int i = 0; i < longitud.length; i++) {
            if (cadenai.length() < longitud[i].length()) {
                cadenai = longitud[i];
            }
        }

        System.out.println("La cadena mas larga del array es: " + cadenai);
        scanner.close();
    }
}