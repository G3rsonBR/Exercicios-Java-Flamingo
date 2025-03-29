package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class VerificacaoNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;

        System.out.print("Digite a sua nota (0 a 100): ");
        nota = input.nextDouble();

        if (nota >= 60) {
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}
