package pacote;

import java.util.Scanner;

public class exemploSwitchCaseNovo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer num = teclado.nextInt();

        switch (num) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Digite um dia válido");
        }
    }
}