package com.solvd.bank.BankOperations;

import com.solvd.bank.Client.BankAccount;
import com.solvd.bank.Exceptions.WithdrawException;

public class Transaction {
    private BankAccount fromClient;
    private BankAccount toClient;
    private int amount;

public Transaction(BankAccount fromClient, BankAccount toClient, int sum){
    this.fromClient = fromClient;
    this.toClient = toClient;
    this.amount = amount;
}
    public void checkBalance(){
        if(fromClient.getbankBalance() < amount){
            throw new WithdrawException();
        } else {
            int fromBalance = fromClient.getbankBalance();
            int toBalance = toClient.getbankBalance();
            fromBalance -= amount;
            toBalance += amount;
            System.out.println("From " + fromBalance + " " + "To" + toBalance);
        }
    }

    public BankAccount getFromClient() {
        return fromClient;
    }

    public void setFromClient(BankAccount fromClient) {
        this.fromClient = fromClient;
    }

    public BankAccount getToClient() {
        return toClient;
    }

    public void setToClient(BankAccount toClient) {
        this.toClient = toClient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
