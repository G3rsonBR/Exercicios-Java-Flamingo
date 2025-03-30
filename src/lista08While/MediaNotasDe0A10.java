package lista08While;

import java.util.Scanner;

public class MediaNotasDe0A10 {
    public static void main(String[] args) {
        int nota, soma = 0, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite notas de 0 a 10 (digite um número inválido para parar):\n");

        while (true) {
            System.out.print("Digite agora: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                break;
            }
            soma += nota;
            count++;
        }

        double media = soma / (double) count;
        System.out.printf("Média das notas: %.2f\n", media);
    }
}
