package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
//create the class
public class Person {
    private String name;
    private int age;
//    private int height;
//    private String nation;
//    private String gender;
//    private String hairColor;
//    private int yearWorked;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

//        this.height = height;
//        this.nation = nation;
//        private String gender;
//        private String hairColor;
//       private int yearWorked;


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
//No idea here
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
