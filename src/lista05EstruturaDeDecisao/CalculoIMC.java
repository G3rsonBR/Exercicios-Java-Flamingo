package lista05EstruturaDeDecisao;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite seu peso (kg): ");
        peso = input.nextDouble();

        System.out.print("Digite sua altura (m): ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2.");
        } else {
            System.out.println("Classificação: Obesidade grau 3.");
        }
    }
}
