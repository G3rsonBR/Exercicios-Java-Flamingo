package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class SinalNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
