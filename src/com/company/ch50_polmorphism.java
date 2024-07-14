package com.company;

// Base class
class Animalsound {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class Dog
class Dogs extends Animalsound {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Derived class Cat
class Cat extends Animalsound {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test polymorphism
public class ch50_polmorphism {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animalsound myDog = new Dogs();
        Animalsound myCat = new Cat();

        // Calling the makeSound() method
        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow
    }
}
