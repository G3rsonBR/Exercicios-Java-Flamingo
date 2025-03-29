package lista06SwitchCase;

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Digite o comprimento do primeiro lado: ");
        lado1 = input.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        lado2 = input.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        lado3 = input.nextDouble();

        switch (Integer.compare((int) lado1, (int) lado2)) {
            case 0:
                if (lado2 == lado3) {
                    System.out.println("Triângulo Equilátero.");
                } else {
                    System.out.println("Triângulo Isósceles.");
                }
                break;
            default:
                if (lado1 != lado3) {
                    System.out.println("Triângulo Escaleno.");
                }
                break;
        }
    }
}

