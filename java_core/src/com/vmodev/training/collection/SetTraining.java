package com.vmodev.training.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTraining {
    public static void main(String[] args) {
        //HashSet
        Set<String> hasSets = new HashSet<>();
        hasSets.add("VMO");
        hasSets.add("TRAINING");
        hasSets.add("JAVA");
        hasSets.add("CORE");
        System.out.println(hasSets);
        System.out.println("***********************");
        //LinkedHashSet
        Set<String> linSets = new LinkedHashSet<>();
        linSets.add("VMO");
        linSets.add("TRAINING");
        linSets.add("JAVA");
        linSets.add("CORE");
        System.out.println(linSets);
        System.out.println("***********************");
        //TreeMap
        Set<String> treeSets = new TreeSet<>();
        treeSets.add("VMO");
        treeSets.add("TRAINING");
        treeSets.add("JAVA");
        treeSets.add("CORE");
        System.out.println(treeSets);
        System.out.println("***********************");
        //Performance
        long start = System.nanoTime();
        Set<Integer> hasSet1 = new HashSet<>();
        for(int i=0; i<1000; i++) {
            hasSet1.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Total time to insert"
                + " 1000 elements in"
                + " HashSet in nanoseconds: " + (end-start));

        start = System.nanoTime();
        Set<Integer> linSet1 = new LinkedHashSet<>();
        for(int i=0; i<1000; i++) {
            linSet1.add(i);
        }
        end = System.nanoTime();
        System.out.println("Total time to insert"
                + " 1000 elements in"
                + " LinkedHashSet in nanoseconds: " + (end-start));

        start = System.nanoTime();
        Set<Integer> treeSet1 = new TreeSet<>();
        for(int i=0; i<1000000; i++) {
            treeSet1.add(i);
        }
        end = System.nanoTime();
        System.out.println("Total time to insert"
                + " 1000 elements in"
                + " TreeSet in nanoseconds: " + (end-start));

        // HashSet performance Test
        // inserting 1000 elements
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hasSet1.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Total time to remove"
                + " 1000 elements in"
                + " HashSet in nanoseconds: "
                + (endTime - startTime));

        // LinkedHashSet performance Test
        // remove 1000 elements

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linSet1.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to remove"
                + " 1000 elements in"
                + " LinkedHashSet nanoseconds: "
                + (endTime - startTime));

        // TreeSet performance Test inserting 1000 objects

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeSet1.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to remove"
                + " 1000 elements in"
                + " TreeSet in nanoseconds: "
                + (endTime - startTime));
    }
}
