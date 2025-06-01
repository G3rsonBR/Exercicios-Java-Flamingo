package lista11For;

public class NumsPrimosEntre1A100 {
    public static void main(String[] args) {
        int totalPrimos = 0;
        for (int i = 2; i <= 100; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                totalPrimos++;
                System.out.println(i + " é primo");
            }
        }
        System.out.println("Total de números primos entre 1 e 100: " + totalPrimos);
    }
}
