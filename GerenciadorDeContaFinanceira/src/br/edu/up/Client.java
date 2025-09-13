package br.edu.up;

public class Client {

    public String name;
    public AccountManager account;

    public void depositar(String accountId, double value) {
        account.depositar(accountId, value);
    }

    public void sacar(String accountId, double value) {
        account.depositar(accountId, value);
    }
}
