package com.company;
class employee {
    double salary;

    employee() {
        System.out.print("i amm the constructur of the parent class ");
    }

    employee(int a) {
        System.out.println("i am the parameterized constructure fromm the super class");
    }

}

class employee2 extends employee{
    double salary;
    employee2(){
        super(0);
        System.out.println("i am the constructor of the employee 2");
    }


}
public class Constructor_inhertence {
    public static void main(String[] args){

        employee2 obj=new employee2();


    }
}
