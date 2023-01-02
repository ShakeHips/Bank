package com.solvd.bank.Client;

import com.solvd.bank.Employee.Human;
import com.solvd.bank.Exceptions.WithdrawException;

import java.util.Objects;
import java.util.Scanner;

public abstract class Client extends Human implements IWithdraw, IAddtoBalance {
    private int balance;


    public Client(){
    }

    public Client(String name, int age, int bankBalance){
        super(name, age);
        this.balance = bankBalance;
    }



    public void setbankBalance(){
        this.balance = balance;
    }

    public int getbankBalance() {
        return balance;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return balance == client.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankBalance=" + balance +
                '}';
    }

    @Override
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to withdraw cash");
        String answer = scanner.nextLine().toLowerCase();
        if(answer.equals("yes")){
            System.out.println("Enter the amount");
            int sum = scanner.nextInt();
            int newBalance = this.balance - sum;
            this.balance = newBalance;
            System.out.println("Current balance is " + this.balance);
        } else {
            System.out.println("Closing the operation");
        }
    }

    IWithdraw withdraw = () ->
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to withdraw cash");
        String answer = scanner.nextLine();
        if(answer.equals("Yes")){
            System.out.println("Enter the amount");
            int sum = scanner.nextInt();

            if(this.balance - sum < 0){
                throw new WithdrawException();
            }

            int newBalance = this.balance - sum;
            this.balance = newBalance;
            System.out.println("Current balance is " + this.balance);
        } else {
            System.out.println("Closing the operation");
        }
    };

    @Override
    public void increaseBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to put money on your account");
        String answer = scanner.nextLine();
        if(answer.equals("Yes")){
            System.out.println("Enter the amount");
            int sum = scanner.nextInt();
            int newBalance = this.balance + sum;
            this.balance = newBalance;
            System.out.println("Current balance is " + this.balance);
        } else {
            System.out.println("Closing the operation");
        }
    }

    private void balanceGetter(){
        System.out.println(this.balance);
    }

}
