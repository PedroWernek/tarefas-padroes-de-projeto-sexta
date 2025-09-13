package br.edu.up;

public class FactoryCriptoMoeda extends PagamentoFactory {

    private final double saldoConta;

    public FactoryCriptoMoeda(double saldoConta){
        this.saldoConta = saldoConta;
    }
    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCriptoMoeda(saldoConta);
    }

}
