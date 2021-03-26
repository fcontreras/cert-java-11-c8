package com.jug.cert.inheritedMembers;

import java.io.FileNotFoundException;
import java.io.IOException;

// Unchecked are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked,
// so it is not forced by the compiler to either handle or specify the exception.
// It is up to the programmers to be civilized, and specify or catch the exceptions.
// In Java exceptions under Error and RuntimeException classes are unchecked exceptions,
// everything else under throwable is checked.
class Reptile {
    protected void sleepInShell() throws IOException {
    }

    //Unchecked exceptions Error or subclass of RuntimeException
    protected void hideInShell() throws NumberFormatException {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

public class GalapagosTortoise extends Reptile {
    public void sleepInShell() throws FileNotFoundException {
    }

    public void hideInShell() throws IllegalArgumentException {
    }

    // DOES NOT COMPILE
//    public void exitShell() throws IOException {
//    }
}
