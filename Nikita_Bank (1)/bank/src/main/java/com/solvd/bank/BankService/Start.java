package com.solvd.bank.BankService;

import com.solvd.bank.BankOperations.BankAccount;
import com.solvd.bank.BankOperations.Transaction;
import com.solvd.bank.Client.Client;
import com.solvd.bank.Exceptions.SeniorAgeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Start {
    private static final Logger logger = LogManager.getLogger(Start.class);

    private Client client;
    private Transaction transaction;
    private BankAccount bankAccount;
    private GenerateInfo clients;
    private boolean isLogged = true;
    private boolean notLogged;
    private BankAccount loggedAccount;
    private BankAccount toAccount;

    public static List<BankAccount> generateBankAccounts(){
        return List.of(
                new BankAccount(350,"Joe",0,"3805172111"),
                new BankAccount(15,"Joesh",10000,"3805172532"),
                new BankAccount(150000,"Will",5000,"3805342122"),
                new BankAccount(11000,"David",4500,"3805178910"),
                new BankAccount(2100,"Andrew",1122,"3805175671"),
                new BankAccount(4500,"Dima",3344,"3805171899"),
                new BankAccount(7000,"Thom",1111,"3805175588"),
                new BankAccount(50020,"Jack",900,"3805176189")
        );
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        notLogged = true;
        while (notLogged) {
            logger.info("\n Hello,to start please login or register " +
                    "\n1. Registration" +
                    "\n2. Login" +
                    "\n3. Exit");
            int result = scanner.nextInt();
            switch (result) {
                case 1:
                    bankAccount = (BankAccount) ClientAccounts.create();
                    afterLogging(bankAccount);
                    notLogged = false;
                    break;
                case 2:
                    System.out.println("Enter your phone number");
                    scanner.nextLine();
                    String enterNumber = scanner.nextLine();
                    List<BankAccount> loggedClient = (List<BankAccount>) generateBankAccounts().stream().filter(
                                        bankAccount ->  bankAccount.getNumber().equals(enterNumber))
                                .collect(Collectors.toList());
                    if(loggedClient.isEmpty()){
                        System.out.println("Could not find an account");
                        break;
                    } else {
                        System.out.println(loggedClient);
                        loggedAccount = loggedClient.get(0);
                        afterLogging(loggedAccount);
                        notLogged = false;
                        break;
                    }
                case 3:
                    System.out.println("Closing the operation");
                    System.exit(0);
                default: System.out.println("Please type in the correct number!");
            }
        }
    }
    public void afterLogging(BankAccount loggedBank){
        System.out.println(loggedBank.getBalance());
        while (isLogged) {
           Scanner scanner = new Scanner(System.in);
           logger.info("\n Hello " +
                    "\n1. Withdraw money from account " +
                    "\n2. Put money to an account " +
                    "\n3. Send money to a different account " +
                    "\n4. Logout");
            int result = scanner.nextInt();
            System.out.println(loggedBank);
            switch (result) {
                case 1:
                    loggedBank.withdraw();
                    break;
                case 2:
                    loggedBank.increaseBalance();
                    break;
                case 3:
//                    System.out.println("Enter the phone number of reciever");
//                    scanner.nextLine();
//                    String reciever = scanner.nextLine();
//                    System.out.println("How much do you want to send");
//                    int sum = scanner.nextInt();
//                    List<BankAccount> getter = (List<BankAccount>) generateBankAccounts().stream().filter(
//                                    bankAccount ->  bankAccount.getNumber().equals(reciever))
//                            .collect(Collectors.toList());
//                    toAccount = getter.get(0);
//                    Transaction newTransaction = new Transaction(loggedBank, toAccount, sum);
//                    newTransaction.checkBalance();
//                    break;
                case 4:
                    start();
                default: System.out.println("Please type in the correct number!");
            }
        }
   }
}






