package lista12For;
import java.util.Scanner;

public class StringFornecidaPeloUsuarioEmOrdemReversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        System.out.print("String invertida: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
}
