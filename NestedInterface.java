package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
 */

interface Interface{
    void dontshow();
    interface AnotherInterface{
        void show();
    }
}
public class NestedInterface implements Interface.AnotherInterface {


    public void show() {
        System.out.println("Shown");
    }

    public static void main(String[] args){
        Interface.AnotherInterface ni = new NestedInterface(); //upcasting
        ni.show();
    }
}
