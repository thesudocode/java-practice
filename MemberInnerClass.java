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
        MemberInnerClass.RealMemberInnerClass rmic = mic.new RealMemberInnerClass();
        rmic.printMsg();
    }
}
