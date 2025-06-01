package lista12For;
import java.util.Scanner;

public class SomaDigitosParesIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Fim do intervalo: ");
        int fim = sc.nextInt();

        int somaTotal = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                int n = i;
                while (n > 0) {
                    somaTotal += n % 10;
                    n /= 10;
                }
            }
        }
        System.out.println("Soma dos dígitos dos números pares: " + somaTotal);
    }
}
