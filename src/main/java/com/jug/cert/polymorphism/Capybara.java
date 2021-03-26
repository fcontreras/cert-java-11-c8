package com.jug.cert.polymorphism;

class Rodent {
}


//Class Cast exception
// When reviewing a question on the exam that involves casting and polymorphism,
// be sure to remember what the instance of the object actually is. Then, focus on
// whether the compiler will allow the object to be referenced with or without explicit casts.
public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent;

        //Instanceof
        if(rodent instanceof Capybara) {
            Capybara capybara2 = (Capybara)rodent;
        }
    }

}
