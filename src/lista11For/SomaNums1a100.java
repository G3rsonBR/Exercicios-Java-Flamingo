package lista11For;

public class SomaNums1a100 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100: " + soma);
    }
}
