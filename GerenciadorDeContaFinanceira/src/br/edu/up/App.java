package br.edu.up;

public class App {

    public static void main(String[] args) throws Exception {
        AccountManager accountManager = AccountManager.getInstance(InitialAccounts.getAccounts(), 2000);

        accountManager.listarContasAtivas();

        Client client = accountManager.findAccount("ACC001").client;
        client.acessarConta(accountManager);

        client.depositar(100);
        client.sacar(2000);

    }
}
