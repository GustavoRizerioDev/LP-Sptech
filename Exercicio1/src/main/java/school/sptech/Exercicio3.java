package school.sptech;

public class Exercicio3 {
    public static void main(String[] args) {
        Integer valorUnitarioDoProduto = 10;
        Integer quantidadeDoProdutoVedida = 2;
        Integer valorPagoPeloCliente = 150;

        Integer valorTotalDoProduto = valorUnitarioDoProduto * quantidadeDoProdutoVedida;
        Integer troco = valorPagoPeloCliente - valorTotalDoProduto;

        System.out.printf("Seu troco será de R$%d", troco);
    }
}
