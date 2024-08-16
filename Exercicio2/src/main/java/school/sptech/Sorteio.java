package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroEscolhido = 7;
        Integer quantidadeDeNumerosImpares = 0;
        Integer quantidadeDeNumerosPares = 0;
        Integer numerosAleatorios = 0;

        for (int i = 0; i < 200; i++) {
            numerosAleatorios = ThreadLocalRandom.current().nextInt(1, 100);
            if (numerosAleatorios == numeroEscolhido){
                System.out.printf("Posiçao do sorteio: %d \n", i);
            }
            if (numerosAleatorios % 2 == 0){
              quantidadeDeNumerosImpares++;
            }
            if (numerosAleatorios % 2 != 0){
                quantidadeDeNumerosPares++;
            }
        }
        System.out.printf("Quantidade de números ímpares: %d \n", quantidadeDeNumerosImpares);
        System.out.printf("Quantidade de números pares: %d \n", quantidadeDeNumerosPares);
    }
}
