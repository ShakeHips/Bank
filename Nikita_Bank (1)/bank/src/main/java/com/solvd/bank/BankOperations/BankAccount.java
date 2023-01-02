package com.solvd.bank.BankOperations;

import com.solvd.bank.Client.Client;
import com.solvd.bank.Client.IAddtoBalance;
import com.solvd.bank.Client.IWithdraw;

import java.util.Objects;
import java.util.RandomAccess;
import java.util.Scanner;

public class BankAccount extends Client implements RandomAccess, IWithdraw, IAddtoBalance {
    private int balance;
    private String owner;
    private double creditLimit;

    private String number;

    BankAccount() {
    }

    public BankAccount(int balance, String owner, double creditLimit, String number) {
        this.balance = balance;
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return balance == that.balance && Double.compare(that.creditLimit, creditLimit) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, owner, creditLimit);
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "balance=" + balance +
                ", owner='" + owner + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }

    @Override
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to withdraw cash");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("Enter the amount");
            int sum = scanner.nextInt();
            int newBalance = this.balance - sum;
            this.balance = newBalance;
            System.out.println("Current balance is " + this.balance);
        } else {
            System.out.println("Closing the operation");
        }
    }

    @Override
    public void increaseBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to put money on your account");
        String answer = scanner.nextLine().toLowerCase();
        if(answer.equals("yes")){
            System.out.println("Enter the amount");
            int sum = scanner.nextInt();
            int newBalance = this.balance + sum;
            this.balance = newBalance;
            System.out.println("Current balance is " + this.balance);
        } else {
            System.out.println("Closing the operation");
        }
    }
}
