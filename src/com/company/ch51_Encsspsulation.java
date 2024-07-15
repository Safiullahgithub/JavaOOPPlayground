package com.company;

class Person{
    //java parogramm to implement encapsulation
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ch51_Encsspsulation {

    public static void main(String[] args){
        //make an object from the person class
        Person obj=new Person();
        obj.setName("jone");
        obj.setAge(45);
        System.out.println("the name of the person is "+obj.getName());
        System.out.println("the age of the person is "+obj.getAge());

    }
}
