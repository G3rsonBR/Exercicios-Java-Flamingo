package lista12For;
import java.util.Scanner;

public class InverterLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos a lista terá? ");
        int qtd = sc.nextInt();
        int[] lista = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.println("Lista em ordem inversa:");
        for (int i = qtd - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}
