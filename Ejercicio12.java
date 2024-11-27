public class Ejercicio12 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        int sumaTotal = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = (int) (Math.random() * 100) + 1;
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("Matriz con sumas parciales:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%4d", numeros[i][j]);
            }
            System.out.printf(" | %4d%n", sumaFilas[i]);
        }

        for (int j = 0; j < columnas; j++) {
            System.out.print("----");
        }
        System.out.println("------");

        for (int j = 0; j < columnas; j++) {
            System.out.printf("%4d", sumaColumnas[j]);
        }
        System.out.printf(" | %4d%n", sumaTotal);
    }
}
