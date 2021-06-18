package com.vmodev.training.multithreading.exceptionhandler;

public class Demo
{
    public static void main(String[] args)
    {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }
}
