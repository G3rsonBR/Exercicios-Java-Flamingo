package lista07While;

import java.util.Scanner;

public class PotenciaEExpoenteDoUsuario {
    public static void main(String[] args) {
        int base, expoente, resultado = 1, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Apresenta o valor de uma potência de uma base qualquer elevada a um expoente qualquer\n");

        System.out.printf("Escolha a base: ");
        base = input.nextInt();

        System.out.printf("Escolha o expoente: ");
        expoente = input.nextInt();

        while (i <= expoente) {
            resultado *= base;
            i++;
        }
        System.out.printf("%d^%d = %d\n", base, expoente, resultado);
    }
}
