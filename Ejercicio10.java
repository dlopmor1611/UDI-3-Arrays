import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numero = new int[20];
       String[] numeroCorchete = new String[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 401);
        }

        System.out.println("Números generados:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que numeros quiere resaltar?:");
        System.out.println("1-Multiplos de 5");
        System.out.println("2-Multiplos de 7");
        System.out.print("->");
        int num1 = Integer.parseInt(scanner.nextLine());

        if (num1==1) {
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] % 5 == 0) {
                   numeroCorchete[i] = "[" + numero[i] + "]";
                } else {
                    numeroCorchete[i] = String.valueOf(numero[i]);
                }
            }
        } else {
            if (num1==2) {
                for (int i = 0; i < numero.length; i++) {
                    if (numero[i] % 7 == 0) {
                        numeroCorchete[i] = "[" + numero[i] + "]";
                     } else {
                         numeroCorchete[i] = String.valueOf(numero[i]);
                     } 
                }
            }
        }
        System.out.println("El array resaltado es");
        for (int i = 0; i < numeroCorchete.length; i++) {
            System.out.print(numeroCorchete[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}