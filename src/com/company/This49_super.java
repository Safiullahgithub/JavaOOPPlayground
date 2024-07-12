package com.company;

class Teacher{
    private String name;
    private int salary;

    //method
    public Teacher(String name, int salary){
        this.name=name;
        this.salary=salary;

    }

    public Teacher() {
        name="khan";
        salary=4500;
    }

    public void display(){
        System.out.println("The name of the teacher is = "+this.name);
        System.out.println("The salary of the teacher is = "+this.salary);
    }

}
public class This49_super {
     public static void main(String[] args) {
         Teacher obj=new Teacher();
         obj.display();



    }

}
