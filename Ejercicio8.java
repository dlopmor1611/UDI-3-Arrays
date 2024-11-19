import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numero = new int[100];

        for (int i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21);
        }

        System.out.println("Números generados:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Dame otro número por el cual cambiar el primero: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == num1) {
                numero[i] = num2;
            }
        }

        System.out.println("Array modificado:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}