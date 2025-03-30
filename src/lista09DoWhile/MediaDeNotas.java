package lista09DoWhile;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        int nota, soma = 0, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite notas de 0 a 10 (digite um número inválido para parar):\n");

        do {
            System.out.printf("Digite agora: ");
            nota = input.nextInt();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                count++;
            }
        } while (nota >= 0 && nota <= 10);

        if (count > 0) {
            double media = soma / (double) count;
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.printf("Nenhuma nota válida foi inserida.\n");
        }
    }
}
