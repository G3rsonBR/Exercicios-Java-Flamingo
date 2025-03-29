package lista02;

import java.util.Scanner;

public class MediaDeNNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double soma = 0, numero, media;

        System.out.print("Digite a quantidade de números: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = input.nextDouble();
            soma += numero;
        }

        media = soma / n;

        System.out.printf("A média dos números é: %.2f\n", media);
    }
}
