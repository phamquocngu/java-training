package com.vmodev.training.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTraining3 {
    public static void main(String[] args) throws InterruptedException {
        Map<Demo, String> hashMap = new HashMap<>();
        Demo d = new Demo("1");
        Demo d2 = new Demo("2");
        hashMap.put(d, "VMO");
        hashMap.put(d2, "VMO2");

        System.out.println("HashMap: " + hashMap);

        d = null;
        System.gc();

        System.out.println("HashMap: " + hashMap);
    }
}
