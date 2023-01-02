package com.solvd.bank.Employee;

public class FinanceWorker extends Employee implements IGreet {
    private int numberClients;

    public FinanceWorker() {
    }

    public FinanceWorker(String name, int age, int salary, int numberClients) {
        super(name, age, salary);
        this.numberClients = numberClients;
    }

    public void setNumberClients(int numberClients) {
        this.numberClients = numberClients;
    }

    public int getNumberClients() {
        return numberClients;
    }
}
