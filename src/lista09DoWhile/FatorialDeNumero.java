package lista09DoWhile;

import java.util.Scanner;

public class FatorialDeNumero {
    public static void main(String[] args) {
        int numero, fatorial = 1, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número para calcular o fatorial: ");
        numero = input.nextInt();

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.printf("O fatorial de %d é: %d\n", numero, fatorial);
    }
}
