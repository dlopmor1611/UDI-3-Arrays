public class Ejercicio11 {
    public static void main(String[] args) {
        Object[][] num = {
            {0,30,2,null,null,5}, 
            {75,null,null,null,0,null}, 
            {null,null,-2,9,null,11}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
    }
}