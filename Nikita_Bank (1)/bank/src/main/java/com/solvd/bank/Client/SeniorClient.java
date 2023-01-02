package com.solvd.bank.Client;

import com.solvd.bank.Exceptions.SeniorAgeException;

import java.util.Objects;

public class SeniorClient extends Client{
    private int pension;

    public SeniorClient(){
    }

    public SeniorClient(String name, int age, int bankBalance, int pension){
        super(name, age, bankBalance);
        this.pension = pension;
    }

    public void setPension(int pension){
        this.pension=pension;
    }

    public int getPension() {
        return pension;
    }

    public void AgeCheck() throws SeniorAgeException {
        if(this.getAge() < 55){
            throw new SeniorAgeException("Senior client must be over 55 years of age");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeniorClient that = (SeniorClient) o;
        return pension == that.pension;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pension);
    }

    @Override
    public String toString() {
        return "SeniorClient{" +
                "pension=" + pension +
                '}';
    }
    private void balanceGetter(){
        System.out.println(this.pension);
    }
}
