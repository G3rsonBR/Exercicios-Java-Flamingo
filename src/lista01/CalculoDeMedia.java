package lista01;

import java.util.Scanner;

public class CalculoDeMedia {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
        double media;

        System.out.println("Média de 3 número\n");

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();

        media = (double) (numero1 + numero2 + numero3) / 3;
        System.out.printf("A Média dos número digitados é: %.2f", media);
    }
}
