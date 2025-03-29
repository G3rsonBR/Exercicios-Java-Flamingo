package lista03;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double custoFabrica;

        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = input.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        System.out.println("O custo final do carro ao consumidor é: " + custoFinal);
    }
}
