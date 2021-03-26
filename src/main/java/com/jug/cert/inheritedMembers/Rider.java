package com.jug.cert.inheritedMembers;

//Overriding methods - 2 RULE

// The method in the child class must be at least as accessible as the method in the parent class.
class Camel {
    public int getNumberOfHumps() {
        return 1;
    }
}

//class BactrianCamel extends Camel {
//    private int getNumberOfHumps() { // DOES NOT COMPILE
//        return 2;
//    }
//}

public class Rider {
    public static void main(String[] args) {
//        Camel c = new BactrianCamel();
//        System.out.print(c.getNumberOfHumps());
    }
}