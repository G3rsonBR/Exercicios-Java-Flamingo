package lista04EstruturaDeDecisao;

import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letra;
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        System.out.print("Digite uma letra: ");
        letra = input.next().charAt(0);

        boolean isVogal = false;
        for (char v : vogais) {
            if (letra == v) {
                isVogal = true;
                break;
            }
        }

        if (isVogal) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
    }
}
