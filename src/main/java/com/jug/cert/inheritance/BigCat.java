package com.jug.cert.inheritance;

//Super Class or Parent Class
public class BigCat {
    //public, private & protected
    public double size;
}

// SubClass or Child Class
class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.println(size);
    }
}