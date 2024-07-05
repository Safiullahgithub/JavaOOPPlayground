package com.company;

public class Ch7_method {
    //meethod add to add two numbers
    //static method belongs to class , not to their instances
    //we cannot create obj when calling the static class method
   int add(int a, int b){
        int sum= a+b;
        return sum;
    }
    public static <ch7_Method> void main(String[] args){

     Ch7_method obj= new Ch7_method();
     int k=obj.add(3,6);
     System.out.println(k);






    }



}
