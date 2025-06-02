package com.hemanth.polymorphism;

public class Circle extends Shapes{
    // this will run when the object of circle is created
    //this is the overriding method

    @Override
    void area() {
        System.out.println("Area is pi * Math.pow(r, 2)");
    }
}
