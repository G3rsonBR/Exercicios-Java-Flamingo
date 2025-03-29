package lista01;

import java.util.Scanner;

public class AreaDoRetangulo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int largura, altura;
        double area;

        System.out.println("Área do Retângulo\n");

        System.out.print("Digite a largura do retângulo: ");
        largura = input.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        altura = input.nextInt();

        if (largura == altura) {
            System.out.print("Isso é um Quadrado.");
        } else {
            area = largura * altura;
            System.out.printf("A Área do Retângulo é: %.2f ", area);
        }
    }
}
