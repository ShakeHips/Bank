package com.solvd.bank.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        //Multithreading
//        ThreadOne threadExample = new ThreadOne();
//        ThreadOne threadExampleTwo = new ThreadOne();
//
//        threadExample.start();
//        threadExampleTwo.start();

        //Deadlock
//        Deadlock locking = new Deadlock();
//        locking.runLock();

        // pool
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable processor = new ThreadTwo(2);
        executor.execute(processor);

        Runnable processor2 = new ThreadTwo(3);
        executor.execute(processor2);

        Runnable processor3 = new ThreadTwo(4);
        executor.execute(processor3);
        executor.shutdown();
    }
}
