package com.jug.cert.inheritedMembers;

class Camel2 {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

public class DromedaryCamel extends Camel2 {
    private int getNumberOfHumps() {
        return 1;
    }
}