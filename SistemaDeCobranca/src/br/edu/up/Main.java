package br.edu.up;

public class Main {

    public static void main(String[] args) {
        PagamentoService cliente = new PagamentoService();

        double valorDaTransacao = 1000;
        PagamentoFactory pagamentoFactory = new FactoryCartaoCredito("137587453");

        try {
            cliente.processarPagamento(pagamentoFactory, valorDaTransacao);
        } catch (Exception e) {
            System.out.println(e);
        }
        // como que eu faço para colocar o email dentro do Paypal?
        // como que eu faço para colocar o valor do saldo dentro de CriptoMoeda?
        // como que eu faço para colocar o numero do cartão dentro de CartãoCredito?
    }

}
