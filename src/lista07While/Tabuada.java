package lista07While;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int num, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Apresenta os resultados da tabuada de multiplicar de um número qualquer (de 1 até 10): ");
        num = input.nextInt();

        while (i <= 10) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
            i++;
        }
    }
}
