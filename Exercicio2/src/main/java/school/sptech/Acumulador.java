package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numeroAleatorios = 0;
        Integer somaDosNumeros = 0;

        do {
            numeroAleatorios = ThreadLocalRandom.current().nextInt(0 ,11);
            somaDosNumeros += numeroAleatorios;
        } while (numeroAleatorios != 0);

        System.out.printf("A soma dos números é %d", somaDosNumeros);
    }
}
