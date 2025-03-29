package lista03;

import java.util.Scanner;

public class AreaDeUmCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio;

        System.out.print("Digite o raio do círculo: ");
        raio = input.nextDouble();

        System.out.printf("A área do círculo é: %.2f", (Math.PI * raio * raio));
    }
}
