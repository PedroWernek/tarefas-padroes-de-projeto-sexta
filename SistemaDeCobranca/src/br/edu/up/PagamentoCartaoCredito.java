package br.edu.up;

public class PagamentoCartaoCredito implements IPagamento {

    public String numCartao;

    public PagamentoCartaoCredito(String numCartao) throws Exception{
        if(!validacao()){
            throw new Exception("numero inválido");
        }
            this.numCartao = numCartao;
    }

    @Override
    public boolean processarPagamento(double valorDaTransacao) {
        return true;
    }

    @Override
    public final boolean validacao() {
        return this.numCartao.length() == 16;
    }

}
