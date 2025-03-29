package lista02;

import java.util.Scanner;

public class CalculoDaAreaEPerimetroDeUmTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, area, lado, perimetro;

        System.out.print("Digite a base do triângulo: ");
        base = input.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        altura = input.nextDouble();

        area = (base * altura) / 2;

        lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        perimetro = base + 2 * lado;

        System.out.printf("Área do triângulo: %.2f\n", area);
        System.out.printf("Perímetro do triângulo: %.2f\n", perimetro);
    }
}

