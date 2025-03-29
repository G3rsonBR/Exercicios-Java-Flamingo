package lista06SwitchCase;

import java.util.Scanner;

public class MesEEstacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mes;

        System.out.print("Digite um número de 1 a 12 para o mês: ");
        mes = input.nextInt();

        String estacao = "";
        String nomeMes = "";

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Outono";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                System.out.println("Número inválido. Digite um número de 1 a 12.");
                break;
        }

        if (!nomeMes.equals("")) {
            System.out.println("Mês: " + nomeMes);
            System.out.println("Estação: " + estacao);
        }

    }
}
