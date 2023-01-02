package com.solvd.bank.Exceptions;

public class SeniorAgeException extends Exception{
    public SeniorAgeException(){
        super("Senior clients must be over 55 years old");
    }

    public SeniorAgeException(String message){
        super(message);
    }
}
