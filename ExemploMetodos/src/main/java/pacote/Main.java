package pacote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auxiliar auxiliar = new Auxiliar();

//        auxiliar.mostrarBacon();
//
//        Integer totalBacons = auxiliar.somarBacon(4, 7);
//
//        auxiliar.somarBacon(totalBacons, 4);
//
//        auxiliar.mostrarBacon(10);

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        auxiliar.mostrarComBacon(nome);

        System.out.print("Quantos bacons: ");
        Integer quantidade = teclado.nextInt();
        auxiliar.mostrarComBacon("Total: " + quantidade);

        System.out.print("Qual a cotação do bacon: ");
        Double precoBacon = teclado.nextDouble();
        Double valorTotal = precoBacon * quantidade;

        auxiliar.mostrarComBacon("Preço total: %.2f".formatted(valorTotal));
    }
}
