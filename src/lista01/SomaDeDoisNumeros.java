package lista01;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, soma;

        System.out.println("Soma de dois números\n");

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma de %s com %s é %s", numero1, numero2, soma);

    }
}
