package pacote;

public class BilheteUnico {

    String numero;
    String nomeTitular;
    Double saldo;
    Boolean estudante;
    Boolean idoso;

    void recarregar(Double valorRecarga) {
        if (valorRecarga != null || valorRecarga >= 5.0 || valorRecarga <= 520.0) {
            saldo += valorRecarga;
            System.out.println("Recarga realizada com sucesso!");
        } else {
            System.out.println("Valor inválido para recarga");
        }
    }

    void exibirExtrato() {

        System.out.println("Nome:" + nomeTitular);
        System.out.println("Extrato bilhete:" + saldo);
    }

    void cobrarPassagem() {

        Double tarifa = 5.20;

        if (idoso) {
            tarifa = 0.0;
        } else if (estudante) {
            tarifa /= 2;
        }

        if (saldo >= tarifa) {
            saldo -= tarifa;
            System.out.println("""
                    Passagem liberada!
                    """);
        } else {
            System.out.println("""
                    Saldo insuficiente!
                    """);
        }
    }
}
