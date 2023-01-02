package com.solvd.bank;

import com.solvd.bank.BankOperations.Currency;
import com.solvd.bank.BankService.ClientAccounts;
import com.solvd.bank.BankService.GenerateInfo;
import com.solvd.bank.BankService.Start;
import com.solvd.bank.Client.JuniorClient;
import com.solvd.bank.Client.SeniorClient;
import com.solvd.bank.Exceptions.SeniorAgeException;
import com.solvd.bank.Reflection.Reflection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
//        Start newApp = new Start();
//        newApp.start();

//        SeniorClient newClient = new SeniorClient("David", 73, 50000,2000);
//        Reflection fieldz = new Reflection();
//        fieldz.printFields(newClient);
//        fieldz.invokeMethod(newClient);
//        fieldz.changeName(newClient);
//        System.out.println(newClient.getPension());

    }
}