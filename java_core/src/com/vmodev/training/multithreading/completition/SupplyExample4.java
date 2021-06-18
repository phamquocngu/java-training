package com.vmodev.training.multithreading.completition;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class SupplyExample4 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                URL url = new URL("https://www.example.com/");
                try (InputStream is = url.openStream()) {
                    InputStreamReader isReader = new InputStreamReader(is);
                    //Creating a BufferedReader object
                    BufferedReader reader = new BufferedReader(isReader);
                    StringBuffer sb = new StringBuffer();
                    String str;
                    while((str = reader.readLine())!= null){
                        sb.append(str);
                    }
                    return sb.toString();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).thenAccept(System.out::println)
                .thenRun(() -> System.out.println("Task finished"))
                .join();
    }
}
