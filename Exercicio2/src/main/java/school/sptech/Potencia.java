package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Potencia {
    public static void main(String[] args) {
        Integer valorBase = ThreadLocalRandom.current().nextInt(0 ,11);
        Integer valorExpoente = ThreadLocalRandom.current().nextInt(0 ,11);
        int resultado = 1;
        for (int i = 0; i < valorExpoente; i++) {
            resultado *= valorBase;
        }

        System.out.println(resultado);
    }
}
