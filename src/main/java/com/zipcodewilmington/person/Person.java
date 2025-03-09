package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;



    public static void main (String[] args) {

        Person person = new Person();

    }

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "Leon";
        this.age = 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }



}













