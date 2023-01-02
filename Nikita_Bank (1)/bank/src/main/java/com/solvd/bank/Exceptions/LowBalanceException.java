package com.solvd.bank.Exceptions;

public class LowBalanceException extends RuntimeException {
    public LowBalanceException(){
        super("Your balance is too low for this transaction");
    }

    public LowBalanceException(String message){
        super(message);
    }
}
