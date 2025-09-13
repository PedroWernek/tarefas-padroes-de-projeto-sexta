package br.edu.up;

public class Account {

    public String accountId;
    public double saldo;
    public Client client;

    public Account(String accountId, Client client) {
        this.accountId = accountId;
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("accountId=").append(accountId);
        sb.append("\nsaldo= R$").append(saldo);
        sb.append(client.toString()).append('\n');
        return sb.toString();
    }
}
