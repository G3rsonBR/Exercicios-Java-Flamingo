package lista03;

import java.util.Scanner;

public class AreaDeUmRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = input.nextDouble();

        System.out.println("A área do retângulo é: " + (base * altura));
    }
}
