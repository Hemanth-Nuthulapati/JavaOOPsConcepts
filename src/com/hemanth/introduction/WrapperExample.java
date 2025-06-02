package com.hemanth.introduction;
// this code has wrapper classes & static and final(in variables) keywords
public class WrapperExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 30; //primitive data types
        //Wrapper Classes
        Integer num = 25;
        String name = "ara - ara";
        Character ch = 'c';
        // wrapper classes have many in-built methods, that is the reason why they are used.
        //Ex:- Integer, String, Character ...etc

        A obj = new A("Hemanth");
        //obj.NUM = 30; // ---> this gives error because, final fields cannot be modified
        System.out.println(obj.NUM);

        final A obj11 = new A("monkey");
        obj11.name = "donkey";
        //in above name can be modified, because name is non-final field

        //obj11 = new A("new object");
        // the above line throws error because obj11 is being reassigned to new object
    }
}

class A{
    final int NUM = 10;
    String name;
    A(String name){
        this.name = name;
    }
}