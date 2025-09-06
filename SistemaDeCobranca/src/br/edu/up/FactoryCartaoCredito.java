package br.edu.up;

public class FactoryCartaoCredito extends PagamentoFactory {

    private final String numCartao;

    public FactoryCartaoCredito(String numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public IPagamento criarPagamento() throws Exception{

            return new PagamentoCartaoCredito(this.numCartao);

    }

}
