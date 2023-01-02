package com.solvd.bank.BankService;
import com.solvd.bank.Client.JuniorClient;
import com.solvd.bank.Client.BankAccount;
import com.solvd.bank.Client.SeniorClient;
import com.solvd.bank.Employee.FinanceWorker;
import com.solvd.bank.Employee.SecurityWorker;
import com.solvd.bank.Exceptions.JuniorAgeException;
import com.solvd.bank.Exceptions.SeniorAgeException;

import java.util.*;
import java.util.stream.Collectors;


public class GenerateInfo {
    public GenerateInfo() {
    }

    public static List<BankAccount> generateBankAccounts(){
        return List.of(
                new BankAccount("Jack",24,5000,"3806652347"),
                new BankAccount("David",27,1000,"3806652342"),
                new BankAccount("Jack",24,7000,"3806621345")
        );
    }

    public static List<FinanceWorker> generateFinanceWorker(){
        return List.of(
                new FinanceWorker("Jack",24,50000,7),
                new FinanceWorker("David",27,50000,9),
                new FinanceWorker("Thom",29,50000,2)
        );
    }

    public static Set<SeniorClient> SeniorClientGenerator() throws SeniorAgeException {
        Set<SeniorClient> seniorClients = new HashSet<>();
        seniorClients.add(new SeniorClient("Andrew", 70, 11000,4700));
        seniorClients.add(new SeniorClient("Bill", 70, 9000,10000));
        seniorClients.add(new SeniorClient("Mark", 70, 258000,6000));
        seniorClients.add(new SeniorClient("Anthony", 70, 115000,1000));
        seniorClients.add(new SeniorClient("James", 70, 2345000,2700));
        return seniorClients;
    }
    public static Set<JuniorClient> JuniorClientGenerator() throws JuniorAgeException {
        Set<JuniorClient> juniorClients = new HashSet<>();
        juniorClients.add(new JuniorClient("Andrew", 14, 11000,""));
        juniorClients.add(new JuniorClient("Bill", 13, 9000,""));
        juniorClients.add(new JuniorClient("Mark", 12, 258000,""));
        juniorClients.add(new JuniorClient("Anthony", 11, 115000,""));
        juniorClients.add(new JuniorClient("James", 16, 2345000,""));
        return juniorClients;
    }

    public static ArrayList<SecurityWorker> SecurityWorkerGenerator() {
        ArrayList<SecurityWorker> securityWorkers = new ArrayList<>();
        securityWorkers.add(new SecurityWorker("Andrew", 24, 11000,""));
        securityWorkers.add(new SecurityWorker("Tommy", 30, 9000,""));
        securityWorkers.add(new SecurityWorker("Alex", 30, 258000,""));
        securityWorkers.add(new SecurityWorker("Anthony", 30, 115000,""));
        securityWorkers.add(new SecurityWorker("James", 40, 2345000,""));
        return securityWorkers;
    }
//Streams
    //sort by balance
    List<BankAccount> sorted = generateBankAccounts().stream()
            .sorted(Comparator.comparing(bankAccount -> bankAccount.getbankBalance()))
            .collect(Collectors.toList());

    //check if bigger than 0
    boolean salaryCheck = SecurityWorkerGenerator().stream()
        .allMatch(securityWorker -> securityWorker.getSalary() > 0);

    //check if there's someone who would match
    boolean personCheck = SecurityWorkerGenerator().stream()
            .anyMatch(securityWorker -> securityWorker.getName().equals("Sasha"));

    //Find Maximum balance
    Optional<BankAccount> biggestBalance = generateBankAccounts().stream()
            .max(Comparator.comparing(BankAccount::getbankBalance));

    //Find Minimum balance
    Optional<BankAccount> smallestBalance = generateBankAccounts().stream()
            .min(Comparator.comparing(BankAccount::getbankBalance));
}
