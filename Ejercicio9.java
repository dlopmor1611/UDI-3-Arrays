public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int[] orden = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
        }

        System.out.println("Números generados:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                pares[contadorPares] = numero[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numero[i];
                contadorImpares++;
            }
        }

        System.arraycopy(pares, 0, orden, 0, contadorPares);
        System.arraycopy(impares, 0, orden, contadorPares, contadorImpares);

        System.out.println("Array ordenado:");
        for (int i = 0; i < orden.length; i++) {
            System.out.print(orden[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}