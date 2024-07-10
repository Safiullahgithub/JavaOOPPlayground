package com.company;
class A{
    int a;
    void set_A(int x){
        a=x;
        System.out.println("Sitting a value to x=" +x);
    }
}

class B extends A{
    int b;
    void set_B(int x){
        b=x;
        System.out.println("Sitting b to y ="+x);
    }
}

class C extends A{
    int c;
    void set_C(int x){
        c=x;
        System.out.println("Sitting x value to c="+c);
    }

}




public class HierarchicalInheritance {
    public static void main(String[] args){
        C obj1=new C();
        obj1.set_C(13);
        obj1.set_A(45);
        B obj2=new B();
        obj2.set_B(46);
        obj2.set_A(67);

    }

}
