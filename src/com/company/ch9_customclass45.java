package com.company;

class Cylinder {
    private int radius;
    private float height;

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter for height
    public float getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(float height) {
        this.height = height;
    }
}

public class ch9_customclass45 {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();

        // Use setters to set the values
        obj1.setHeight(56.0f);
        obj1.setRadius(78);

        // Use getters to get the values and print them
        System.out.println("Height: " + obj1.getHeight());
        System.out.println("Radius: " + obj1.getRadius());
    }
}
