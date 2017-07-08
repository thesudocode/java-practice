package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
 */


/*
    A class i.e. created inside a method is called local inner class in java
*/
public class LocalInnerClass {
    private int data = 30;

    void display(){

        class LocalClass{
            void print(){
                System.out.println(data);
            }
        }

        LocalClass l = new LocalClass();
        l.print();
    }

    public static void main(String[] args){
        LocalInnerClass lic = new LocalInnerClass();
        lic.display();
    }
}
