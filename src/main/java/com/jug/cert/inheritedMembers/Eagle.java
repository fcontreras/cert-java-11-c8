package com.jug.cert.inheritedMembers;

//Overriding a method - FIRST RULE

// The first rule of overriding a method is somewhat self-explanatory. If two methods have the same name but different
// signatures, the methods are overloaded, not overridden
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

// TIP: Any time you see a method on the exam with the same name as a method in the parent class,
// determine whether the method is being overloaded or overridden first; doing so will help you with
// questions about whether the code will compile
public class Eagle extends Bird {

    //Overload
    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    //Override
//    public int eat(int food) { // DOES NOT COMPILE
//        System.out.println("Bird is eating " + food + " units of food");
//        return food;
//    }
}