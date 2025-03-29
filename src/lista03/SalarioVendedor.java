package lista03;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCarrosVendidos;
        double valorTotalVendas, salarioFixo, valorPorCarro;

        System.out.print("Digite o número de carros vendidos: ");
        numCarrosVendidos = input.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        valorTotalVendas = input.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        salarioFixo = input.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        valorPorCarro = input.nextDouble();

        double comissaoVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + (numCarrosVendidos * valorPorCarro) + comissaoVendas;

        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
}
