package br.edu.up;

import java.util.List;

public class AccountManager {

    private static AccountManager instance;

    private final List<Account> accounts;

    private AccountManager(List<Account> accounts, double saldo) {
        this.accounts = accounts;
        for (Account account : this.accounts) {
            account.saldo = saldo;
        }
    }

    public static AccountManager getInstance(List<Account> accounts, double saldo) {
        if (AccountManager.instance == null) {
            AccountManager.instance = new AccountManager(accounts, saldo);
        }
        return AccountManager.instance;
    }

    public void depositar(String accountId, double valor) {
        Account account = findAccount(accountId);

        if (account != null) {
            account.saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Conta não encontrada");
        }
    }

    public void sacar(String accountId, double valor) {
        Account account = findAccount(accountId);

        if (account != null) {
            if (account.saldo >= valor) {
                account.saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta não encontrada");
        }
    }

    public double verSaldo(String accountId) {
        Account account = findAccount(accountId);

        if (account != null) {
            return account.saldo;
        }

        return 0;
    }

    public void listarContasAtivas() {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }

    public Account findAccount(String accountId) {
        for (Account account : this.accounts) {
            if (account.accountId.equals(accountId)) {
                return account;
            }
        }
        return null;
    }
}
