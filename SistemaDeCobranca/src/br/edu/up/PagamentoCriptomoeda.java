package br.edu.up;

public class PagamentoCriptomoeda implements IPagamento {

    public double saldoConta;
    public double valorDaUltimaTransacao;

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
