package com.vmodev.training.oop;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

class Employee implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public Employee() throws InterruptedException {
        System.out.println("Employee Constructor Called...");
        TimeUnit.SECONDS.sleep(1L);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return String.format("Employee{name='%s'}", name); }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}