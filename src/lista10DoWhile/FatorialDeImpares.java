package lista10DoWhile;

public class FatorialDeImpares {
    public static void main(String[] args) {
        int i = 1;
        System.out.printf("Fatorial dos valores ímpares de 1 a 10:\n");

        do {
            if (i % 2 != 0) {
                int fatorial = 1;
                for (int j = 1; j <= i; j++) {
                    fatorial *= j;
                }
                System.out.printf("Fatorial de %d: %d\n", i, fatorial);
            }
            i++;
        } while (i <= 10);
    }
}
