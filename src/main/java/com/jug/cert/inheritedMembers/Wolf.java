package com.jug.cert.inheritedMembers;

//Overriding method
class Canine {

    public double getAverageWeight() {
        return 50;
    }

}

public class Wolf extends Canine {


    // 1. The method in the child class must have the same signature as the method in the parent class.
    // 2. The method in the child class must be at least as accessible as the method in the parent class.
    // 3. The method in the child class may not declare a checked exception that is new or broader than the class of any exception declared in the parent class method.
    // 4. If the method returns a value, it must be the same or a subtype of the method in the parent class, known as covariant return types.

    //SubType != SubClass?
    //X and Y are classes, and X is a subclass of Y.
    //X and Y are interfaces, and X is a subinterface of Y.
    //X is a class and Y is an interface, and X implements Y (either directly or through an inherited class).
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20; //Super required, else StackOverflowError at runtime
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}