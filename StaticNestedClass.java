package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
 */
/*
A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.
- It can access static data members of outer class including private.
- Static nested class cannot access non-static (instance) data member or method.
*/
public class StaticNestedClass {

    static private int data = 3;

    static class ClassName{
        void print(){
            System.out.println(data);
        }
    }

    public static void main(String[] args){
        StaticNestedClass.ClassName cn = new StaticNestedClass.ClassName();
        cn.print();
    }
}
