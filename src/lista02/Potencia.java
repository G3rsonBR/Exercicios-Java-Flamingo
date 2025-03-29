package lista02;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, resultado;
        int expoente;

        System.out.print("Digite a base: ");
        base = input.nextDouble();

        System.out.print("Digite o expoente: ");
        expoente = input.nextInt();

        resultado = Math.pow(base, expoente);

        System.out.printf("O resultado de %.2f^%d é: %.2f\n", base, expoente, resultado);
    }
}
