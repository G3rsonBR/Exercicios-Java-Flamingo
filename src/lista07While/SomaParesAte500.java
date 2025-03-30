package lista07While;

public class SomaParesAte500 {
    public static void main(String[] args) {
        int somaPares = 0, i = 1;

        System.out.printf("Apresenta o somatório dos valores pares na faixa de 1 até 500:\n");

        while (i <= 500) {
            if (i % 2 == 0) {
                somaPares += i;
            }
            i++;
        }

        System.out.printf("Somatório dos pares: %d\n", somaPares);
    }
}
