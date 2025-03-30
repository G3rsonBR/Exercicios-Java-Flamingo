package lista10DoWhile;

import java.util.Scanner;

public class DivisaoInteira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividendo, divisor, quociente = 0;

        System.out.printf("Digite o dividendo: ");
        dividendo = input.nextInt();

        System.out.printf("Digite o divisor: ");
        divisor = input.nextInt();

        do {
            dividendo -= divisor;
            quociente++;
        } while (dividendo >= divisor);

        System.out.printf("Resultado da divisão inteira: %d\n", quociente);
    }
}
