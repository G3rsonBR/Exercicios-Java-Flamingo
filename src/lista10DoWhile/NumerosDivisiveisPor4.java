package lista10DoWhile;

public class NumerosDivisiveisPor4 {
    public static void main(String[] args) {
        int i = 1;

        System.out.printf("Números divisíveis por 4 menores que 200:\n");

        do {
            if (i % 4 == 0) {
                System.out.printf("%d\n", i);
            }
            i++;
        } while (i < 200);
    }
}
