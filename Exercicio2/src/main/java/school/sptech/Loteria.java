package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {




        Integer i = 0;
        String mensagem = "";
        Integer numeroCerto = 5;
        Integer numeroSorteado = 0;

        do{
            numeroSorteado = ThreadLocalRandom.current().nextInt(0 ,11);
            i++;
        } while (numeroCerto != numeroSorteado);

        if (i <= 3){
            mensagem = "Você é MUITO sortudo";
        } else if(i <= 10){
            mensagem = "Você é sortudo";
        } else{
            mensagem = "È melhor você parar de postar e ir trabalhar";
        }

        System.out.println(mensagem);

    }
}
