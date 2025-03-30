package lista08While;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        int numero = 0, soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite números positivos para somar (um número negativo para parar):\n");

        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite agora: ");
            numero = input.nextInt();
        }

        System.out.printf("Total da soma: %d\n", soma);
    }
}
