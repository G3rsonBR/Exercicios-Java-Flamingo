package lista09DoWhile;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número para iniciar a contagem regressiva: ");
        numero = input.nextInt();

        System.out.printf("Contagem regressiva:\n");

        do {
            System.out.printf("%d\n", numero);
            numero--;
        } while (numero >= 0);
    }
}
