package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e por 5.");
        }
    }
}
