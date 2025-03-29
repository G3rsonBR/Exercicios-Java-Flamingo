package lista02;

import java.util.Scanner;

public class ConversaoDeMoeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorReais, taxaDolar, taxaEuro, taxaLibra, valorDolares, valorEuros, valorLibras;

        System.out.print("Digite o valor em reais (R$): ");
        valorReais = input.nextDouble();

        System.out.print("Digite a taxa de câmbio do dólar (R$ para USD): ");
        taxaDolar = input.nextDouble();

        System.out.print("Digite a taxa de câmbio do euro (R$ para EUR): ");
        taxaEuro = input.nextDouble();

        System.out.print("Digite a taxa de câmbio da libra (R$ para GBP): ");
        taxaLibra = input.nextDouble();

        valorDolares = valorReais / taxaDolar;
        valorEuros = valorReais / taxaEuro;
        valorLibras = valorReais / taxaLibra;

        System.out.printf("Valor em dólares (USD): $ %.2f\n", valorDolares);
        System.out.printf("Valor em euros (EUR): € %.2f\n", valorEuros);
        System.out.printf("Valor em libras (GBP): £ %.2f\n", valorLibras);
    }
}
