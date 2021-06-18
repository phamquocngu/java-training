package com.vmodev.training.collection;

import com.vmodev.training.enums.Direction;

import java.util.*;

public class MapTraining {
    public static void main(String[] args) {
        //LinkedHashMap
        Map<String, String> linkedHM = new LinkedHashMap<>();
        linkedHM.put("1", "VMO");
        linkedHM.put("4", "Training");
        linkedHM.put("3", "Java");
        linkedHM.put("2", "Core");
        System.out.println(linkedHM);
        //TreeMap
        Map<String, String> treeM = new TreeMap<>();
        treeM.put("1", "VMO");
        treeM.put("4", "Training");
        treeM.put("3", "Java");
        treeM.put("2", "Core");
        System.out.println(treeM);
        //EnumMap
        Map<Direction,String> enumM = new EnumMap<>(Direction.class);
        enumM.put(Direction.NORTH, Direction.NORTH.printDirection());
        enumM.put(Direction.EAST, Direction.EAST.printDirection());
        enumM.put(Direction.SOUTH, Direction.SOUTH.printDirection());
        enumM.put(Direction.WEST, Direction.WEST.printDirection());
        System.out.println(enumM);
        //IdentityHashMap
        Map<String, String> identityHM = new IdentityHashMap<>();
        identityHM.put("1", "VMO1");
        String key = new String("1");
        identityHM.put(key, "VMO2");
        System.out.println(identityHM);
        System.out.println(identityHM.get("1"));
        System.out.println(identityHM.get(key));
        //WeakHashMap

    }
}
