package br.edu.up;

public class PagamentoApplePay implements IPagamento {

    public double saldoConta;
    public double valorDaUltimaTransacao;

    
    public PagamentoApplePay(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public boolean processarPagamento(double valorDaTransacao) {
        this.valorDaUltimaTransacao = valorDaTransacao;
        return validacao();
    }

    @Override
    public boolean validacao() {
        return this.saldoConta > this.valorDaUltimaTransacao;
    }

}
