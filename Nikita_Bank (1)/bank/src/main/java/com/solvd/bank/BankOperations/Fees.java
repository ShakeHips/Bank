package com.solvd.bank.BankOperations;

public enum Fees {
    TRANSACTIONFEE(2),
    WITHDRAWFEE(4),
    CREDITFEE(1);

    final int fee;

    Fees (int fee){
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
