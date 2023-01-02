package com.solvd.bank.Client;

import java.util.Objects;

public class BankAccount extends Client {
    private int age;
    private String number;

    public BankAccount(){
    }

    public BankAccount(String name, int age, int bankBalance, String number){
        super(name, age, bankBalance);
        this.number = number;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
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
        if (!super.equals(o)) return false;
        BankAccount that = (BankAccount) o;
        return age == that.age && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, number);
    }

    @Override
    public String toString() {
        return "RegularClient{" +
                "age=" + age +
                ", number='" + number + '\'' +
                '}';
    }


}
