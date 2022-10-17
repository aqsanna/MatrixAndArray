package com.company;

public class BankAccount {
    public static int count = 0;
    private String account;
    private int balance;

    BankAccount() {
        count++;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount("2470015714010010");
        bankAccount.setBalance(1000000);
        System.out.println(bankAccount.addBalance(50000));
        System.out.println(bankAccount.withdrawalBalance(14000));
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(count);


    }

    public String getAccount() {
        return this.account;
    }

    public BankAccount setAccount(String account) {
        this.account = account;
        return this;
    }

    public int getBalance() {
        return this.balance;
    }

    public BankAccount setBalance(int balance) {
        this.balance = balance;
        System.out.println("original account balance : " + balance);
        return this;
    }

    public int addBalance(int amount) {
        balance += amount;
        System.out.println("after add balance : ");
        return balance;
    }

    public int withdrawalBalance(int amount) {
        balance -= amount;
        System.out.println("final account balance : " + balance);
        return balance;
    }
}
