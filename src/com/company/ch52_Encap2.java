package com.company;
class Area{
    int lenght;
    int breadth;
    //constructor to initialize the field
    Area(int lenght, int breadth){
        this.breadth=breadth;
        this.lenght=lenght;
    }

    //method to calculate the area
    public void getArea(){
        int area=lenght*breadth;
        System.out.println("the Area is ="+area);
    }
}
public class ch52_Encap2 {
    public static void main(String[] args){
        Area rectangle=new Area(34,4);
         rectangle.getArea();


    }
}
