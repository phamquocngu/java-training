package com.vmodev.training.annotaions;

public class AnnotationTraining {

    @Deprecated
    public void oldPrint(String str) {
        System.out.println(str);
    }

    public void newPrint(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "OverrideAnnotation";
    }
}
