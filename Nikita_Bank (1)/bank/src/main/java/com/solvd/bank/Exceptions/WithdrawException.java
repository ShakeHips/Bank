package com.solvd.bank.Exceptions;

public class WithdrawException extends RuntimeException{
    public WithdrawException() {super ("Balance is too low"); }

    public WithdrawException(String message) {super (message); }
}
