package lista05EstruturaDeDecisao;

import java.util.Scanner;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Digite o comprimento do primeiro lado: ");
        lado1 = input.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        lado2 = input.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        lado3 = input.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
