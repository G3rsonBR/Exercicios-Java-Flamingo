package lista09DoWhile;

import java.util.Scanner;

public class TabuadaDeNumero {
    public static void main(String[] args) {
        int num, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número para exibir a tabuada de 1 a 10: ");
        num = input.nextInt();

        do {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
            i++;
        } while (i <= 10);
    }
}
