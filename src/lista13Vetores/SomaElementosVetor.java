package lista13Vetores;

public class SomaElementosVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma dos elementos: " + soma);
    }
}
