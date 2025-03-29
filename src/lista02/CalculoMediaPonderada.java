package lista02;

import java.util.Scanner;

public class CalculoMediaPonderada {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3;
        double peso1, peso2, peso3, somaNotasPesos, somaPesos, resultado;

        System.out.println("Média Ponderada\n");

        System.out.print("Digite a nota 1: ");
        nota1 = input.nextInt();

        System.out.print("Digite o peso da nota 1: ");
        peso1 = input.nextInt();

        System.out.print("Digite a nota 2: ");
        nota2 = input.nextInt();

        System.out.print("Digite o peso da nota 2: ");
        peso2 = input.nextInt();

        System.out.print("Digite a nota 3: ");
        nota3 = input.nextInt();

        System.out.print("Digite o peso da nota 3: ");
        peso3 = input.nextInt();

        somaNotasPesos = nota1 * peso1 + nota2 * peso2 + nota3 * peso3;
        somaPesos = peso1 + peso2 + peso3;
        resultado = somaNotasPesos / somaPesos;

        System.out.printf("A Média Ponderada das Notas Digitadas é: %.2f ", resultado);
    }
}
