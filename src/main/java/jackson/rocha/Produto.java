package jackson.rocha;

public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;

    void alterarStatus(boolean ativo) {
        if (ativo) {
            System.out.println("Ativando");

        } else {
            System.out.println("Desativando");
        }

        this.ativo = ativo;
    }

    void ativar() {
        System.out.println("Ativando");
    }

    void desativar() {
        System.out.println("Desativando");
    }
}
