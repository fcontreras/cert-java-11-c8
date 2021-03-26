package com.jug.cert.inheritedMembers;

import java.util.List;

public class EarlyBird {
    void sing1(List<?> v) {} // unbounded wildcard
    void sing2(List<? super String> v) {} // lower bounded wildcard
    void sing3(List<? extends String> v) {} // upper bounded wildcard
}