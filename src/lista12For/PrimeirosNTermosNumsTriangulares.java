package lista12For;
import java.util.Scanner;

public class PrimeirosNTermosNumsTriangulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        System.out.println("Série de números triangulares:");
        for (int i = 1; i <= N; i++) {
            int triangular = (i * (i + 1)) / 2;
            System.out.println(triangular);
        }
    }
}
