package br.edu.up;

public interface IPagamento {

    boolean processarPagamento(double valorDaTransacao);

    boolean validacao();
}
