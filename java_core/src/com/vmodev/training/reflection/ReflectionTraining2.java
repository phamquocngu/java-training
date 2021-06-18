package com.vmodev.training.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTraining2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //Change private variable
        User user = new User("oldName", "123456", "vmo@gmail.com");
        System.out.println(user);
        Class<?> cl = user.getClass();
        Field field = cl.getDeclaredField("username");
        field.setAccessible(true);
        field.set(user,"newName");
        System.out.println(user);
        System.out.println("******************************************");
        //Invoke private method
        Method method = cl.getDeclaredMethod("helloWorld", null);
        method.setAccessible(true);
        method.invoke(user, null);
    }
}
