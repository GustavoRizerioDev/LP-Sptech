package school.sptech;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer tempoEmMinutosQuePassouAquecendo = 10;
        Integer tempoEmMinutosQueFezExerciciosAerobicos = 20;
        Integer tempoEmMinutosQueFezMusculacao = 60;

        Integer caloriasQuePerdeuAquecendo = tempoEmMinutosQuePassouAquecendo * 12;
        Integer caloriasQuePerdeuAerobico = tempoEmMinutosQueFezExerciciosAerobicos * 20;
        Integer caloriasQuePerdeuMusculacao = tempoEmMinutosQueFezMusculacao * 25;

        Integer quantidadeTotalDeMinutosExercitando = tempoEmMinutosQueFezExerciciosAerobicos + tempoEmMinutosQueFezMusculacao + tempoEmMinutosQuePassouAquecendo;
        Integer quantidadeTotalDeCaloriasPerdidas = caloriasQuePerdeuAerobico + caloriasQuePerdeuAquecendo + caloriasQuePerdeuMusculacao;


        System.out.printf("Olá, Jorge. Você fez um total de %d minutos em exercícios e perdeu cerca de %d calorias", quantidadeTotalDeMinutosExercitando, quantidadeTotalDeCaloriasPerdidas);
    }
}
