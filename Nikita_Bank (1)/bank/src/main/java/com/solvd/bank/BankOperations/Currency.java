package com.solvd.bank.BankOperations;

public enum Currency {
    DOLLAR("Avaiable"),
    EURO("Avaiable"),
    HRYVNA("Avaiable"),
    BTC("Not avaiable");

    final String isAvaiable;

     Currency (String isAvaiable){
        this.isAvaiable = isAvaiable;
    }

    public String getIsAvaiable() {
        return isAvaiable;
    }
}
