package lista10DoWhile;

public class SomaDeGraosDeTrigo {
    public static void main(String[] args) {
        double graos = 1, soma = 0;
        int i = 1;

        System.out.printf("Somatório do número de grãos de trigo no tabuleiro de xadrez:\n");

        do {
            soma += graos;
            graos *= 2;
            i++;
        } while (i <= 64);

        System.out.printf("Total de grãos de trigo após 64 quadrados: %.0f\n", soma);
    }
}
