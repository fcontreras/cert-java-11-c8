package com.jug.cert.inheritedMembers;

class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }

    protected String getColor() {
        return "grey, black, or white";
    }
}

public class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }

    // DOES NOT COMPILE
//    public CharSequence getColor() {
//        return "grey";
//    }
}
