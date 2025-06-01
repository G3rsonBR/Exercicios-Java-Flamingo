package lista13Vetores;

import java.util.Arrays;

public class OrdenarVetorCrescente {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 6};
        Arrays.sort(vetor);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

    }
}
