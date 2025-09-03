package br.edu.up;

public class FactoryPayPal extends PagamentoFactory {

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPayPal();
    }

}
