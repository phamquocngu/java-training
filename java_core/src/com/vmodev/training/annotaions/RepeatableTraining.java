package com.vmodev.training.annotaions;

public class RepeatableTraining {

    @Role("user")
    @Role("amdin")
    public class NoRepeatable {
    }

    @Roles({@Role("user"), @Role("admin")})
    public class Repeatable {
    }

    public static void main(String[] args) {
        Role[] noReRoles = NoRepeatable.class.getAnnotationsByType(Role.class);
        Role[] reRoles = Repeatable.class.getAnnotationsByType(Role.class);

        for (Role role : noReRoles) {
            System.out.println(role.value());
        }

        System.out.println("*********************");
        for (Role role : reRoles) {
            System.out.println(role.value());
        }
    }
}