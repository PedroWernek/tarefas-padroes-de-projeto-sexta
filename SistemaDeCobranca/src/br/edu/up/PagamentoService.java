package br.edu.up;

public class PagamentoService {

    public void processarPagamento(PagamentoFactory pagamentoFactory, double valorDaTransacao) throws Exception {
        IPagamento pagamento = pagamentoFactory.criarPagamento();

        if (pagamento.processarPagamento(valorDaTransacao)) {
            System.out.println("Pagamento processado com sucesso");
        } else {
            System.out.println("Erro ao processar o pagamento");
        }
    }
}
