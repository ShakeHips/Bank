package com.solvd.bank.Threads;

public class ThreadTwo implements Runnable {
    private int message;

    public ThreadTwo(int message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" recieved message "+message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName()+" done processing message "+message);
    }

    public void respondToMessage(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
