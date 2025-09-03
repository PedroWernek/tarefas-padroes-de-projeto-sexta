package br.edu.up;

public class FactoryApplePay extends PagamentoFactory {

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoApplePay();
    }

}
