package school.sptech;

import java.util.Arrays;

public class ExemploVetores {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[10];
        Integer[] numerosComValores = new Integer[]{10, 20, 30, 40, 3, 7, 10, 2};

        numeros[1] = 10;

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosComValores));

//        Exemplo de código errado
//        numeros[10] = 30;

        numerosComValores[1] = 40;
        System.out.println(Arrays.toString(numerosComValores));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }


    }
}
