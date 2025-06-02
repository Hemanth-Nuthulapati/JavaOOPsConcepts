package com.hemanth.accessModifier;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        A a = new A(7, "Hemanth");
//        System.out.println(a.num);
        //it can be accessed when it is declared with public,
        // default and protected. since "num" is being accessed in same package.
        //if you want to access num when it is declared via private keyword then it can be
        //accessed via getter methods.(like getNum). if you want to modify the private
        // field then you have to implement a setter methods.

        System.out.println(a.getNum()); // when variable is declared with private



    }
}
