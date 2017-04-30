package com.medium.dependencyInjection.constructor;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("IN CONSTRUCTOR  WITHOUT PARAM");
        // for setter injetcion ... this is mandaatory as it is a part of object initalisation
    }

    public Student(String name) {
        super();
        this.name = name;
    }
    public Student(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +   "name='" + name + '\'' +  ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}