package lista06SwitchCase;

import java.util.Scanner;

/* Esse exercício pede Switch Case, porém, ele não é bom para intervalos, por tanto, utilizei if-else para tal */

public class CategoriaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Categoria: Criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Adolescente.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Categoria: Adulto.");
        } else if (idade >= 65 && idade <= 120) {
            System.out.println("Categoria: Idoso.");
        } else {
            System.out.println("Idade inválida.");
        }

        input.close();
    }
}

