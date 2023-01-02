package com.solvd.bank.Client;

import com.solvd.bank.Exceptions.JuniorAgeException;
import com.solvd.bank.Exceptions.SeniorAgeException;

import java.util.Objects;

public class JuniorClient extends Client {
    private String parentAccount;

    public JuniorClient(){
    }

    public JuniorClient(String name, int age, int bankBalance, String parentAccount){
        super(name, age, bankBalance);
        this.parentAccount = parentAccount;
    }

    public void setParentAccount(String parentAccount){
        this.parentAccount = parentAccount;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void AgeCheck() throws JuniorAgeException {
        if(this.getAge() > 18){
            throw new JuniorAgeException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JuniorClient that = (JuniorClient) o;
        return Objects.equals(parentAccount, that.parentAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentAccount);
    }

    @Override
    public String toString() {
        return "JuniorClient{" +
                "parentAccount='" + parentAccount + '\'' +
                '}';
    }

}

