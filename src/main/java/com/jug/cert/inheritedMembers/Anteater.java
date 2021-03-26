package com.jug.cert.inheritedMembers;

import java.util.ArrayList;
import java.util.List;

class LongTailAnimal {
    //1
    //3 Not Override
//    protected void chew(List<Object> input) {
//    }

    //2 Solution
    protected void chew(List<String> input) {
    }
}

public class Anteater extends LongTailAnimal {

    //1 DOES NOT COMPILE
//    protected void chew(List<Double> input) {
//    }

    //2 Solution
    protected void chew(List<String> input) {
    }

    //2 Not Override
    protected void chew(ArrayList<Double> input) {
    }


}