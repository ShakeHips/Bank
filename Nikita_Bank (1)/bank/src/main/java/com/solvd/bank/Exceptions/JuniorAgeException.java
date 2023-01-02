package com.solvd.bank.Exceptions;

public class JuniorAgeException extends Exception{
    public JuniorAgeException(){
        super("Junior clients can't be over 18 years old");
    }

    public JuniorAgeException(String message){
        super(message);
    }
}