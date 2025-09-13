package br.edu.up;

public class Client {

    public String name;
    public static AccountManager accountManager;
    public String accountId;

    public Client(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }

    public void acessarConta(AccountManager accountManager) {
        Client.accountManager = accountManager;
    }

    public void depositar(double value) {
        accountManager.depositar(this.accountId, value);
        verSaldo();
    }

    public void sacar(double value) {
        accountManager.sacar(this.accountId, value);
        verSaldo();
    }

    public void verSaldo() {
        System.out.println("Saldo atual: R$" + accountManager.verSaldo(this.accountId));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nname=").append(name);
        sb.append("\naccountId=").append(accountId);
        return sb.toString();
    }

}
