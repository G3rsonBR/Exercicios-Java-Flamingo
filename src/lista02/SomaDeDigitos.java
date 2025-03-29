package lista02;

import java.util.Scanner;

public class SomaDeDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
