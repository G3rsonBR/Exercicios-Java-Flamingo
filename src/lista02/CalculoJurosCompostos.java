package lista02;

import java.util.Scanner;

public class CalculoJurosCompostos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double capitalInicial, montanteFinal, taxaJurosAnual;

        System.out.print("Digite o capital inicial (P): ");
        capitalInicial = input.nextDouble();

        System.out.print("Digite a taxa de juros anual (r) em %: ");
        taxaJurosAnual = input.nextDouble();

        System.out.print("Digite o número de anos (t): ");
        int anos = input.nextInt();

        montanteFinal = capitalInicial * Math.pow((1 + taxaJurosAnual / 100), anos);

        System.out.printf("O montante final após %d anos será: R$ %.2f\n", anos, montanteFinal);
    }
}
