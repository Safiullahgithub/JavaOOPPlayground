package com.company;
 class Animal{  // superclass
     String name;
     public void eat(){//super method
         System.out.println("The animal can eat food");
     }
 }
 //subclass
class  Dog extends Animal {
     String bread;

     //overide the method of the superclass
     public void eat() {
         System.out.println("this dog can eat dog food");
     }
     //subclass own method
     public void bark(){
         System.out.println("The dork is barking");
     }
 }
public class Inheriitence47 {
     public static void main(String[] args){
         //creating an object of the subclass
         Dog mydog=new Dog();
         mydog.name="buddy"; //inherited fiield
         mydog.bread=" khantwo"; //subclass
         System.out.println("Dog name"+mydog.name);
         System.out.print("Dog bread"+mydog.bread);

         //calling the overding methed of the sublass
         mydog.eat();
         mydog.bark();
     }


}
