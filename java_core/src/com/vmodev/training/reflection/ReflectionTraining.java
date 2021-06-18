package com.vmodev.training.reflection;

import javax.jws.soap.SOAPBinding;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTraining {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        Class clazz = User.class;
        Class clazz = Class.forName("com.vmodev.training.reflection.User");
        //Get metadata of class
        //Get fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + " type: " + f.getType());
        }
        System.out.println("**************************************");
        //Get methods
        Method[] methods = User.class.getMethods();
        for (Method m :methods) {
            System.out.println(m.getName() + " return type: " + m.getReturnType());
        }
        System.out.println("**************************************");
        //Get Constructors
        Constructor<?>[] constructors = User.class.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName());
        }
        System.out.println("**************************************");
        //Get Annotations
        Annotation[] annotations = User.class.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a.getClass().getName());
        }
    }
}
