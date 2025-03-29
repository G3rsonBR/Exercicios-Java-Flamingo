package lista03;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anos, meses, dias;

        System.out.print("Digite a idade em anos: ");
        anos = input.nextInt();

        System.out.print("Digite a idade em meses: ");
        meses = input.nextInt();

        System.out.print("Digite a idade em dias: ");
        dias = input.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + totalDias);
    }
}
