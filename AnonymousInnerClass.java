package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
 */

abstract class Person{
    abstract void eat();
}
public class AnonymousInnerClass {

    public static void main(String args[]){

        Person p = new Person(){
          void eat(){
              System.out.println("Eating");
          }
        };

        p.eat();
    }
}
