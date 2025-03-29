package lista01;

import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double temperatura, conversao;

        System.out.println("Conversão de Temperatura (C° para F°)\n");

        System.out.print("Digite a temperatura em C°: ");
        temperatura = input.nextInt();

        conversao = temperatura * 1.8 + 32;
        System.out.printf("A temperatura em F° é: %.2f ", conversao);
    }
}
