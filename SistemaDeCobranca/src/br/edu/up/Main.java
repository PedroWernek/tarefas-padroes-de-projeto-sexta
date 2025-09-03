package br.edu.up;

public class Main {

    public static void main(String[] args) {
        PagamentoService cliente = new PagamentoService();

        double valorDaTransacao = 1000;
        PagamentoFactory pagamentoFactory = new FactoryCartaoCredito();

        cliente.processarPagamento(pagamentoFactory, valorDaTransacao);
        // como que eu faço para colocar o email dentro do Paypal?
        // como que eu faço para colocar o valor do saldo dentro de CriptoMoeda?
        // como que eu faço para colocar o numero do cartão dentro de CartãoCredito?
    }

}
