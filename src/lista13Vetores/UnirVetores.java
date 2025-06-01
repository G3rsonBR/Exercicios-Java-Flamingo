package lista13Vetores;

public class UnirVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int[] uniao = new int[vetor1.length + vetor2.length];

        for (int i = 0; i < vetor1.length; i++) {
            uniao[i] = vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            uniao[vetor1.length + i] = vetor2[i];
        }

        System.out.println("União dos vetores:");
        for (int i = 0; i < uniao.length; i++) {
            System.out.print(uniao[i] + " ");
        }
        System.out.println();
    }
}
