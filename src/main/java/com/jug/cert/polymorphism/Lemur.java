package com.jug.cert.polymorphism;

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        // System.out.println(hasTail.age); //Does not compile
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        //System.out.println(primate.isTailStriped()); //Does not compile
        System.out.println(primate.hasHair());

        //Reassign keeps the object in memory
        Object lemurAsObject = lemur;

        //1. The type of the object determines which properties exist within the object in memory.
        //2. The type of the reference to the object determines which methods and variables are accessible
        // to the Java program.


        //Casting objects
        Primate primate2 = new Lemur(); // Implicit Cast
//        Lemur lemur2 = primate; // DOES NOT COMPILE
//        System.out.println(lemur2.age);
        Lemur lemur3 = (Lemur)primate; // Explicit Cast
        System.out.println(lemur3.age);
    }
}