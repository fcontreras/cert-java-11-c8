package com.jug.cert.inheritedMembers;

import java.util.ArrayList;
import java.util.List;

public class Mammal {
    public List<CharSequence> play() {
        return null;
    }

    public CharSequence sleep() {
        return "Ogggrrr ZZzzzZZ";
    }
}

class Monkey extends Mammal {
    public ArrayList<CharSequence> play() {
        return null;
    }
}

class Goat extends Mammal {

    // DOES NOT COMPILE
    // Is subtype but doesn't match
//    public List<String> play() {
//        return null;
//    }

    // Does compile
    // Covariant applies to the return type but not the generic
    public String sleep() {
        return "ZZzz";
    }
}
