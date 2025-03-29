package lista03;

import java.util.Scanner;

public class AreaDeUmTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura;

        System.out.print("Digite a base do triângulo: ");
        base = input.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        altura = input.nextDouble();

        System.out.println("A área do triângulo é: " + ((base * altura) / 2));
    }
}
