package jackson.rocha;

import java.util.Objects;

public class CarrinhoDeCompra {

    Produto produto;
    int quantidadeItens;

    void adicionarItem(Produto produto, int quantidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado");

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        System.out.printf("Produto %s%n", produto.nome);
        System.out.printf("Produto %s%n", produto.precoUnitario);
    }

    void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Endereço de entrega deve ser informado");

        criarNovoPedido(enderecoEntrega);
    }

    void gerarPedido() {
        criarNovoPedido(null);
    }

    private void criarNovoPedido(Endereco enderecoEntrega) {
    }
}
