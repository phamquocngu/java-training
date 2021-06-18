package com.vmodev.training.oop.statics;

public class Student {
    private static String SCHOOL = "VMO";
    private String name;
    private String clazz;

    public static String getSCHOOL() {
        return SCHOOL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public static void changeSchool(String newSchool) {
        SCHOOL = newSchool;
    }

    public Student(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + SCHOOL + '\'' +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
