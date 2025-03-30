package lista07While;

public class Fibonacci {
    public static void main(String[] args) {
        int termo1 = 1, termo2 = 1, termo3, i = 3;

        System.out.printf("Série de Fibonacci até o 15º termo:\n");
        System.out.printf("%d, %d", termo1, termo2);

        while (i <= 15) {
            termo3 = termo1 + termo2;
            System.out.printf(", %d", termo3);
            termo1 = termo2;
            termo2 = termo3;
            i++;
        }

        System.out.println();
    }
}
