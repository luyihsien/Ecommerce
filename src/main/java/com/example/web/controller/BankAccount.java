package com.example.web.controller;

public class BankAccount {
    //class variable
    static int totalAccounts=0;
    //instance variable
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        //accountNumber、balance is local variable
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("New balance "+balance);
    }
    public boolean withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("After withdraw balance "+balance);
            return true;
        }
        return false;
    }
    public boolean transfer(BankAccount targetAccount,double amount){
        if (withdraw(amount)){
            targetAccount.deposit(amount);
            return true;

        }
        else{
            return false;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
