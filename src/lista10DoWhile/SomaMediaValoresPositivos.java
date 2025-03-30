package lista10DoWhile;

import java.util.Scanner;

public class SomaMediaValoresPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0, count = 0;
        double media;

        System.out.printf("Digite valores positivos (valor negativo para parar):\n");

        do {
            numero = input.nextInt();
            if (numero >= 0) {
                soma += numero;
                count++;
            }
        } while (numero >= 0);

        if (count > 0) {
            media = soma / (double) count;
            System.out.printf("Somatório: %d\n", soma);
            System.out.printf("Média: %.2f\n", media);
            System.out.printf("Total de valores lidos: %d\n", count);
        } else {
            System.out.printf("Nenhum valor positivo foi inserido.\n");
        }
    }
}
