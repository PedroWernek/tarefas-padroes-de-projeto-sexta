package br.edu.up;

public class FactoryCriptomoeda extends PagamentoFactory {

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCriptomoeda();
    }

}
