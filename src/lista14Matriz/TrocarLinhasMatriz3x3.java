package lista14Matriz;

import java.util.Scanner;

public class TrocarLinhasMatriz3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

    // Troca da primeira com a última linha
        for (int j = 0; j < 3; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temp;
        }

        System.out.println("Matriz após troca da primeira com a última linha:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
