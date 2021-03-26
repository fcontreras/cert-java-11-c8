package com.jug.cert.constructors;

public class Zebra extends Animal {

    public Zebra(int age) {
        //Can only be used as the first line of the constructor
        //hence you can only call "super" OR "this" in one constructor
        //hence you can only use it once.
        super(age); // Refers to constructor in Animal
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }

}

class Animal {
    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}