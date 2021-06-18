package com.vmodev.training.string;

public class StringCreation {

    public static void main(String[] args) {
        // Initialization time for String
        // Literal
        long start1 = System.nanoTime();

        for (int i = 0; i < 10000000; i++)
        {
            String s1 = "Literal1";
            String s2 = "Literal2";
        }

        long end1 = System.nanoTime();
        long total_time = end1 - start1;

        System.out.println("Time taken to execute"+ " string literal = " + total_time);

        // Initialization time for String
        // object
        long start2 = System.nanoTime();

        for (int i = 0; i < 10000000; i++)
        {
            String s3 = new String("NewObject3");
            String s4 = new String("NewObject4");
        }

        long end2 = System.nanoTime();
        long total_time1 = end2 - start2;

        System.out.println("Time taken to execute"+ " string object = " + total_time1);


        String s1 = "VMO";
        String s2 = "VMO";
        String s3 = new String("VMO");
        String s4 = new String("VMO");
        String s5 = s3.intern();

        System.out.println("s1 compare s2 using ==: " + (s1==s2));
        System.out.println("s1 compare s3 using ==: " + (s1==s3));
        System.out.println("s3 compare s4 using ==: " + (s3==s4));
        System.out.println("s1 compare s5 using ==: " + (s1==s5));
        System.out.println("s3 compare s5 using ==: " + (s3==s4));
     }
}
