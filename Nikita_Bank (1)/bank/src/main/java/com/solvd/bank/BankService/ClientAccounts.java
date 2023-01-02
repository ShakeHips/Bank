package com.solvd.bank.BankService;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Scanner;

import com.solvd.bank.BankOperations.BankAccount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClientAccounts {
    static Logger logger = LogManager.getLogger(ClientAccounts.class);
    private static ArrayList<BankAccount> clientAccounts = new ArrayList<>();


    public ClientAccounts(){
    }

    public ArrayList<BankAccount> getClientAccounts(){
        return clientAccounts;
    }



    public static RandomAccess create() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Hello, would you like to create an account?");
        String decision = scanner.nextLine();


        if (decision.equals("Yes")) {
            System.out.println("What is your name");
            String name = scanner.nextLine();

            System.out.println("Please enter the amount for your starting balance");
            int balance = scanner.nextInt();

            System.out.println("Please enter your starting credit limit");
            double limit = scanner.nextInt();

            System.out.println("Enter Phone Number");
            scanner.nextLine();
            String number = scanner.nextLine();

            BankAccount account = new BankAccount(
                    balance,
                    name,
                    limit,
                    number
            );

            clientAccounts.add(account);

        } else if (decision.equals("No")) {
            System.out.println("Thanks for your time");
        } else {
            System.out.println("Please answer with a Yes or No ");
        }
        return clientAccounts.get(clientAccounts.size()-1);
    }
}
