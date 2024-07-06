package com.company;
//Recursion when a function call itself
//Base Case: The condition under which the recursion stops.
//Recursive Case: The part of the function that includes the recursive call to itself.
//Stack Overflow: A potential issue if the recursion doesn't terminate or the stack depth exceeds the limit.



public class ch7_recursion {

    //recursive method to find the factorial
    public static int factorial(int n){
        //Base case: factorial of 0 and 1 is 1
        if(n==0 || n==1){
            return 1;
        }
        //Recursive cae : n* factorial(n-1);
        return  n*factorial(n-1);




    }
    public static void  main(String[] args){
        int number =5;
        int result= factorial(number);
        System.out.println("The factorial "+number+"is "+result);

    }
}
