package br.edu.up;

import java.util.List;

public class Client {

    public String name;
    public static AccountManager account;
    public String accountId;

    public static void acessarConta(List<Account> accounts) {
        Client.account = AccountManager.getInstance(accounts);
    }

    public void depositar(double value) {
        account.depositar(this.accountId, value);
    }

    public void sacar(double value) {
        account.sacar(this.accountId, value);
    }
}
