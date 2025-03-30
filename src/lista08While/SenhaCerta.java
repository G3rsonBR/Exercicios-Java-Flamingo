package lista08While;

import java.util.Scanner;

public class SenhaCerta {
    public static void main(String[] args) {
        String senhaCorreta = "1234", senha;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a senha: ");
        senha = input.nextLine();

        while (!senha.equals(senhaCorreta)) {
            System.out.printf("Senha incorreta! Tente novamente: ");
            senha = input.nextLine();
        }

        System.out.printf("Senha correta! Acesso concedido.\n");
    }
}
