package lista12For;
import java.util.Scanner;

public class ContadorParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você quer digitar? ");
        int qtd = sc.nextInt();

        int pares = 0, impares = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }
}
