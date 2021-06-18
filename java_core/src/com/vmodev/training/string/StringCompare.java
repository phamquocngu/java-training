package com.vmodev.training.string;

public class StringCompare {
    public static final int NUM_OF_ITEM = 100000;

    public static void main(String[] args) {

        // Concat string using String Object
        long start = System.currentTimeMillis();
        stringConcat();
        long end = System.currentTimeMillis();
        System.out.println("time taken by String : " + (end-start) + " milliseconds");

        // Concat string using StringBuilder
        start = System.currentTimeMillis();
        stringBuilder();
        end = System.currentTimeMillis();
        System.out.println("time taken by StringBuilder : " + (end-start) + " milliseconds");

        // Concat string using StringBuffer
        start = System.currentTimeMillis();
        stringBuffer();
        end = System.currentTimeMillis();
        System.out.println("time taken by StringBuffer : " + (end-start) + " milliseconds");
    }

    public static String stringConcat() {
        String res = "";
        for (int i = 0; i < NUM_OF_ITEM; i++) {
            res += i;
        }
        return res;
    }

    public static String stringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NUM_OF_ITEM; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String stringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < NUM_OF_ITEM; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
