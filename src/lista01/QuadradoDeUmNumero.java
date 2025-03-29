package lista01;

import java.util.Scanner;

public class QuadradoDeUmNumero {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        double quadrado;

        System.out.println("Quadrado de um número\n");

        System.out.print("Digite o número: ");
        numero = input.nextInt();

        quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado do número %s é: %s", numero, quadrado);
    }
}
