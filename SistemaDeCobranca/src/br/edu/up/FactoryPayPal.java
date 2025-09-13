package br.edu.up;

public class FactoryPayPal extends PagamentoFactory {
    private final String email;

    public FactoryPayPal(String email) {
        this.email = email;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPayPal(this.email);
    }

}
