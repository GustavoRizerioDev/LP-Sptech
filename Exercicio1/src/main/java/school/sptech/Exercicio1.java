package school.sptech;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer quantidadeDeFilhosEntre0e3 = 2;
        Integer quantidadeDeFilhosEntre4e16 = 1;
        Integer quantidadeDeFilhosEntre17a18 = 0;
        Double valorDoBolsaFamiliaDeFilhosEntre0e3 = 25.12 * quantidadeDeFilhosEntre0e3;
        Double valorDoBolsaFamiliaDeFilhosEntre4a16 = 15.88 * quantidadeDeFilhosEntre4e16;
        Double valorDoBolsaFamiliaDeFilhosEntre17a18 = 12.44 * quantidadeDeFilhosEntre17a18;

        Double valorTotalDoBolsaFamilia =  valorDoBolsaFamiliaDeFilhosEntre4a16 +
        valorDoBolsaFamiliaDeFilhosEntre0e3 + valorDoBolsaFamiliaDeFilhosEntre17a18;

        Integer quantidadeTotalDeFilhos = quantidadeDeFilhosEntre0e3 +
                quantidadeDeFilhosEntre4e16 +
                quantidadeDeFilhosEntre17a18;

        System.out.printf("Você tem um total de %d e vai receber R$%.2f de bolsa", quantidadeTotalDeFilhos, valorTotalDoBolsaFamilia);

    }
}
