package lista13Vetores;

public class MediaElementosVetor {
    public static void main(String[] args) {
        double[] vetor = {4.5, 6.0, 7.5, 8.0, 5.5};
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("Média: " + media);
    }
}
