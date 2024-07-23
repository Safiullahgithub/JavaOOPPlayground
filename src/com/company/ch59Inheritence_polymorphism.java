package com.company;
//define the interface
 interface Shape {
     void draw();
     double area();
 }
 //implement the interface in different class
class Circle implements Shape{
     private double radius;
     public Circle(double radius){
         this.radius=radius;
     }
     //override the above interface method
     @Override
     public void draw(){
         System.out.println(" Draw the circle ");

     }
     @Override
     public double area(){
        return  Math.PI*radius*radius;
     }
 }
class Recatngle implements Shape {
     private double width;
     private double lenght;

     public Recatngle(double width, double length){
         this.width=width;
         this.lenght=lenght;
     }
     @Override
    public void draw(){
         System.out.println("Rectangle is Draw");
     }

     @Override
    public double area(){
         return width*lenght;
     }

}
public class ch59Inheritence_polymorphism {
    public static void main(String[] args) {
        //make an instances of the class
        Shape myobj=new Circle(6);
        Shape objjh=new Recatngle(3,5);
        myobj.draw();
        
        System.out.println("Area of the circle is "+myobj.area());



    }
}
