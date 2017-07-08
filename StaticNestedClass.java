package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
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
