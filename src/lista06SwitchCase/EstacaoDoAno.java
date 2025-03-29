package lista06SwitchCase;

import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int estacao;

        System.out.print("Digite um número de 1 a 4 para a estação do ano: ");
        estacao = input.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verão");
                break;
            case 3:
                System.out.println("Outono");
                break;
            case 4:
                System.out.println("Inverno");
                break;
            default:
                System.out.println("Número inválido. Digite um número de 1 a 4.");
                break;
        }
    }
}
