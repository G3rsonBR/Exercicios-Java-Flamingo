package lista09DoWhile;

public class ContagemDePares {
    public static void main(String[] args) {
        int i = 2;
        System.out.printf("Exibindo números pares de 2 a 20:\n");

        do {
            System.out.printf("%d\n", i);
            i += 2;
        } while (i <= 20);
    }
}
