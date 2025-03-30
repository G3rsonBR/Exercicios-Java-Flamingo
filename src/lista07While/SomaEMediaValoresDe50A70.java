package lista07While;

public class SomaEMediaValoresDe50A70 {
    public static void main(String[] args) {
        int soma = 0, count = 0, i = 50;
        System.out.printf("Soma e média dos valores pares de 50 a 70:\n");

        while (i <= 70) {
            if (i % 2 == 0) {
                soma += i;
                count++;
            }
            i++;
        }
        double media = soma / (double) count;
        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Média: %.2f\n", media);
    }
}
