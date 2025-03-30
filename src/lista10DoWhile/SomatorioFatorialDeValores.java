package lista10DoWhile;

import java.util.Scanner;

public class SomatorioFatorialDeValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, fatorial, soma = 0, i = 1;

        System.out.printf("Digite 15 valores inteiros:\n");

        do {
            System.out.printf("Digite agora: ");
            numero = input.nextInt();
            fatorial = 1;

            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }

            soma += fatorial;
            i++;
        } while (i <= 15);

        System.out.printf("Somatório das fatoriais dos valores lidos: %d\n", soma);
    }
}
