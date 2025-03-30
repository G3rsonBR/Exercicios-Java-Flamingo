package lista08While;

import java.util.Scanner;

public class ContaVogais {
    public static void main(String[] args) {
        String palavra;
        int count = 0, i = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite uma palavra para contar as vogais: ");
        palavra = input.nextLine();

        while (i < palavra.length()) {
            char c = palavra.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
            i++;
        }
        System.out.printf("A palavra possui %d vogais.\n", count);
    }
}
