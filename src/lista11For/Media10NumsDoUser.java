package lista11For;
import java.util.Scanner;

public class Media10NumsDoUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            soma += num;
        }
        double media = soma / 10.0;
        System.out.println("Média dos 10 números: " + media);
    }
}
