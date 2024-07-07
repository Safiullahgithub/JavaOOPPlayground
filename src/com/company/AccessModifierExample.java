package com.company;

// Public class accessible from anywhere
public class AccessModifierExample {

    // Public variable accessible from anywhere
    public int publicVar;

    // Constructor with public access
    public AccessModifierExample(int publicVar) {
        this.publicVar = publicVar;
    }

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method. publicVar = " + publicVar);
    }

    // Protected variable accessible within the same package and subclasses
    protected int protectedVar;

    // Protected method accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method. protectedVar = " + protectedVar);
    }

    // Package-private (default) variable accessible within the same package
    int packagePrivateVar;

    // Package-private method accessible within the same package
    void packagePrivateMethod() {
        System.out.println("This is a package-private method. packagePrivateVar = " + packagePrivateVar);
    }

    // Private variable accessible only within this class
    private int privateVar;

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method. privateVar = " + privateVar);
    }

    public static void main(String[] args) {
        // Creating an instance of AccessModifierExample
        AccessModifierExample example = new AccessModifierExample(10);

        // Accessing public members
        example.publicMethod();

        // Accessing protected members
        example.protectedVar = 20;
        example.protectedMethod();

        // Accessing package-private members
        example.packagePrivateVar = 30;
        example.packagePrivateMethod();

        // Accessing private members
        example.privateVar = 40;
        example.privateMethod();
    }
}
