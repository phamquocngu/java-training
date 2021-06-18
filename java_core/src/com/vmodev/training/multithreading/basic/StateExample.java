package com.vmodev.training.multithreading.basic;

public class StateExample {
    public static void main(String[] args) {
        MyTask t = new MyTask();
        t.setName("Thread1");
        runExampleThread(t);
    }

    static void runExampleThread(Thread t) {
        printState("thread before start()", t);
        t.start();
        printState("thread start() called", t);
        printState("main thread sleeping for 0.5 sec", t);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printState("main thread woke up", t);
    }

    static void printState(String msg, Thread t) {
        System.out.printf("%s - %s state: %s%n", msg, t.getName(),
                t.getState());
    }

    private static class MyTask extends Thread {

        @Override
        public void run() {
            printState("thread run() started", this);
            //doing something
            for (int i = 0; i < 100; i++) {
                Math.random();
            }
            printState("thread is finishing", this);
        }
    }
}
