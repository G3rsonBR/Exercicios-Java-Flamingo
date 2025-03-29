package lista05EstruturaDeDecisao;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Classificação: Aprovado.");
        } else if (media >= 5) {
            System.out.println("Classificação: Recuperação.");
        } else {
            System.out.println("Classificação: Reprovado.");
        }
    }
}
