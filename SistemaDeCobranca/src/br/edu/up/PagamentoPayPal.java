package br.edu.up;

public class PagamentoPayPal implements IPagamento {

    public String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean processarPagamento(double valorDaTransação) {
        return validacao();
    }

    @Override
    public boolean validacao() {
        return (this.email.isEmpty());
    }

}
