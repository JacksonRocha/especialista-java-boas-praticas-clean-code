package jackson.rocha;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;


        carrinho.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.lagradouro = "Rua das Amoras";
        endereco.numeor = "1000";
        endereco.bairro = "Centro";

        carrinho.gerarPedido();
    }
}


