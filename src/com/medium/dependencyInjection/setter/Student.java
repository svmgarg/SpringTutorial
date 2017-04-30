package com.medium.dependencyInjection.setter;


public class Student {
    private String name;
    private String phoneNumber;
    private int age;

    private Address address;


    public Student(String name, String phoneNumber, int age, Address address) {
        super();
        System.out.println("IN CONSTRUCTOR WITH PARAM");
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    public Student() {
        System.out.println("IN CONSTRUCTOR  WITHOUT PARAM");
        // for setter injetcion ...
        // this is mandaatory as it is a part of object initalisation
    }

    public Student(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + ", address=" + address + "]";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        System.out.println("IN GETTER ");
        return name;
    }

    public void setName(String name) {
        this.name = name;

        System.out.println("IN SETTER ");
    }

    public void displayInfo() {
        System.out.println("Hello: " + name);
    }
}