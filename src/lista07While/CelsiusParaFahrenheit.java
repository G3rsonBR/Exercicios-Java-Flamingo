package lista07While;


public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        int celsius = 10;

        System.out.printf("Conversão de Celsius para Fahrenheit de 10 em 10 graus:\n");

        while (celsius <= 100) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%d°C = %.2f°F\n", celsius, fahrenheit);
            celsius += 10;
        }
    }
}
