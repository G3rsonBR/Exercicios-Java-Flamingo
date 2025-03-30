package lista10DoWhile;

public class SomatorioValoresPares {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        System.out.printf("Somatório dos valores pares de 1 até 500:\n");

        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= 500);

        System.out.printf("O somatório dos valores pares é: %d\n", soma);
    }
}
