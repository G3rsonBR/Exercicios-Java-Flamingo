package lista09DoWhile;

import java.util.Scanner;

public class SomaDeNumerosPositivos {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite números positivos para somar (um número negativo para parar):\n");

        do {
            System.out.printf("Digite agora: ");
            numero = input.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.printf("Total da soma: %d\n", soma);
    }
}