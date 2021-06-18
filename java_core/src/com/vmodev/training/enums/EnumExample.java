package com.vmodev.training.enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumExample {
    public static void main(String[] args) {
        //Enum Contructor
        Direction north = Direction.NORTH;
        System.out.println(north);                         //NORTH
        System.out.println(north.name());                  //NORTH
        System.out.println(north.ordinal());               //2
        System.out.println(north.getAngle());              //90
        System.out.println(north.getShortKey());           //N

        //EnumSet
        EnumSet<Direction> enumSet = EnumSet.of(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);
        System.out.println(enumSet);

        //EnumMap
        EnumMap<Direction, String> enumMap = new EnumMap<Direction, String>(Direction.class);
        enumMap.put(Direction.NORTH, Direction.NORTH.printDirection());
        enumMap.put(Direction.EAST, Direction.EAST.printDirection());
        enumMap.put(Direction.SOUTH, Direction.SOUTH.printDirection());
        enumMap.put(Direction.WEST, Direction.WEST.printDirection());
        System.out.println(enumMap);
    }
}
