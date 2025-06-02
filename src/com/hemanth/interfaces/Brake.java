package com.hemanth.interfaces;
//Note points:---
//by default methods in interface are abstract

public interface Brake {
    int b = 100; //members or fields in interface are final and static, by default...
    void brake();

    //if you want to create a normal method (not abstract) in interface then
    // 1) create a method using default keyword.
    // 2) create a method using static, because static methods cannot be overridden so
    //    it does need an implementation

    // 1...
    default void message1(){
        System.out.println("Hey!!!");
    }
    //2...
    static void message2(){
        System.out.println("Hello😁😁😁");
    }
}
