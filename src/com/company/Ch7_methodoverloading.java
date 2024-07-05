package com.company;

public class Ch7_methodoverloading {
    //method overloading means two method have the same name but different parameter list

    int mult(int x , int y){
        int multiplication =x*y;
        return multiplication;
    }

    double mult(double u, double i){
        double multiplication=u*i;
        return multiplication;
    }
    public static void main(String[] args){

        //make a object from the above two classes
        Ch7_methodoverloading obj1=new Ch7_methodoverloading();
        int h=obj1.mult(4,5);
        System.out.println(h);
        double j= obj1.mult(7, 9);
        System.out.println(j);


    }
}
