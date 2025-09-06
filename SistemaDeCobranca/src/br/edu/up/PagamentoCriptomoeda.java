package br.edu.up;

public class PagamentoCriptoMoeda implements IPagamento {

    public double saldoConta;
    public double valorDaUltimaTransacao;

    
    public PagamentoCriptoMoeda(double saldoConta) {
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
