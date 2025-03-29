package lista03;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3;

        System.out.print("Digite a primeira nota (peso 2): ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        n2 = input.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        n3 = input.nextDouble();

        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.println("A média final do aluno é: " + mediaFinal);
    }
}
