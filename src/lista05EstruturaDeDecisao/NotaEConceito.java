package lista05EstruturaDeDecisao;

import java.util.Scanner;

public class NotaEConceito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;

        System.out.print("Digite uma nota de 0 a 100: ");
        nota = input.nextDouble();

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 80) {
            System.out.println("Conceito: B");
        } else if (nota >= 70) {
            System.out.println("Conceito: C");
        } else if (nota >= 60) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: F");
        }
    }
}
