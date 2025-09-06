package br.edu.up;

public class PagamentoCartaoCredito implements IPagamento {

    public int numCartao;

    public PagamentoCartaoCredito(int numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public boolean processarPagamento(double valorDaTransação) {
        return validacao();
    }

    @Override
    public boolean validacao() {
        return this.numCartao == 16;
    }

}
