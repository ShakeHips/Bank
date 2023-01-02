package com.solvd.bank.Employee;

import java.util.Objects;

public class Consultant extends Employee implements IGreet {
    private String clientNames;

    public Consultant(){
    }

    public Consultant(String name, int age, int salary, String clientNames){
        super(name, age, salary);
        this.clientNames = clientNames;
    }

    public void setClientNames(String clientNames){
        this.clientNames = clientNames;
    }

    public String getClientNames(){
        return clientNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(clientNames, that.clientNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientNames);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "clientNames='" + clientNames + '\'' +
                '}';
    }
}
