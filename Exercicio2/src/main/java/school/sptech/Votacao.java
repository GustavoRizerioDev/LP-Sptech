package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer numeroSorteado = 0;
        Integer i = 0;
        Integer saborMussarela = 0;
        Integer saborCalabresa = 0;
        Integer saborQueijo = 0;
        String mensagem = "";

        do{
            i++;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0 ,3);

            if (numeroSorteado == 1) {
                saborMussarela++;
            } else if (numeroSorteado == 2){
                saborCalabresa++;
            } else{
                saborQueijo++;
            }
        } while (i != 10);

        if (saborMussarela > saborCalabresa && saborMussarela > saborCalabresa){
            mensagem = "Mussarela é o Sabor favorito";
        } else if (saborCalabresa > saborMussarela && saborCalabresa > saborMussarela ) {
            mensagem = "Calabresa é o sabor favorito";
        } else{
            mensagem = "Queijo é o sabor favorito";
        }

        System.out.printf("Votos Mussarela: %d \n Votos Calabresa: %d \n Votos Queijo: %d \n", saborMussarela, saborCalabresa, saborQueijo);
        System.out.printf("Sabor favorito: %s", mensagem);

    }
}
