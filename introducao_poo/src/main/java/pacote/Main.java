package pacote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        BilheteUnico bilheteUnico = new BilheteUnico();
        bilheteUnico.estudante = false;
        bilheteUnico.idoso = false;
        bilheteUnico.numero = "001";
        bilheteUnico.nomeTitular = "Kauan";
        bilheteUnico.saldo = 0.0;

        BilheteUnico bilheteUnico2 = new BilheteUnico();
        bilheteUnico2.estudante = false;
        bilheteUnico2.idoso = false;
        bilheteUnico2.numero = "002";
        bilheteUnico2.nomeTitular = "André";
        bilheteUnico2.saldo = 0.0;

        BilheteUnico bilheteUnico3 = new BilheteUnico();
        bilheteUnico3.estudante = true;
        bilheteUnico3.idoso = false;
        bilheteUnico3.numero = "003";
        bilheteUnico3.nomeTitular = "André";
        bilheteUnico3.saldo = 100.0;
//
//        bilheteUnico.exibirExtrato();
//        Double valorRecarga = teclado.nextDouble();
//        bilheteUnico.recarregar(valorRecarga);
//        bilheteUnico.exibirExtrato();
//
//        bilheteUnico2.exibirExtrato();
//        valorRecarga = teclado.nextDouble();
//        bilheteUnico2.recarregar(valorRecarga);
//        bilheteUnico2.exibirExtrato();

        bilheteUnico3.exibirExtrato();
        bilheteUnico3.cobrarPassagem();
        bilheteUnico3.exibirExtrato();

    }
}
