package lista03;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura correspondente em Celsius é: " + celsius);
    }
}
