package lista11For;

public class NumsParesDe1A50 {
    public static void main(String[] args) {
        System.out.print("Números pares de 1 a 50: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i != 50) {
                    System.out.print(", ");
                }
            }
        }
    }
}
