package com.jug.cert.polymorphism;

class Penguin {
    public int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.print(this.getHeight());
    }
}

public class EmperorPenguin extends Penguin {
    public int getHeight() {
        return 8;
    }

    public static void main(String[] fish) {
        new EmperorPenguin().printInfo();
    }
}

//Add static to getHeight in Penguin and thy this will print 3
class CrestedPenguin extends Penguin {
//    public static int getHeight() {
//        return 8;
//    }

    public static void main(String... fish) {
        new CrestedPenguin().printInfo();
    }
}