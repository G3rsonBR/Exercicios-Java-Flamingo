package lista11For;

public class Primeiros10NumsFibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("10 primeiros números da sequência de Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
