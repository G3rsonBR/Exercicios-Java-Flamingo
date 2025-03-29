package lista02;
import java.util.Scanner;

public class EquacaoQuadratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, raiz1, raiz2;

        System.out.print("Digite o valor de a: ");
        a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = input.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f\n", raiz1, raiz2);
        } else if (delta == 0) {
            raiz1 = -b / (2 * a);
            System.out.printf("A raiz da equação é: x = %.2f\n", raiz1);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-delta) / (2 * a);
            System.out.printf("As raízes são complexas: x1 = %.2f + %.2fi e x2 = %.2f - %.2fi\n", parteReal, parteImaginaria, parteReal, parteImaginaria);
        }
    }
}
