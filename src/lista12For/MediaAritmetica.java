package lista12For;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, count = 0;

        for (;;) {
            System.out.print("Digite um número (negativo para parar): ");
            int num = sc.nextInt();
            if (num < 0) break;
            soma += num;
            count++;
        }
        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número positivo foi fornecido.");
        }

    }
}
