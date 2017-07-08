package com.iamoperand.javaConcepts;

/**
 * Created by iamoperand on 8/7/17.
 */
public class MemberInnerClass {

    class RealMemberInnerClass {

        void printMsg(){
            System.out.println("Printing message");
        }
    }

    public static void main(String args[]){
        MemberInnerClass mic = new MemberInnerClass();

        /*
        Left side always have class name
        */
        /*
        Right side always have objectInstance.method() in case of method
        But in this case, it has to have a new instance of the class. Thus objectInstance. new ClassName
        */
        MemberInnerClass.RealMemberInnerClass rmic = mic.new RealMemberInnerClass();
        rmic.printMsg();
    }
}
