package lista12For;
import java.util.Scanner;

public class ContarZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String numero = sc.next();

        int qtdZeros = 0;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '0') {
                qtdZeros++;
            }
        }
        System.out.println("Quantidade de dígitos zero: " + qtdZeros);
    }
}
