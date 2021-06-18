package com.vmodev.training.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class MapTraining2 {
    public static void main(String[] args) throws InterruptedException {
        Map<Demo, String> wHashMap = new WeakHashMap<>();
        Demo d = new Demo("1");
        Demo d2 = new Demo("2");
        wHashMap.put(d, "VMO");
        wHashMap.put(d2, "VMO2");

        System.out.println("WeakHashMap: " + wHashMap);

        d = null;
        System.gc();

        System.out.println("WeakHashMap: " + wHashMap);
    }
}
