package com.company;// Java Program to implement 
// Java Abstraction 

// Abstract Class declared 
abstract class Animals {
    private String name;

    public Animals(String name) { this.name = name; }

    public abstract void makeSound();

    public String getName() { return name; }
}

// Abstracted class 
class Dogs extends Animals {
    public Dogs(String name) { super(name); }

    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}

// Abstracted class 
class Cats extends Animal {
    public Cats(String name) { super(name); }

    public void makeSound()
    {
        System.out.println(getName() + " meows");
    }

    private boolean getName() {
    }
}

// Driver Class 
public class ch53_Abstract {
    // Main Function 
    public static void main(String[] args)
    {
        Animals myDog = new Dogs("Buddy");
//        Animals myCat = new Cats("Fluffy");

        myDog.makeSound();
//        myCat.makeSound();
    }
}
