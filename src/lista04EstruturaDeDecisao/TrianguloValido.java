package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class TrianguloValido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Digite o comprimento do primeiro lado: ");
        lado1 = input.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        lado2 = input.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }
}
