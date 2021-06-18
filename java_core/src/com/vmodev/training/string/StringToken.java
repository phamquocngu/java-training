package com.vmodev.training.string;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1, 2, 3, 4, 5", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken().trim());
        }

        //default delim: " \t\n\r\f"
        StringTokenizer st1 = new StringTokenizer("1, 2, \t3\n4\r5\f6");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken().trim());
        }
    }
}
