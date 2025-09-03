package br.edu.up;

public class PagamentoCartaoCredito implements IPagamento {

    public int numCartao;

    @Override
    public boolean processarPagamento(double valorDaTransação) {
        return validacao();
    }

    @Override
    public boolean validacao() {
        return this.numCartao == 16;
    }

}
