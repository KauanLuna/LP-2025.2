package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Goiaba");
        frutas.add("Melão");

        System.out.println(frutas);

//        Lista criada com list.of não pode ser alterada.
        List<String> frutasComvalores = List.of("Abacaxi", "Acerola", "CuzCuz", "Foguetão");

        System.out.println(frutasComvalores);

//        frutasComvalores.add("Banana");

//        Essa lista pode ser alterada, já que o list.of está dentro do ArrayList.
        List<String> frutasComvaloresFuncional = new ArrayList<>(List.of("Abacaxi", "Acerola", "CuzCuz", "Foguetão"));

//        Para inserir uma lista dentro de outra essa deve ser a syntax, deve ser adicionado o addAll
        frutasComvaloresFuncional.addAll(frutas);

//        Para adicionar no começo da lista
        frutasComvaloresFuncional.addFirst("Jabuticaba");

//        Adicionando no index desejado
        frutasComvaloresFuncional.add(5, "Tangerina");

//        Alterando o valor no index e adicionando um valor novo
        frutasComvaloresFuncional.set(5, "Morango do amor");

//        Removendo valor da lista (utilizando, valor ou o indice)
        frutasComvaloresFuncional.remove("Morango do amor");

        System.out.println(frutasComvaloresFuncional.get(2));
        System.out.println(frutasComvaloresFuncional.size());

        for (int i = 0; i < frutasComvaloresFuncional.size(); i++) {
            System.out.println(frutasComvaloresFuncional.get(i));
        }

        for (int i = frutasComvaloresFuncional.size() - 1; i >= 0; i--) {
            System.out.println(frutasComvaloresFuncional.get(i));
        }

        System.out.println("----------------");

        for (String frutinha : frutasComvaloresFuncional) {
            System.out.println(frutinha);
        }
    }
}
