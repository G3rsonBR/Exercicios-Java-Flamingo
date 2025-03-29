package lista01;

import java.util.Scanner;

public class DivisaoDeDoisNumeros {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        float div;

        System.out.println("Divisão de dois números\n");

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        if (numero2 == 0) {
            System.out.print("Não é possível dividir por zero");
        }
        else {
            div = (float) numero1 / numero2;
            System.out.printf("A Divisão de %s com %s é %.2f", numero1, numero2, div);
        }
    }
}
