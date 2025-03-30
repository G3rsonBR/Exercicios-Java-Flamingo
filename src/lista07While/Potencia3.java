package lista07While;

public class Potencia3 {
    public static void main(String[] args) {
        int resultado = 1, i = 0;

        System.out.printf("Apresenta as potências de 3 variando do expoente 0 até o expoente 15:\n");

        while (i <= 15) {
            if (i == 0) {
                resultado = 1;
            } else {
                resultado *= 3;
            }

            System.out.printf("3^%d = %d\n", i, resultado);
            i++;
        }
    }
}
