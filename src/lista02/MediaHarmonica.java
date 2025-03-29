package lista02;

import java.util.Scanner;

public class MediaHarmonica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, mediaHarmonica;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        mediaHarmonica = 3 / ( (1 / num1) + (1 / num2) + (1 / num3) );

        System.out.printf("A média harmônica dos números é: %.2f\n", mediaHarmonica);
    }
}
