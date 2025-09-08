package pacote;

import java.util.Scanner;

public class exemploSwitchCaseExpression {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer num = teclado.nextInt();

        String diaDaSemanda = switch (num) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Digite um dia válido";
        };

        System.out.println(diaDaSemanda);

        diaDaSemanda = switch (num) {
            case 1: yield "Domingo";
            case 2: yield "Segunda-feira";
            case 3: yield "Terça-feira";
            case 4: yield "Quarta-feira";
            case 5: yield "Quinta-feira";
            case 6: yield "Sexta-feira";
            case 7: yield "Sábado";
            default: yield "Digite um dia válido";
        };

    }
}