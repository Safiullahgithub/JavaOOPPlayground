package com.company;

public class VarargsExample {
    //VarArgs is denoted by ...
    //it allowed many argument even zero
    // this is useful when the number of the arguments is not specified
    public static void printnumber(int...numbers){
        System.out.println("Number of arguments" + numbers.length);
        for (int num:numbers){
            System.out.println(num+" ");

        }
        System.out.println();
    }

    public  static  void  main(String[] args){
        //calling printnumber with different arguments
//        int... numbers means that the method can accept zero or more integers.
//        Internally, numbers is treated as an array of integers
        printnumber(3);
        printnumber(4);
        printnumber(7);
        printnumber();

    }
}
