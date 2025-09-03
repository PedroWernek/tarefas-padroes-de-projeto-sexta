package br.edu.up;

public class FactoryCartaoCredito extends PagamentoFactory {

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }

}
