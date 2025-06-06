package lista12For;
import java.util.Scanner;

public class NumerosPrimosNoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos no intervalo:");
        for (int i = inicio; i <= fim; i++) {
            boolean primo = i > 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
