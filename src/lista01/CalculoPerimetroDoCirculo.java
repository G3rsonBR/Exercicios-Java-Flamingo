package lista01;

import java.util.Scanner;

public class CalculoPerimetroDoCirculo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int raio;
        double perimetro;

        System.out.println("Perímetro do Circulo\n");

        System.out.print("Digite o raio: ");
        raio = input.nextInt();

        perimetro = 2 * Math.PI * raio;
        System.out.printf("O perimetro do circulo é: %.2f", perimetro);
    }
}
