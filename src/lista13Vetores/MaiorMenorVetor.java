package lista13Vetores;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        int[] vetor = {15, 2, 9, 27, 6};
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
