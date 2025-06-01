package lista13Vetores;

public class ContarParesVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 7, 10, 13, 16};
        int contPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) contPares++;
        }
        System.out.println("Quantidade de números pares: " + contPares);
    }
}
