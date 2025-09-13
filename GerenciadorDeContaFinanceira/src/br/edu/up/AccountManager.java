package br.edu.up;

import java.util.List;

public class AccountManager {

    private static AccountManager instance;

    private final List<Account> accounts;

    private AccountManager(List<Account> accounts) {
        this.accounts = accounts;
    }

    public static AccountManager getInstance(List<Account> accounts) {
        if (AccountManager.instance == null) {
            AccountManager.instance = new AccountManager(accounts);
        }
        return AccountManager.instance;
    }

    public void depositar(String accountId, double valor) {
        Account account = findAccount(accountId);

        if (account != null) {
            account.saldo += valor;
        }
    }

    public void sacar(String accountId, double valor) {
        Account account = findAccount(accountId);

        if (account != null) {
            account.saldo -= valor;
        }
    }

    public double verSaldo(String accountId) {
        Account account = findAccount(accountId);

        if (account != null) {
            return account.saldo;
        }

        return 0;
    }

    public List<Account> listarContasAtivas() {
        return this.accounts;
    }

    private Account findAccount(String accountId) {
        for (Account account : this.accounts) {
            if (account.accountId.equals(accountId)) {
                return account;
            }
        }
        return null;
    }
}
