package lista13Vetores;

import java.util.ArrayList;

public class RemoverElementoVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 4, 2, 5};
        int remover = 2;
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != remover) {
                resultado.add(vetor[i]);
            }
        }
        System.out.println("Vetor após remover " + remover + ": " + resultado);
    }
}
