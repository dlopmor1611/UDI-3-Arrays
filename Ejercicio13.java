public class Ejercicio13 {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];

        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * 71) + 140;
            }
        }

        System.out.printf("%-10s | %-15s | %-15s | %-15s%n", "País", "Media (cm)", "Mínima (cm)", "Máxima (cm)");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < paises.length; i++) {
            int suma = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < estaturas[i].length; j++) {
                int estatura = estaturas[i][j];
                suma += estatura;
                if (estatura < min) min = estatura;
                if (estatura > max) max = estatura;
            }

            int media = suma / estaturas[i].length;

            System.out.printf("%-10s | %-15d | %-15d | %-15d%n", paises[i], media, min, max);
        }
    }
}
