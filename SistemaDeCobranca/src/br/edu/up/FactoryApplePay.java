package br.edu.up;

public class FactoryApplePay extends PagamentoFactory {
    private final double saldoConta;
    
    public FactoryApplePay(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoApplePay(this.saldoConta);
    }

}
