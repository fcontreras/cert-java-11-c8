package com.jug.cert.constructors;

public class Hamster {

    private String color;
    private int weight;

    public Hamster(int weight) {
        this.weight = weight;
        color = "brown";
    }

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

//    public Hamster(int weight) {
//        Hamster(weight, "brown"); // DOES NOT COMPILE, missing "new"
//    }

//    public Hamster(int weight) {
//        new Hamster(weight, "brown"); // Compiles, but incorrect, cause two objects are created
//    }

    // Correct
//    public Hamster(int weight) {
//        //"this" needs to be the first line in the constructor
//        //hence, it can only be used once.
//        this(weight, "brown");
//    }

    public static void main(String... args) {
        var hamster = new Hamster(12);
        System.out.println("Hamster { color: " + hamster.color + ", weight: " + hamster.weight + "}");
    }
}
