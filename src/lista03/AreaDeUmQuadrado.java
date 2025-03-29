package lista03;

import java.util.Scanner;

public class AreaDeUmQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado;

        System.out.print("Digite o lado do quadrado: ");
        lado = input.nextDouble();

        System.out.println("A área do quadrado é: " + (lado * lado));
    }
}
