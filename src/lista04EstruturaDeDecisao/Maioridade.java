package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
