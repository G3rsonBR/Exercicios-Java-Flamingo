package lista10DoWhile;

public class QuadradosDe15a200 {
    public static void main(String[] args) {
        int i = 15;
        System.out.printf("Quadrados dos números inteiros de 15 a 200:\n");

        do {
            System.out.printf("%d² = %d\n", i, i * i);
            i++;
        } while (i <= 200);
    }
}
