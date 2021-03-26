package com.jug.cert.creatingClasses;

class Mammal2 {
    String type = "mammal";
}

public class Bat extends Mammal2 {
    String type = "bat";

    public String getType() {
        return super.type + ":" + this.type;
    }

    public static void main(String... zoo) {
        System.out.print(new Bat().getType());
    }
}