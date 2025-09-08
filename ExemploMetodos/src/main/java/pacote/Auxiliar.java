package pacote;

public class Auxiliar {

    void mostrarBacon() {
        System.out.println("🥓");
    }

    Integer somarBacon(Integer n1, Integer n2) {
        Integer soma = n1 + n2;
        System.out.println("N1:" + "🥓".repeat(n1));
        System.out.println("N2:" + "🥓".repeat(n2));
        System.out.println("SOMA:" + "🥓".repeat(soma));

        return soma;
    }

    void mostrarBacon(Integer quantidade) {
        System.out.println("🥓".repeat(quantidade));
    }

    void mostrarComBacon (String mensagem) {
        System.out.println(mensagem + "🥓");
    }

}
