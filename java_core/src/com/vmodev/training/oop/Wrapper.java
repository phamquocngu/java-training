package com.vmodev.training.oop;

public class Wrapper {
    public static void main(String[] args) {
        //Cache Integer
        Integer int1 = 127; //autoboxing: Integer.valueOf(127);
        Integer int2 = 127;
        Integer int3 = 128;
        Integer int4 = 128;
        Integer int5 = -128;
        Integer int6 = -128;
        Integer int7 = -129;
        Integer int8 = -129;


        System.out.println("compare int1 vs int2: " + (int1==int2));
        System.out.println("compare int3 vs int4: " + (int3==int4));
        System.out.println("compare int5 vs int6: " + (int5==int6));
        System.out.println("compare int7 vs int8: " + (int7==int8));

        //Cache Long
        Long long1 = 127L; //autoboxing: Long.valueOf(127L);
        Long long2 = 127L;
        Long long3 = 128L;
        Long long4 = 128L;
        Long long5 = -128L;
        Long long6 = -128L;
        Long long7 = -129L;
        Long long8 = -129L;

        System.out.println("compare long1 vs long2: " + (long1==long2));
        System.out.println("compare long4 vs long4: " + (long3==long4));
        System.out.println("compare long5 vs long6: " + (long5==long6));
        System.out.println("compare long7 vs long8: " + (long7==long8));

    }
}
