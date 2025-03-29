package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }

    }
}

