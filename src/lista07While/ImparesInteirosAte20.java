package lista07While;


public class ImparesInteirosAte20 {
    public static void main(String[] args) {
        int i = 0;

        System.out.printf("Apresenta os valores inteiros ímpares na faixa de 0 a 20:\n");

        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.printf("%d é ímpar\n", i);
            }
            i++;
        }
    }
}