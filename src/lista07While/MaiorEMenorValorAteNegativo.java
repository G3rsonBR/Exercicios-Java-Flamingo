package lista07While;

import java.util.Scanner;

public class MaiorEMenorValorAteNegativo {
    public static void main(String[] args) {
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite valores positivos inteiros (digite um valor negativo para parar):\n");

        while (true) {
            System.out.print("Digite agora: ");
            valor = input.nextInt();

            if (valor < 0) {
                break;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);
    }
}
