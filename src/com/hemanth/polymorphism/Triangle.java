package com.hemanth.polymorphism;

public class Triangle extends Shapes{
    //this is executed when triangle object is called

    @Override
    void area() {
        System.out.println("Area = 0.5 * base * height");
    }
}
