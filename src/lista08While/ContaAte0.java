package lista08While;

import java.util.Scanner;

public class ContaAte0 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número para iniciar a contagem regressiva: ");
        numero = input.nextInt();

        System.out.printf("Contagem regressiva:\n");

        while (numero >= 0) {
            System.out.printf("%d\n", numero);
            numero--;
        }
    }
}