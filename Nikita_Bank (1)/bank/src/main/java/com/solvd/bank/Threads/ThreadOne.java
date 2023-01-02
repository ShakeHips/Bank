package com.solvd.bank.Threads;

public class ThreadOne extends Thread {

    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
        }
    }
}
