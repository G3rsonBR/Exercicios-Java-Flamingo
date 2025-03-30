package lista09DoWhile;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        String senhaCorreta = "1234", senha;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a senha: ");
        senha = input.nextLine();

        do {
            if (!senha.equals(senhaCorreta)) {
                System.out.printf("Senha incorreta! Tente novamente: ");
                senha = input.nextLine();
            }
        } while (!senha.equals(senhaCorreta));

        System.out.printf("Senha correta! Acesso concedido.\n");
    }
}
