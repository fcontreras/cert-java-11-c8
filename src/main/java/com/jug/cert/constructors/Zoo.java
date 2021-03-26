package com.jug.cert.constructors;

class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
//        super(); //Does not compile
    }
}

class Zoo2 {

    public Zoo2() {
        super();
        System.out.println("Zoo created");
//        super(); // DOES NOT COMPILE
    }
}