package lista07While;
public class SomaCemPrimeirosNums {
    public static void main(String[] args) {
        int soma = 0, i = 1;

        System.out.printf("Apresenta o total da soma dos cem primeiros números inteiros (1+2+3+...+100):\n");

        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.printf("Total da soma: %d\n", soma);
    }
}
