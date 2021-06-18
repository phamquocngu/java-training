package com.vmodev.training.enums;

public enum Direction {
    // enum define
    EAST(0, "E") {
        @Override
        public String printDirection() {
            return "You are moving in east. You will face sun in morning time";
        }
    }, WEST(180, "W"){
        @Override
        public String printDirection() {
            return "You are moving in west. You will face sun in evening time";
        }
    }, NORTH(90, "N"){
        @Override
        public String printDirection() {
            return "You are moving in north. You will face head in daytime";
        }
    }, SOUTH(270, "S"){
        @Override
        public String printDirection() {
            return "You are moving in south. Sea ahead";
        }
    };

    //abstract method
    public abstract String printDirection();

    // constructor
    private Direction(final int angle, final String shortKey) {
        this.angle = angle;
        this.shortKey = shortKey;
    }

    // internal state
    private int angle;
    private String shortKey;

    public int getAngle() {
        return angle;
    }

    public String getShortKey() {
        return shortKey;
    }
}
