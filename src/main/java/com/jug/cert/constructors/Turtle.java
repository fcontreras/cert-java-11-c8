package com.jug.cert.constructors;

//Constructors overloading
public class Turtle {
    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }

    String getName() {
        return name;
    }
}

class Donatello extends Turtle {
    //Default constructor will be created automatically during compile steps to the .class file
    // And ONLY exist if you do not supply any constructor
}