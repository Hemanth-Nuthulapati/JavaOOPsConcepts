package com.hemanth.polymorphism;

public class Square extends Shapes{
    //this will run when object of square is created

    @Override
    void area() {
        System.out.println("area = Math.pow(side, 2)");
    }
}
