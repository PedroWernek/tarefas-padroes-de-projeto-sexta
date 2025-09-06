package br.edu.up;

public class FactoryCartaoCredito extends PagamentoFactory {

    private final int numCartao;

    public FactoryCartaoCredito(int numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCartaoCredito(this.numCartao);
    }

}
