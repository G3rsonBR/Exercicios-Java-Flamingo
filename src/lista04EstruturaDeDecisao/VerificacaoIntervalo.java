package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está no intervalo de 10 a 20.");
        } else {
            System.out.println("O número " + numero + " não está no intervalo de 10 a 20.");
        }
    }
}
