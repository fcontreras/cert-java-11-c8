package com.jug.cert.inheritedMembers;

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }

//    public void sneeze() { // DOES NOT COMPILE
//        System.out.println("Panda sneezes quietly");
//    }
//
//    public static void hibernate() { // DOES NOT COMPILE
//        System.out.println("Panda is going to sleep");
//    }
//
//    protected static void laugh() { // DOES NOT COMPILE
//        System.out.println("Panda is laughing");
//    }

    public static void main(String[] args) {
        eat();
    }
}