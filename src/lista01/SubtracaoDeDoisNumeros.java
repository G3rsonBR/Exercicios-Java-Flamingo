package lista01;

import java.util.Scanner;

public class SubtracaoDeDoisNumeros {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, sub;

        System.out.println("Subtração de dois números\n");

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        sub = numero1 - numero2;

        System.out.printf("A subtração de %s com %s é %s", numero1, numero2, sub);

    }
}
