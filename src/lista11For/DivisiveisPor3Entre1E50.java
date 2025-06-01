package lista11For;

public class DivisiveisPor3Entre1E50 {
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                cont++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3 entre 1 e 50: " + cont);
    }
}
