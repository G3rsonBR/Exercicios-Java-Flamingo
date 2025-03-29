package lista03;

import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioAtual, percentualReajuste;

        System.out.print("Digite o salário mensal atual do funcionário: ");
        salarioAtual = input.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        percentualReajuste = input.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);
        System.out.println("O novo salário do funcionário é: " + novoSalario);
    }
}
