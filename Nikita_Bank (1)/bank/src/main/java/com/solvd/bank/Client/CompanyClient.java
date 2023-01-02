package com.solvd.bank.Client;

import java.util.Objects;

public class CompanyClient extends Client{
    private String companyName;

    public CompanyClient(){
    }

    public CompanyClient(String name, int age, int bankBalance, int pension, String companyName){
        super(name, age, bankBalance);
        this.companyName = companyName;
    }

    public void setCompanyName(String parentAccount){
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyClient that = (CompanyClient) o;
        return Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName);
    }

    @Override
    public String toString() {
        return "CompanyClient{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
