package lista03;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para mostrar seu Antecessor: ");
        int valor = input.nextInt();
        System.out.printf("Antecessor: %s", valor - 1);
    }
}