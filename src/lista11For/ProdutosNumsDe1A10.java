package lista11For;

public class ProdutosNumsDe1A10 {
    public static void main(String[] args) {
        int produto = 1;
        for (int i = 1; i <= 10; i++) {
            produto *= i;
        }
        System.out.println("Produto de 1 a 10: " + produto);
    }
}
