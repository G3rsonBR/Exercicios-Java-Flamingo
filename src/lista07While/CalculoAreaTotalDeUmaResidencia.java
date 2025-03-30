package lista07While;

import java.util.Scanner;

public class CalculoAreaTotalDeUmaResidencia {
    public static void main(String[] args) {
        double areaTotal = 0, largura, comprimento, areaComodo;
        String continuar = "SIM";
        Scanner input = new Scanner(System.in);

        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.printf("Digite o nome do cômodo: ");
            String nome = input.nextLine();

            System.out.printf("Digite a largura do %s: ", nome);
            largura = input.nextDouble();

            System.out.printf("Digite o comprimento do %s: ", nome);
            comprimento = input.nextDouble();

            areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("A área do %s é: %.2f\n", nome, areaComodo);

            input.nextLine();  // Consumir a quebra de linha deixada pelo nextDouble()

            System.out.printf("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
            continuar = input.nextLine();
        }

        System.out.printf("Área total acumulada da residência: %.2f\n", areaTotal);
    }
}