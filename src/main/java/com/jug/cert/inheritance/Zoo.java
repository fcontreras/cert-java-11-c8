package com.jug.cert.inheritance;

// Exactly equals to
// public class Zoo extends java.lang.Object {}
public class Zoo {
}

class Main {
    private static Zoo zoo;

    public static void main(String... args ){
        //Initializer
        zoo = new Zoo();
        System.out.println(zoo.toString());
        // zoo.equals();
    }
}


// All objects inherit from Object
//
//     ----------------
//     java.lang.Object
//     -------^--------
//            |
//          -----
//           Zoo
//          --^--
//            |
//        ----------
//        OtherClass
//        ----------
//