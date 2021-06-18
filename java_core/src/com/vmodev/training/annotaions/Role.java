package com.vmodev.training.annotaions;

import java.lang.annotation.*;

@Repeatable(Roles.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {
    String value();
}
