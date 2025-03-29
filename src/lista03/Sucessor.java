package lista03;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para mostrar seu Sucessor: ");
        int valor = input.nextInt();
        System.out.printf("Sucessor: %s", valor + 1);
    }
}