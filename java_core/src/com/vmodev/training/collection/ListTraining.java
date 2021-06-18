package com.vmodev.training.collection;

import com.vmodev.training.oop.statics.Student;

import java.util.*;

public class ListTraining {
    public static void main(String[] args) {
        Student st1 = new Student("A1", "C1");
        Student st2 = new Student("A2", "C1");
        Student st3 = new Student("A3", "C1");
        Student st4 = new Student("A4", "C1");
        //ArrayList
        List<Student> arList = new ArrayList<>();
        arList.add(st1);
        arList.add(st2);
        arList.add(st3);
        arList.add(st4);
        System.out.println("Index 0: " + arList.get(0));
        System.out.println("Index 1: " + arList.get(1));
        System.out.println("Index 2: " + arList.get(2));
        System.out.println("Index 3: " + arList.get(3));
        System.out.println("*** Replace A4 to A1***");
        arList.add(0, st4);
        System.out.println("Index 0: " + arList.get(0));
        System.out.println("Index 1: " + arList.get(1));
        System.out.println("Index 2: " + arList.get(2));
        System.out.println("Index 3: " + arList.get(3));
        System.out.println("##################################################");

        List<Student> linkList = new LinkedList<>();
        linkList.add(st1); //A1
        linkList.add(st2); //A1 - A2
        System.out.println("Index 0: " + linkList.get(0));
        System.out.println("Index 1: " + linkList.get(1));
        linkList.add(1, st3); //A1-A3-A2
        System.out.println("*** A1-A3-A2 ***");
        System.out.println("Index 0: " + linkList.get(0));
        System.out.println("Index 1: " + linkList.get(1));
        System.out.println("Index 2: " + linkList.get(2));
        System.out.println("*** A4-A1-A3-A2 ***");
        linkList.add(0, st4); //A4-A1-A3-A2
        System.out.println("Index 0: " + linkList.get(0));
        System.out.println("Index 1: " + linkList.get(1));
        System.out.println("Index 2: " + linkList.get(2));
        System.out.println("Index 3: " + linkList.get(3));
        System.out.println("##################################################");

        //Test performance
        List<Student> perArrList = new ArrayList<>();
        List<Student> perLinkList = new LinkedList<>();

        long start;
        long end;
        start = System.currentTimeMillis();
        for (int i=0; i<100000; i++) {
            perArrList.add(st1);
        }
        end = System.currentTimeMillis();
        System.out.println("Performance ArrayList: " + (end-start));

        start = System.currentTimeMillis();
        for (int i=0; i<100000; i++) {
            perLinkList.add(st1);
        }
        end = System.currentTimeMillis();
        System.out.println("Performance LinkedList: " + (end-start));
    }
}
