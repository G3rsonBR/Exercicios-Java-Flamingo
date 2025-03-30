package lista09DoWhile;

import java.util.Scanner;

public class ContagemDeVogais {
    public static void main(String[] args) {
        String palavra;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite uma palavra para contar as vogais (digite 'sair' para parar): ");

        do {
            palavra = input.nextLine();
            if (!palavra.equalsIgnoreCase("sair")) {
                int i = 0;
                while (i < palavra.length()) {
                    char c = palavra.charAt(i);
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        count++;
                    }
                    i++;
                }
                System.out.printf("A palavra possui %d vogais.\n", count);
            }
        } while (!palavra.equalsIgnoreCase("sair"));
    }
}
