package lista07While;

import java.util.Scanner;

public class SomaEMediaDe10Valores {
    public static void main(String[] args) {
        int soma = 0, i = 1;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite 10 valores numéricos\n");

        while (i <= 10) {
            System.out.printf("%s°: ", i);
            int valor = input.nextInt();
            soma += valor;
            i++;
        }

        media = soma / 10.0;
        System.out.printf("Somatório: %d\n", soma);
        System.out.printf("Média: %.2f\n", media);
    }
}
