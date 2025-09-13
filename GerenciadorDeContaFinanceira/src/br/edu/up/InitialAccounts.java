package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class InitialAccounts {

    public static List<Account> getAccounts() {
        List<Account> contas = new ArrayList<>();

        // Criando clientes e suas contas com o construtor
        Client c1 = new Client("Pedro", "ACC001");
        Client c2 = new Client("Maria", "ACC002");
        Client c3 = new Client("João", "ACC003");
        Client c4 = new Client("Ana", "ACC004");
        Client c5 = new Client("Carlos", "ACC005");
        Client c6 = new Client("Fernanda", "ACC006");
        Client c7 = new Client("Lucas", "ACC007");
        Client c8 = new Client("Juliana", "ACC008");
        Client c9 = new Client("Rafael", "ACC009");
        Client c10 = new Client("Camila", "ACC010");

        // Criando contas e associando clientes
        contas.add(createAccount(c1));
        contas.add(createAccount(c2));
        contas.add(createAccount(c3));
        contas.add(createAccount(c4));
        contas.add(createAccount(c5));
        contas.add(createAccount(c6));
        contas.add(createAccount(c7));
        contas.add(createAccount(c8));
        contas.add(createAccount(c9));
        contas.add(createAccount(c10));

        return contas;
    }

    private static Account createAccount(Client client) {
        Account account = new Account(client.accountId, client);
        return account;
    }
}
