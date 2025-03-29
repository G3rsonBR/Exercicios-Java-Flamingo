package lista03;

import java.util.Scanner;

public class PercentualDeVotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos;

        System.out.print("Digite o total de eleitores: ");
        totalEleitores = input.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        votosBrancos = input.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        votosNulos = input.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        votosValidos = input.nextInt();

        System.out.println("Percentual de votos brancos: " + ((double) votosBrancos / totalEleitores) * 100 + "%");
        System.out.println("Percentual de votos nulos: " + ((double) votosNulos / totalEleitores) * 100 + "%");
        System.out.println("Percentual de votos válidos: " + ((double) votosValidos / totalEleitores) * 100 + "%");
    }
}
