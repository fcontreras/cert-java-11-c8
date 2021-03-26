package com.jug.cert.constructors;

public class MouseHouse {
    private final int volume;
    private final String type;

    private final String name = "The Mouse House";

    {
        volume = 10;
    }

    public MouseHouse() {
        this.type = "tree-house";
    }
}