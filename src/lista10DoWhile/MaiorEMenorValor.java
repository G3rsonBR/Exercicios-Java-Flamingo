package lista10DoWhile;

import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.printf("Digite valores positivos (valor negativo para parar):\n");

        do {
            numero = input.nextInt();
            if (numero >= 0) {
                if (numero > maior) maior = numero;
                if (numero < menor) menor = numero;
            }
        } while (numero >= 0);

        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);
    }
}
