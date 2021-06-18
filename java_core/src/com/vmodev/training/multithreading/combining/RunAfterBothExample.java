package com.vmodev.training.multithreading.combining;

import java.util.concurrent.CompletableFuture;

public class RunAfterBothExample {
    public static void main(String[] args) {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(
                () -> System.out.println("In first stage"));
        CompletableFuture<Void> otherCf = CompletableFuture.runAsync(
                () -> System.out.println("In second stage"));
        cf.runAfterBoth(otherCf, () -> System.out.println("after both stages"));
        cf.join();
    }
}
