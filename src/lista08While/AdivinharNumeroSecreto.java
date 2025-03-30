package lista08While;

import java.util.Scanner;

public class AdivinharNumeroSecreto {
    public static void main(String[] args) {
        int numeroSecreto = 7, palpite;
        Scanner input = new Scanner(System.in);

        System.out.printf("Tente adivinhar o número secreto entre 1 e 10:\n");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();

            if (palpite == numeroSecreto) {
                System.out.printf("Parabéns! Você acertou o número.\n");
                break;
            } else {
                System.out.printf("Errou! Tente novamente.\n");
            }
        }
    }
}
